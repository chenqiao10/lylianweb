package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Admin;

public interface AdminMapper {
	// 增加管理员
	public Integer adminInsert(Admin admin);

	// 修改管理员
	public Integer adminUpdate(Admin admin);

	// 删除
	public Integer adminDelete(Admin admin);

	// 批量删除
	public Integer adminDeleteAll(List<Admin> list);

	// 查找管理员列表
	public List<Admin> adminSelect(Admin admin);

	// 数据条数
	public Integer adminCount(Admin admin);

}
