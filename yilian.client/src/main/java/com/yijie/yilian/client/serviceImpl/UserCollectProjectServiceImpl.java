package com.yijie.yilian.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.UserCollectProDao;
import com.yijie.yilian.client.model.UserCollectProject;
import com.yijie.yilian.client.service.UserCollectProjectService;
@Service
public class UserCollectProjectServiceImpl  implements UserCollectProjectService{
@Autowired
UserCollectProDao userCollectProDao;
	@Override
	public List<UserCollectProject> UserCollectProjecttable(UserCollectProject uesrCollectProject) {
		// TODO 自动生成的方法存根
		return userCollectProDao.userColProTable(uesrCollectProject);
	}
	/*@Override
	public UserCollectProject userColProMessage(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return userCollectProjectService.userColProMessage(userCollectProject);
	}*/
	@Override
	public Integer userColProAdd(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return userCollectProDao.userColProAdd(userCollectProject);
	}
	@Override
	public Integer userColProDelete(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return userCollectProDao.userColProDelete(userCollectProject);
	}
	

}
