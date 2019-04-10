package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Projects;

public interface ProjectsMapper {

	// 项目查询
	public List<Projects> projectSelect(Projects projects);

	// 项目添加
	public void projectInsert(Projects projects);

	// 项目更新
	public void projectUpdate(Projects projects);

	// 项目删除
	public void projectDelete(Projects projects);

}
