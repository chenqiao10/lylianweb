package com.yijie.yilian.client.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.UserDao;
import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.UserHandleService;

@Service
public class UserHandleServiceImpl implements UserHandleService {

	@Autowired
	private UserDao userDao;

	@Override
	public User userLogin(User user) {
		User u = userDao.userLogin(user);
		return u;
	}

	@Override
	public Integer userRegist(User user) {
		return userDao.userRegist(user);
	}

	@Override
	public User userPhoneExist(String num) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setNum(num);
		User user1 = userDao.userLogin(user);
		return user1;
	}

	@Override
	public Integer userUpdate(User user) {
		return userDao.userUpdate(user);
	}

	/**
	 * 添加人User, 添加积分值 score
	 * 
	 */
	@Override
	public Integer scoreAdd(User user, Integer score) {
		// TODO 自动生成的方法存根
		Integer result = null;
		User User1 = userDao.userLogin(user);
		if (User1 == null) {
			System.out.println(User1 == null);
		} else {
			Integer oldscore = User1.getBalance();
			Integer newscore = oldscore + score;
			user.setBalance(newscore);
			result = userDao.userUpdate(user);
		}
		return result;
	}

	/**
	 * 返回值result为0时余额不足为1时扣除成功
	 * 
	 */
	@Override
	public Integer scoreDel(User user, Integer score) {
		// TODO 自动生成的方法存根
		Integer result = null;
		User User1 = userDao.userLogin(user);
		if (User1 == null) {
			System.out.println(User1 == null);
		} else {
			Integer oldscore = User1.getBalance();
			if (oldscore >= score) {
				Integer newscore = oldscore + score;
				user.setBalance(newscore);
				result = userDao.userUpdate(user);
			} else {
				result = 0;
			}
		}
		return result;
	}

	@Override
	public Integer userCount(User user) {
		
		Integer	count =userDao.userCount(user);
		return count;
	}
}
