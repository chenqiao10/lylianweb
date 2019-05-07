package com.yijie.yilian.client.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.ProjectDesign;
import com.yijie.yilian.client.model.Projects;
import com.yijie.yilian.client.service.ProjectService;
import com.yijie.yilian.client.utils.Uuid;

/**
 * @描述 项目执行模块
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	/**
	 * @描述 创建项目
	 * @param projects
	 * @return
	 */
	@RequestMapping("/projectBuild")
	public Map<String,Object> projectBuild(@RequestBody Projects projects){
		projects.setUuid(Uuid.getUuid());
		projects.setDate(new Date());
		Map<String,Object> result = new HashMap<String, Object>();
		Integer code = projectService.projectBuild(projects);
		result.put("code", code);
		result.put("uuid", projects.getUuid());//项目uuid
		return result;
	}
	
	/**
	 * @描述 项目列表
	 * @param projects
	 * @return
	 */
	@RequestMapping("/projectTable")
	public Map<String,Object>   projectTable(@RequestBody Projects projects){
		System.out.println(projects);
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			List<Projects> projectTable = projectService.projectTable(projects);
			result.put("projectTable", projectTable);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	/**
	 * @描述 项目详细信息
	 * @param projects
	 * @return
	 */
	@RequestMapping("/projectMessage")
	public Map<String,Object> projectMessage(@RequestBody Projects projects){
		Map<String,Object> result = new HashMap<String, Object>();
		Projects pro = new Projects();
		try {
			Projects project = projectService.projectMessage(projects);
			//点击量
			pro.setId(project.getId());
			pro.setClick_count(project.getClick_count()+1);
			projectService.projectUpdate(pro);
			result.put("projectMessage", project);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 项目信息更新
	 * @param projects
	 * @return
	 */
	@RequestMapping("/projectUpdate")
	public Map<String,Object> projectUpdate(@RequestBody Projects projects){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = projectService.projectUpdate(projects);
			result.put("projectMessage", code);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 项目删除
	 * @param projects
	 * @return
	 */
	@RequestMapping("/projectDelete")
	public Map<String,Object> projectDelete(@RequestBody Projects projects){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = projectService.projectDelete(projects);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 项目附件添加
	 * @param projectDesigns
	 * @return
	 */
	@RequestMapping("/projectDesignAdd")
	public Map<String,Object> projectDesignAdd(@RequestBody List<ProjectDesign> projectDesigns){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = projectService.projectDesignAdd(projectDesigns);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 项目附件修改
	 * @param projectDesigns
	 * @return
	 */
	@RequestMapping("/projectDesignUodate")
	public Map<String,Object> projectDesignUodate(@RequestBody List<ProjectDesign> projectDesigns){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = projectService.projectDesignUpdate(projectDesigns);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 项目附件删除
	 * @param projectDesigns
	 * @return
	 */
	@RequestMapping("/projectDesignDelete")
	public Map<String,Object> projectDesignDelete(@RequestBody ProjectDesign projectDesign){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = projectService.projectDesignDelete(projectDesign);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

}
