package com.yijie.yilian.client.service;

import java.util.List;

import com.yijie.yilian.client.model.UserCollectProject;

//我的收藏
public interface UserCollectProjectService {

	public Integer userColProAdd(UserCollectProject userCollectProject);

	public Integer userColProDelete(UserCollectProject userCollectProject);

	List<UserCollectProject> UserCollectProjecttable(UserCollectProject uesrCollectProject);

	// 收藏项目条数
	public Integer userColProCount(UserCollectProject userCollectProject);

}
