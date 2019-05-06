package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.Admin;

public interface AdminService {
	// 增加管理员账号
	public Integer adminInsert(Admin admin);

	// 修改管理员账号信息
	public Integer adminUpdate(Admin admin);

	// 删除管理员账号信息
	public Integer adminDelete(Admin admin);

	// 查找管理员列表
	public List<Admin> adminSelect(Admin admin);

	// 管理员登录
	public Admin adminLogin(Admin admin);
}
