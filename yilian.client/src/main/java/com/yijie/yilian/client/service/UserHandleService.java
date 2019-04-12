package com.yijie.yilian.client.service;

import java.util.List;

import com.yijie.yilian.client.model.Projects;
import com.yijie.yilian.client.model.User;

/**
 * @描述 用户功能执行模块
 * @author Lucifer
 *
 */
public interface UserHandleService {
	
	//用户登录
	public User userLogin(User user);
	
	//用户注册
	public Integer userRegist(User user);
	
	//验证用户电话号码是否已使用
	public User userPhoneExist(String num);
	
	//用户信息修改
	public Integer userUpdate(User user);
	 
	
	

}
