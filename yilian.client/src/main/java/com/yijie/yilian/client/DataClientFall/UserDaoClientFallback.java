package com.yijie.yilian.client.DataClientFall;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.UserDao;
import com.yijie.yilian.client.model.User;
@Component
public class UserDaoClientFallback implements UserDao{

	@Override
	public User userLogin(User user) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public User userTable(User user) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer userRegist(User user) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer userUpdate(User user) {
		// TODO 自动生成的方法存根
		return null;
	}

}
