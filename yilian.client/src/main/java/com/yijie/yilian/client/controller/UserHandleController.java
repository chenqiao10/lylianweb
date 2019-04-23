package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.UserHandleService;
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
	
	/**
	 * @描述 用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/userLogin")
	public Map<String,Object> userLogin(@RequestBody User user){
		Map<String,Object> result = new HashMap<String,Object>();
		String msg = null;
		User u = userHandleService.userLogin(user);
		if(u == null){
			result.put("code", 0);
			msg = "账户不存在或密码错误！";
		}else if(u.getAudit() != 1){
			result.put("code", 0);
			msg = "审核中！";
		}else{
			result.put("code", 1);
			msg = "登录成功！";
		}
		result.put("user", u);
		result.put("msg", msg);
		return result;
	}
	
	
	/**
	 * @描述 用户注册（个人）
	 * @param user
	 * @return
	 */
	@RequestMapping("/userRegistForOwn")
	
	public Map<String,Object> userRegistForOwn(@RequestBody User user){
		Map<String,Object> result = new HashMap<String,Object>();
		//个人账户默认审核通过
		user.setUuid(Uuid.getUuid());
		user.setAudit(1);
		Integer code = userHandleService.userRegist(user);
		result.put("code", code);
		return result;
	}
	
	/**
	 * @描述 用户注册（企业）
	 * @param user
	 * @return
	 */
	@RequestMapping("/userRegistForComplane")
	
	public Map<String,Object> userRegistForComplane(@RequestBody User user){
		Map<String,Object> result = new HashMap<String,Object>();
		user.setUuid(Uuid.getUuid());
		//企业账户默认审核未通过
		user.setAudit(0);
		Integer code = userHandleService.userRegist(user);
		result.put("co-ide", code);
		return result;
	}
	
	
	/**
	 * @描述 验证用户账号是否已注册（如果已存在返回错误编码0，不存在返回成功编码1）
	 * @param num
	 * @return 0为存在1不存在
	 */
	@RequestMapping("/userPhoneExist")
	public Map<String,Object> userPhoneExist(@RequestBody String num){
		Map<String,Object> result = new HashMap<String,Object>();
		User user = userHandleService.userPhoneExist(num);
		if(user==null) {
		result.put("code", 1);
		
		}else {
			result.put("code", 0);
			result.put("msg", "号码已经存在");
		}
		return result;
	
	}

	}
