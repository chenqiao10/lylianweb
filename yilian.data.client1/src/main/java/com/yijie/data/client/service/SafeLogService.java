package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.SafeLog;

public interface SafeLogService {
	// 日志插入
	public Integer logInsert(SafeLog safeLog);

	// 日志查询
	public List<SafeLog> logSelect(SafeLog safeLog);

	// 日志删除
	public Integer logDelete(SafeLog safeLog);

	// 日志更新
	public Integer logUpdate(SafeLog safeLog);

	public Integer logCount(SafeLog safelog);

}
