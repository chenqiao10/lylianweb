package com.yijie.yilian.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.UserCheProDao;
import com.yijie.yilian.client.model.UserChangeProject;
import com.yijie.yilian.client.service.UserChangeProjectService;

@Service
public class UserChangeProjectServiceImpl implements UserChangeProjectService {
	
	@Autowired
	private UserCheProDao userCheProDao;

	@Override
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject) {
		/**
		 *
		 * 判断是否存在* 存在就redis读取*不存在访问数据库数据然写入redis*
		 */
		return userCheProDao.userCheProTable(userChangeProject);
	}

	@Override
	public Integer userCheProAdd(UserChangeProject userChangeProject) {
		/**
		 * 往数据写也往redis写
		 */
		return userCheProDao.userCheProAdd(userChangeProject);
	}

	@Override
	public Integer userCheProDelete(UserChangeProject userChangeProject) {
		 
		return userCheProDao.userCheProDelete(userChangeProject);

	}

	@Override
	public Integer userCheProCount(UserChangeProject userChangeProject) {
		// TODO 自动生成的方法存根
		return userCheProDao.userCheProCount(userChangeProject);
	}

}
