package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.UserHandleService;
import com.yijie.yilian.client.utils.RedisUtil;
import com.yijie.yilian.client.utils.Uuid;

/**
 * @描述 用户功能块
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/userHandle")
public class UserHandleController {

	@Autowired
	private UserHandleService userHandleService;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	/**
	 * @描述 用户拦截
	 * @param user
	 * @return
	 */
	@RequestMapping("/toLogin")
	public Map<String, Object> toLogin() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", 0);
		result.put("msg", "请先登录");
		return result;
	}

	/**
	 * @描述 用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/userLogin")
	public Map<String, Object> userLogin(@RequestBody User user) {
		Map<String, Object> result = new HashMap<String, Object>();
//		String msg = null;
		// Shiro认证登录
		Subject subject = SecurityUtils.getSubject();
		Md5Hash hash = new Md5Hash(user.getPassword(), user.getNum(), 2);
		AuthenticationToken token = new UsernamePasswordToken(user.getNum(), hash.toString());
		try {
			subject.login(token);
			User u = (User) subject.getPrincipal();
			if (u.getAudit() != 1) {
				result.put("code", 0);
				result.put("msg", "审核中");
			} else {
				result.put("code", 1);
				result.put("user", u);
				result.put("msg", "登录成功");
			}
			return result;
		} catch (UnknownAccountException e) {
			result.put("code", 0);
			result.put("msg", "账户不存在");
			return result;
		} catch (IncorrectCredentialsException e) {
			result.put("code", 0);
			result.put("msg", "密码错误");
			return result;
		}
	}

	/**
	 * @描述 用户注册（个人）
	 * @param user
	 * @return
	 */
	@RequestMapping("/userRegistForOwn")
	public Map<String, Object> userRegistForOwn(@RequestBody User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		Md5Hash hash = new Md5Hash(user.getPassword(), user.getNum(), 2);
		user.setUuid(Uuid.getUuid());
		user.setPassword(hash.toString());
		user.setAudit(1);
		user.setLevel(0);
		Integer code = userHandleService.userRegist(user);
		// 注册给积分积分
		if (code != 0 && user.getInviteUUid() != null) {
			User user1 = new User();
			user1.setUuid(user.getInviteUUid());
			userHandleService.scoreAdd(user1, 10);
		}
		result.put("code", code);
		return result;
	}

	/**
	 * @描述 用户注册（企业）
	 * @param user
	 * @return
	 */
	@RequestMapping("/userRegistForComplane")
	public Map<String, Object> userRegistForComplane(@RequestBody User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		Md5Hash hash = new Md5Hash(user.getPassword(), user.getNum(), 2);
		user.setUuid(Uuid.getUuid());
		user.setPassword(hash.toString());
		// 企业账户默认审核中
		user.setAudit(2);
		user.setLevel(1);
		user.setUuid(Uuid.getUuid());
		Integer code = userHandleService.userRegist(user);
		// 注册给积分积分
		if (code != 0 && user.getInviteUUid() != null) {
			User user1 = new User();
			user1.setUuid(user.getInviteUUid());
			userHandleService.scoreAdd(user1, 10);
		}
		result.put("code", code);
		return result;
	}

	/**
	 * @描述 验证用户账号是否已注册（如果已存在返回错误编码0，不存在返回成功编码1）
	 * @param num
	 * @return 0为存在1不存在
	 */
	@RequestMapping("/userPhoneExist")
	public Map<String, Object> userPhoneExist(@RequestBody String num) {
		System.err.println(num);
		Map<String, Object> result = new HashMap<String, Object>();
		User user = userHandleService.userPhoneExist(num);
		System.out.println(user);
		if (user == null) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
			result.put("msg", "号码已经存在");
		}
		return result;

	}

	/**
	 * @ 用户信息修改
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/userUpdate")
	public Map<String, Object> userUpdate(@RequestBody User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (user.getPassword() != null && user.getNum() != null) {
				Md5Hash hash = new Md5Hash(user.getPassword(), user.getNum(), 2);
				user.setPassword(hash.toString());
			}
			Integer code = userHandleService.userUpdate(user);
			map.put("code", code);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("msg", "系统出错");
			map.put("code", 0);
		}
		return map;
	}

	/**
	 * 用戶总数
	 * 
	 * @param user
	 * @return
	 */

	@RequestMapping("/userCount")
	public Map<String, Object> userCount(@RequestBody User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Integer count = userHandleService.userCount(user);
			map.put("count", count);
			map.put("code", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("msg", "系统出错");
			map.put("code", 0);
		}
		return map;
	}

	@RequestMapping("/userQuery")
	public Map<String, Object> userQuery(@RequestBody User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (user.getId() != null && user.getNum()!=null) {
				User use = userHandleService.userLogin(user);
				result.put("user", use);
			} else {
				result.put("msg", "请先登录....");
			}
			return result;
		} catch (UnknownAccountException e) {
			result.put("code", 0);
			result.put("msg", "账户不存在");
			return result;

		}
	}

	/**
	 * @描述 用户短信登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/userMsgLogin")
	public Map<String, Object> userMsgLogin(String num, String yzm) {
		User user = new User();
		Map<String, Object> result = new HashMap<String, Object>();
		RedisUtil redisUtil = new RedisUtil();
		try {
			String key = "pr:" + num;
			String phoneRev = (String) redisUtil.get(redisTemplate, key);// 缓存中的验证码
			System.out.println(phoneRev);
			System.out.println(num);
			user.setNum(num);
			User u = userHandleService.userLogin(user);
			if (phoneRev != null) {
				if (phoneRev.equals(yzm)) {
					if (u != null) {
						if (u.getAudit() != 1) {
							result.put("msg", "审核中");
						} else {
							result.put("user", u);
							result.put("msg", "登录成功");
						}
					} else {
						result.put("msg", "账户不存在");
					}
				} else {
					result.put("msg", "验证码错误");
				}
			} else {
				result.put("msg", "验证码无效");
			}
			result.put("code", 1);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "验证码错误");
			return result;
		}
		return result;
	}
}
