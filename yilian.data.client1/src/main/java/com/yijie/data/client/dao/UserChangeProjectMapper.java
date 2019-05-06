package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.UserChangeProject;

public interface UserChangeProjectMapper {

	public void projectInsert(UserChangeProject userChangeProject);

	public List<UserChangeProject> projectSelect(UserChangeProject userChangeProject);

	public void projectDelete(UserChangeProject userChangeProject);

}
