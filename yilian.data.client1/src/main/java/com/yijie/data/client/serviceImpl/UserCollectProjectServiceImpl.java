package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.UserCollectProjectMapper;
import com.yijie.data.client.model.UserCollectProject;
import com.yijie.data.client.model.UserCollectProject;
import com.yijie.data.client.service.UserCollectProjectService;
@Service
public class UserCollectProjectServiceImpl implements UserCollectProjectService {
	
	@Autowired
	private UserCollectProjectMapper userCollectProjectMapper;
	


	@Override
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectPro) {
		try {
			List<UserCollectProject> list = userCollectProjectMapper.projectSele(userCollectPro);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer userColProAdd(UserCollectProject userCollectProject) {
		try {
			userCollectProjectMapper.projectInsert(userCollectProject);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userColProDelete(UserCollectProject userCollectProject) {
		try {
			userCollectProjectMapper.projectDelete(userCollectProject);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
