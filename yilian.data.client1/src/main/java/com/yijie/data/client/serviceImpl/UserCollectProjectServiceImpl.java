package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yijie.data.client.dao.UserCollectProjectMapper;
import com.yijie.data.client.model.UserCollectProject;
import com.yijie.data.client.service.UserCollectProjectService;

@Service
@Transactional
public class UserCollectProjectServiceImpl implements UserCollectProjectService {

	@Autowired
	private UserCollectProjectMapper userCollectProjectMapper;

	@Override
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectProject) {
		try {
			List<UserCollectProject> list = userCollectProjectMapper.projectSelect(userCollectProject);
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

	@Override
	public Integer collectProCount(UserCollectProject userCollectProject) {
		// TODO 自动生成的方法存根
		try {
			return userCollectProjectMapper.collectProCount(userCollectProject);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

}
