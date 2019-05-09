package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.UserDao;
import com.yijie.yilian.client.model.User;
@Component
public class UserDaoClientFallBack implements UserDao{

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
		return 0;
	}

	@Override
	public Integer userUpdate(User user) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Integer userCount(User user) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Integer userDeleteAll(List<User> list) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
