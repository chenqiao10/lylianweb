package com.yijie.yilian.client.daoClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.UserDaoClientFallback;
import com.yijie.yilian.client.model.User;

/**
 * 用户数据接口
 * 
 * @author chenqiao
 *
 */
@FeignClient(name="yijie.zuul.api", fallback=UserDaoClientFallback.class)
public interface UserDao {
	//用户登录
	@RequestMapping("yilianData/user/userLogin")
	public User userLogin(User user);

	//用户列表
	@RequestMapping("yilianData/user/userTable")
	public User userTable(User user);

	//用户注册
	@RequestMapping("yilianData/user/userRegist")
	public Integer userRegist(User user);

	//用户信息修改
	@RequestMapping("yilianData/user/userUpdate")
	public Integer userUpdate(User user);

}
