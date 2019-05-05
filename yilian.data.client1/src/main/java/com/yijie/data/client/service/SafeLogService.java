package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.SafeLog;


public interface SafeLogService {
	//日志插入
		Integer logInsert(SafeLog safeLog);
		//日志查询
		
		List<SafeLog> logSelect(SafeLog safeLog);
		//日志删除
		
		Integer logDelete(SafeLog safeLog);
		//日志更新
		Integer logUpdate(SafeLog safeLog);
	
}
