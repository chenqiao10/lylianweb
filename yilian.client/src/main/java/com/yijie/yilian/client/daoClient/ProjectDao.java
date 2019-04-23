package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.ProjectDesign;
import com.yijie.yilian.client.model.Projects;

/**
 * 项目信息接口
 * 
 * @author chenqiao
 *
 */
@FeignClient("yilian.data.client")
public interface ProjectDao {
	// 项目详细信息
	@RequestMapping("/project/projectMessage")
	public Projects projectMessage(Projects pro);

	// 项目列表
	@RequestMapping("/project/projectTable")
	public List<Projects> projectTable(Projects pro);

	// 项目创建
	@RequestMapping("/project/projectBuild")
	public Integer projectBuild(Projects pro);

	// 项目删除
	@RequestMapping("/project/projectDelete")
	public Integer projectDelete(Projects pro);

	// 项目修改
	@RequestMapping("/project/projectUpdate")
	public Integer projectUpdate(Projects pro);
	
	// 项目附件添加
	@RequestMapping("/project/projectDesignAdd")
	public Integer projectDesignAdd(List<ProjectDesign> projectDesign);
	
	// 项目附件修改
	@RequestMapping("/project/projectDesignUpdate")
	public Integer projectDesignUpdate(List<ProjectDesign> projectDesign);

	// 项目附件删除
	@RequestMapping("/project/projectDesignDelete")
	public Integer projectDesignDelete(ProjectDesign projectDesign);
}
