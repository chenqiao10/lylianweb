package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.ProjectDesign;
import com.yijie.data.client.model.Projects;
import com.yijie.data.client.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectDaoController {
	@Autowired
	private ProjectService projectService;

	// 项目详细信息
	@RequestMapping("/projectMessage")
	public Projects projectMessage(@RequestBody Projects projects) {
		return projectService.projectMessage(projects);
	}

	// 项目列表
	@RequestMapping("/projectTable")
	public List<Projects> projectTable(@RequestBody Projects projects) {
		return projectService.projectTable(projects);
	}

	// 项目创建
	@RequestMapping("/projectBuild")
	public Integer projectBuild(@RequestBody Projects projects) {
		return projectService.projectBuild(projects);
	}

	// 项目删除
	@RequestMapping("/projectDelete")
	public Integer projectDelete(@RequestBody Projects projects) {
		return projectService.projectDelete(projects);
	}

	// 项目信息更新
	@RequestMapping("/projectUpdate")
	public Integer projectUpdate(@RequestBody Projects projects) {
		return projectService.projectUpdate(projects);
	}

	// 项目附件添加
	@RequestMapping("/projectDesignAdd")
	public Integer projectDesignAdd(@RequestBody List<ProjectDesign> projectDesign) {
		return projectService.projectDesignAdd(projectDesign);
	}

	// 项目附件修改
	@RequestMapping("/projectDesignUpdate")
	public Integer projectDesignUpdate(@RequestBody List<ProjectDesign> projectDesign) {
		return projectService.projectDesignUpdate(projectDesign);
	}

	// 项目附件删除
	@RequestMapping("/projectDesignDelete")
	public Integer projectDesignDelete(@RequestBody ProjectDesign projectDesign) {
		return projectService.projectDesignDelete(projectDesign);
	}

	// 项目
	@RequestMapping("/projectCount")
	public Integer projectCount(@RequestBody Projects pro) {
		return projectService.projectCount(pro);
	}

	// 项目批量删除
	@RequestMapping("/projectDeleteAll")
	public Integer projectDeleteAll(@RequestBody List<Projects> list) {
		return projectService.projectDeleteAll(list);
	}
}
