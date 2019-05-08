package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.UserDaoClientFallBack;
import com.yijie.yilian.client.model.User;

/**
 * 用户数据接口
 * 
 * @author chenqiao
 *
 */

@FeignClient(name="yijie.zuul.api", fallback=UserDaoClientFallBack.class)

public interface UserDao {
	// 用户登录
	@RequestMapping("yilianData/user/userLogin")
	public User userLogin(User user);

	// 用户列表
	@RequestMapping("yilianData/user/userTable")
	public User userTable(User user);

	// 用户注册
	@RequestMapping("yilianData/user/userRegist")
	public Integer userRegist(User user);

	// 用户信息修改
	@RequestMapping("yilianData/user/userUpdate")
	public Integer userUpdate(User user);

	// 用户总数
	@RequestMapping("yilianData/user/userCount")
	public Integer userCount(User user);

	// 用户批量刪除
	@RequestMapping("yilianData/user/userDeleteAll")
	public Integer userDeleteAll(List<User> list);

}
