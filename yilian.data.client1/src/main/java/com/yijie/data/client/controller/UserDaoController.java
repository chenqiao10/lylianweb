package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.User;
import com.yijie.data.client.service.UserDaoService;

/**
 * @描述 用户信息数据操作
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/user")
public class UserDaoController {
	@Autowired
	private UserDaoService userDaoService;

	// 用户登录
	@RequestMapping("/userLogin")
	public User userLogin(@RequestBody User user) {
		return userDaoService.userLogin(user);
	}

	// 用户列表
	@RequestMapping("/userTable")
	public List<User> userTable(@RequestBody User user) {
		return userDaoService.userTable(user);
	}

	// 用户注册
	@RequestMapping("/userRegist")
	public Integer userRegist(@RequestBody User user) {

		return userDaoService.userRegist(user);
	}

	// 用户信息更新
	@RequestMapping("/userUpdate")
	public Integer userUpdate(@RequestBody User user) {
		return userDaoService.userUpdate(user);
	}

	// 用户注销
	@RequestMapping("/userDelete")
	public Integer userDelete(@RequestBody User user) {
		return userDaoService.userDelete(user);
	}

	// 用户总数
	@RequestMapping("/userCount")
	public Integer userCount(@RequestBody User user) {
		return userDaoService.userCount(user);
	}

	// 用户批量刪除
	@RequestMapping("/userDeleteAll")
	public Integer userDeleteAll(@RequestBody List<User> list) {
		return userDaoService.userDeleteAll(list);
	}
}
