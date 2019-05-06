package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.UserCollectProject;

public interface UserCollectProjectMapper {
	public void projectInsert(UserCollectProject userCollectProject);

	public List<UserCollectProject> projectSelect(UserCollectProject userCollectProject);

	public void projectDelete(UserCollectProject userCollectProject);

}
