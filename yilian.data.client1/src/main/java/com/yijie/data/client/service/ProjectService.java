package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.ProjectDesign;
import com.yijie.data.client.model.Projects;

public interface ProjectService {

	public Projects projectMessage(Projects pro);

	public List<Projects> projectTable(Projects pro);

	public Integer projectBuild(Projects pro);

	public Integer projectDelete(Projects pro);

	public Integer projectUpdate(Projects pro);

	// 项目附件添加
	public Integer projectDesignAdd(List<ProjectDesign> projectDesign);

	// 项目附件修改
	public Integer projectDesignUpdate(List<ProjectDesign> projectDesign);

	// 项目附件删除
	public Integer projectDesignDelete(ProjectDesign projectDesign);
	//查询项目条数
	public Integer projectCount(Projects projects);
}
