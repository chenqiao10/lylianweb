package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.UserCheProDao;
import com.yijie.yilian.client.model.UserChangeProject;
@Component
public class UserCheProDaoClientFallBack implements UserCheProDao{
	@Override
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer userCheProDelete(UserChangeProject userChangeProject) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer userCheProAdd(UserChangeProject userChangeProject) {
		// TODO 自动生成的方法存根
		return null;
	}
     
}
