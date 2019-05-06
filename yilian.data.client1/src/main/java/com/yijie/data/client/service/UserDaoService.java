package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.User;

public interface UserDaoService {

	public User userLogin(User user);

	public List<User> userTable(User user);

	public Integer userRegist(User user);

	public Integer userUpdate(User user);

	public Integer userDelete(User user);

}
