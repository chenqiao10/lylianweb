package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.UserCollectProDao;
import com.yijie.yilian.client.model.UserCollectProject;
@Component
public class UserCollectDaoClientFallBack implements UserCollectProDao{

	@Override
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer userColProAdd(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Integer userColProDelete(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Integer userColProCount(UserCollectProject userCollectProject) {
		// TODO Auto-generated method stub
		return 0;
	}

}
