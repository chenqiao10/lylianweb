package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.UserChangeProject;

public interface UserChangeProjectMapper {
	//数据插入
	public void projectInsert(UserChangeProject userChangeProject);
	//数据查询
	public List<UserChangeProject> projectSelect(UserChangeProject userChangeProject);
	//数据删除
	public void projectDelete(UserChangeProject userChangeProject);
	//数据条数
	public  Integer  userChangeProCount(UserChangeProject userChangeProject);
}
