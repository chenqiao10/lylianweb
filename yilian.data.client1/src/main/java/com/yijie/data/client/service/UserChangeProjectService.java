package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserChangeProject;

public interface UserChangeProjectService {

	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject);

	public Integer userCheProAdd(UserChangeProject userChangeProject);

	public Integer userCheProDelete(UserChangeProject userChangeProject);

}
