package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.UserChangeProject;
import com.yijie.data.client.service.UserChangeProjectService;

@RestController
@RequestMapping("/user")
public class UserChangeProjectController {

	@Autowired
	private UserChangeProjectService userChangeProjectService;

	// 用户已交换项目列表
	@RequestMapping("/userCheProTable")
	public List<UserChangeProject> userCheProTable(@RequestBody UserChangeProject userChangeProject) {
		return userChangeProjectService.userCheProTable(userChangeProject);
	}

	// 新添用户已交换项目
	@RequestMapping("/userCheProAdd")
	public Integer userCheProAdd(@RequestBody UserChangeProject userChangeProject) {
		return userChangeProjectService.userCheProAdd(userChangeProject);
	}

	// 用户已交换项目删除
	@RequestMapping("/userCheProDelete")
	public Integer userCheProDelete(@RequestBody UserChangeProject userChangeProject) {
		return userChangeProjectService.userCheProDelete(userChangeProject);
	}

}
