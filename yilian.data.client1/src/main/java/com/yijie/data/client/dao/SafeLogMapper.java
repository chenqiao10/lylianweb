package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Projects;
import com.yijie.data.client.model.SafeLog;

public interface SafeLogMapper {
	// 日志插入
	public void logInsert(SafeLog safeLog);

	// 日志查询
	public List<SafeLog> logSelect(SafeLog safeLog);

	// 日志删除
	public void logDelete(SafeLog safeLog);

	// 日志更新
	public void logUpdate(SafeLog safeLog);
	
	// 查询条数
	public Integer logCount(SafeLog safeLog);

}
