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
	public Projects projectMessage(@RequestBody Projects pro){
		return projectService.projectMessage(pro);
	}
	// 项目列表
	@RequestMapping("/projectTable")
	public List<Projects> projectTable(@RequestBody Projects pro){
		return projectService.projectTable(pro);
	}

	// 项目创建
	@RequestMapping("/projectBuild")
	public Integer projectBuild(@RequestBody Projects pro){
		return projectService.projectBuild(pro);
	}

	// 项目删除
	@RequestMapping("/projectDelete")
	public Integer projectDelete(@RequestBody Projects pro){
		return projectService.projectDelete(pro);
	}

	// 项目信息更新
	@RequestMapping("/projectUpdate")
	public Integer projectUpdate(@RequestBody Projects pro){
		return projectService.projectUpdate(pro);
	}

	// 项目附件添加
	@RequestMapping("/projectDesignAdd")
	public Integer projectDesignAdd(@RequestBody List<ProjectDesign> projectDesign){
		return projectService.projectDesignAdd(projectDesign);
	}

	// 项目附件修改
	@RequestMapping("/projectDesignUpdate")
	public Integer projectDesignUpdate(@RequestBody List<ProjectDesign> projectDesign){
		return projectService.projectDesignUpdate(projectDesign);
	}

	// 项目附件删除
	@RequestMapping("/projectDesignDelete")
	public Integer projectDesignDelete(@RequestBody ProjectDesign projectDesign){
		return projectService.projectDesignDelete(projectDesign);
	}
	// 项目删除
	@RequestMapping("/projectCount")
	public Integer projectCount(@RequestBody Projects pro){
		return projectService.projectCount(pro);
	}
}
