package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserChangeProject;

public interface UserChangeProjectService {
	// 交换列表
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject);

	// 添加交换
	public Integer userCheProAdd(UserChangeProject userChangeProject);

	// 删除交换记录
	public Integer userCheProDelete(UserChangeProject userChangeProject);

	// 交换量
	public Integer userCheProCount(UserChangeProject userChangeProject);
}
