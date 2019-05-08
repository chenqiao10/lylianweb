package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.SafeLogMapper;
import com.yijie.data.client.model.SafeLog;
import com.yijie.data.client.service.SafeLogService;

@Service
public class SafeLogServiceImpl implements SafeLogService {
	@Autowired
	private SafeLogMapper safeLogMapper;

	@Override
	public Integer logInsert(SafeLog safeLog) {
		try {
			safeLogMapper.logInsert(safeLog);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}

	@Override
	public List<SafeLog> logSelect(SafeLog safeLog) {
		try {
			List<SafeLog> list = safeLogMapper.logSelect(safeLog);
			return list;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Integer logDelete(SafeLog safeLog) {
		try {
			safeLogMapper.logDelete(safeLog);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}

	@Override
	public Integer logUpdate(SafeLog safeLog) {
		try {
			safeLogMapper.logUpdate(safeLog);
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}

	@Override
	public Integer logCount(SafeLog safelog) {
		// TODO 自动生成的方法存根
		try {
			return safeLogMapper.logCount(safelog);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

}
