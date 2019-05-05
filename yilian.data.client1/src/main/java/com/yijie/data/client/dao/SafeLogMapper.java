package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.SafeLog;

public interface SafeLogMapper {
	//日志插入
	void logInsert(SafeLog safeLog);
	//日志查询
	
	List<SafeLog> logSelect(SafeLog safeLog);
	//日志删除
	
	void logDelete(SafeLog safeLog);
	//日志更新
	void logUpdate(SafeLog safeLog);
}
