package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.UserCollectProject;
import com.yijie.data.client.service.UserCollectProjectService;

@RestController
@RequestMapping("/user")
public class UserCollectProjectController {

	@Autowired
	private UserCollectProjectService userCollectProjectService;

	// 用户已收藏项目列表
	@RequestMapping("/userColProTable")
	public List<UserCollectProject> userColProTable(@RequestBody UserCollectProject userCollectProject) {
		return userCollectProjectService.userColProTable(userCollectProject);
	}

	// 新增用户已收藏项目
	@RequestMapping("/userColProAdd")
	public Integer userColProAdd(@RequestBody UserCollectProject userCollectProject) {
		return userCollectProjectService.userColProAdd(userCollectProject);
	}

	// 用户已收藏项目删除
	@RequestMapping("/userColProDelete")
	public Integer userColProDelete(@RequestBody UserCollectProject userCollectProject) {
		return userCollectProjectService.userColProDelete(userCollectProject);
	}
// 用户已收藏项目总数
	@RequestMapping("/userColProCount")
	public Integer userColProCount(@RequestBody UserCollectProject userCollectProject) {
		return userCollectProjectService.collectProCount(userCollectProject);
	}

}
