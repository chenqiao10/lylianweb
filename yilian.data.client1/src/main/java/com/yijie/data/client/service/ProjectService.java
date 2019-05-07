package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.ProjectDesign;
import com.yijie.data.client.model.Projects;

public interface ProjectService {

	public Projects projectMessage(Projects projects);

	public List<Projects> projectTable(Projects projects);

	public Integer projectBuild(Projects projects);

	public Integer projectDelete(Projects projects);

	public Integer projectUpdate(Projects projects);

	// 项目附件添加
	public Integer projectDesignAdd(List<ProjectDesign> projectDesign);

	// 项目附件修改
	public Integer projectDesignUpdate(List<ProjectDesign> projectDesign);

	// 项目附件删除
	public Integer projectDesignDelete(ProjectDesign projectDesign);

	// 查询项目条数
	public Integer projectCount(Projects projects);

	// 批量删除
	public Integer projectDeleteAll(List<Projects> list);
}
