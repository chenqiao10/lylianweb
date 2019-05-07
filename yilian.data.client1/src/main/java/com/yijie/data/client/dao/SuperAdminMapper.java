package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Admin;
import com.yijie.data.client.model.SuperAdmin;

public interface SuperAdminMapper {
	// 增加管理员
	public void superAdminInsert(SuperAdmin superAdmin);

	// 修改管理员
	public void superAdminUpdate(SuperAdmin superAdmin);

	// 删除
	public void superAdminDelete(SuperAdmin superAdmin);

	// 查找管理员列表
	public List<SuperAdmin> superAdminSelect(SuperAdmin superAdmin);

}
