package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserCollectProject;
import com.yijie.data.client.model.UserCollectProject;

public interface UserCollectProjectService {
	
	
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectPro);
	//添加收藏
	public Integer userColProAdd(UserCollectProject userCollectProject);
	//删除收藏
	public Integer userColProDelete(UserCollectProject userCollectProject);

}
