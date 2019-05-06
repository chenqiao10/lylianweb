package com.yijie.yilian.client.service;

import java.util.List;

import com.yijie.yilian.client.model.UserChangeProject;

/**
 * 用户项目
 * 
 * @author chenqiao
 *
 */
public interface UserChangeProjectService {

	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject);

	public Integer userCheProAdd(UserChangeProject userChangeProject);

	public Integer userCheProDelete(UserChangeProject userChangeProject);

}
