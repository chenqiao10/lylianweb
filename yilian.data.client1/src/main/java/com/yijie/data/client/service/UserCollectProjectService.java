package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserCollectProject;

public interface UserCollectProjectService {

	//项目收藏列表
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectProject);

	// 添加收藏
	public Integer userColProAdd(UserCollectProject userCollectProject);

	// 删除收藏
	public Integer userColProDelete(UserCollectProject userCollectProject);
  
	// 收藏条数
	public Integer collectProCount(UserCollectProject userCollectProject);
}
