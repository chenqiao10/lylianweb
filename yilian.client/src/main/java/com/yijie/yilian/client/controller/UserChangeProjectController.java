package com.yijie.yilian.client.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.Projects;
import com.yijie.yilian.client.model.UserChangeProject;
import com.yijie.yilian.client.service.ProjectService;
import com.yijie.yilian.client.service.UserChangeProjectService;

/**
 * 用户交互的项目
 * 
 * @author chenqiao
 *
 */
@RestController
@RequestMapping("/user")
public class UserChangeProjectController {
	@Autowired
	private UserChangeProjectService userChangeProjectService;
	@Autowired
	private ProjectService projectService;
	/**
	 * @ 用户项目交换列表
	 * @param userChangeProject
	 * @return
	 */
	@RequestMapping("/userCheProTable")
	public Map<String, Object> userCheProTable(@RequestBody UserChangeProject userChangeProject) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<UserChangeProject> list = userChangeProjectService.userCheProTable(userChangeProject);
			result.put("list", list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}

	}

	/**
	 * 添加用户项目交换记录
	 * 
	 * @param userChangeProject
	 * @return
	 */
	@RequestMapping("/userCheProAdd")
	public Map<String, Object> userCheProAdd(@RequestBody UserChangeProject userChangeProject) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			userChangeProject.setDate(new Date());
			Integer code = userChangeProjectService.userCheProAdd(userChangeProject);
			Projects pro=new Projects();
			pro.setUuid(userChangeProject.getPro_uuid());
			Projects pro1 = projectService.projectMessage(pro);//查询以前的交换量
			pro.setCha_count(pro1.getCha_count()+1);
			projectService.projectUpdate(pro);
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
	 * 用户交换项目记录删除
	 * @param userChangeProject
	 * @return
	 */
	@RequestMapping("/userCheProDelete")
	public Map<String, Object> userCheProDelete(@RequestBody UserChangeProject userChangeProject) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Integer code = userChangeProjectService.userCheProDelete(userChangeProject);
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
