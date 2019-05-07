package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.Admin;
import com.yijie.data.client.model.SuperAdmin;
import com.yijie.data.client.service.AdminService;
import com.yijie.data.client.service.SuperAdminService;

@RestController
@RequestMapping("/admin")
public class SuperAdminDaoController {
	@Autowired
	private SuperAdminService superAdminService;
	// 管理员列表查找
	@RequestMapping("/superAdminSelect")
	public List<SuperAdmin> adminSelect(@RequestBody SuperAdmin superAdmin) {
		return superAdminService.superAdminSelect(superAdmin);
	}

	// 管理员更新
	@RequestMapping("/superAdminUpdate")
	public Integer superAdminUpdate(@RequestBody SuperAdmin superAdmin) {
		return superAdminService.superAdminUpdate(superAdmin);
	}

	// 管理员删除
	@RequestMapping("/superAdminDelete")
	public Integer superAdminDelete(@RequestBody SuperAdmin superAdmin) {
		return superAdminService.superAdminDelete(superAdmin);
	}

	// 管理员增加
	@RequestMapping("/superAdminInsert")
	public Integer superAdminInsert(@RequestBody SuperAdmin superAdmin)  {
		return superAdminService.superAdminInsert(superAdmin);
	}

	@RequestMapping("/superAdminLogin")
	public SuperAdmin superAdminLogin(@RequestBody SuperAdmin superAdmin)  {
		return superAdminService.superAdminLogin(superAdmin);
	}
}
