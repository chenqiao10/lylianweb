package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.SafeLog;
import com.yijie.data.client.service.SafeLogService;

/**
 * 安全日誌
 * 
 * @author chenqiao
 *
 */
@RestController
@RequestMapping("/admin")
public class SafeLogController {
	@Autowired
	private SafeLogService safeLogService;

	// 日誌刪除
	@RequestMapping("/logInsert")
	public Integer logInsert(@RequestBody SafeLog safelog) {
		System.out.println(safelog);
		return safeLogService.logInsert(safelog);
	}

	// 日誌刪除
	@RequestMapping("/logDelete")
	public Integer logDelete(@RequestBody SafeLog safelog) {
		return safeLogService.logDelete(safelog);
	}

	// 日誌更新
	@RequestMapping("/logUpdate")
	public Integer logUpdate(@RequestBody SafeLog safelog) {
		return safeLogService.logUpdate(safelog);
	}

	// 日誌查詢
	@RequestMapping("/logSelect")
	public List<SafeLog> logSelect(@RequestBody SafeLog safelog) {
		return safeLogService.logSelect(safelog);
	}
}
