package com.yijie.data.client.dao;

import java.util.List;
import java.util.Map;

import com.yijie.data.client.model.UserCollectProject;

public interface UserCollectProjectMapper {
	public void projectInsert(UserCollectProject userCollectProject);
	public List<UserCollectProject> projectSelect(UserCollectProject userCollectProject);
	public List<UserCollectProject> projectSele(UserCollectProject userCollectProject);
	public void projectDelete(UserCollectProject userCollectProject);
	public List<Map> projectSele1(UserCollectProject userCollectProject);
}
