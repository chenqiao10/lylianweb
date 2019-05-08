package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.Admin;
import com.yijie.data.client.model.SuperAdmin;

public interface SuperAdminService {
	// 增加管理员
		public Integer superAdminInsert(SuperAdmin superAdmin);

		// 修改管理员
		public Integer superAdminUpdate(SuperAdmin superAdmin);

		// 删除
		public Integer superAdminDelete(SuperAdmin superAdmin);

		// 查找管理员列表
		public List<SuperAdmin> superAdminSelect(SuperAdmin superAdmin);
	
		// 管理员登录
		public SuperAdmin superAdminLogin(SuperAdmin superAdmin);

		
}
