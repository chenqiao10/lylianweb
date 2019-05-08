package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.UserMapper;
import com.yijie.data.client.model.User;
import com.yijie.data.client.service.UserDaoService;

@Service
public class UserDaoServiceImpl implements UserDaoService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User userLogin(User user) {
		try {
			List<User> users = userMapper.userSelect(user);
			if(users.size() == 0){
				return null;
			}else{
				return users.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer userRegist(User user) {
		try {
			userMapper.userInsert(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userUpdate(User user) {
		try {
			userMapper.userUpdate(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userDelete(User user) {
		try {
			userMapper.userDelete(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<User> userTable(User user) {
		try {
			List<User> list = userMapper.userSelect(user);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer userCount(User user) {
		// TODO 自动生成的方法存根
		try {
			return userMapper.userCount(user);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userDeleteAll(List<User> list) {
		// TODO 自动生成的方法存根
		try {
			return userMapper.userDeleteAll(list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

}
