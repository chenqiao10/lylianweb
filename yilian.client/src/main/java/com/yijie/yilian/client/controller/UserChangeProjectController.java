package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.UserChangeProject;
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
	Map<String, Object> result = new HashMap<String, Object>();

	// 用户已交换项目列表
	@RequestMapping("/userCheProTable")
	public  Map<String, Object> userCheProTable(@RequestBody UserChangeProject userChangeProject) {
		try{
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
 * 添加项目交换记录
 * @param userChangeProject
 * @return
 */
	@RequestMapping("/userCheProAdd")
	public Map<String, Object> userCheProAdd(@RequestBody UserChangeProject userChangeProject) {
		try {
			Integer code = userChangeProjectService.userCheProAdd(userChangeProject);
			
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	@RequestMapping("/userCheProDelete")
	public Map<String, Object> userCheProDelete(@RequestBody UserChangeProject userChangeProject) {
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
