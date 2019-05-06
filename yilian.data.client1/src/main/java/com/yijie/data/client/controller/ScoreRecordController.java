package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.ScoreRecord;
import com.yijie.data.client.service.ScoreRecordService;

/**
 * 积分记录
 * 
 * @author sunzhu
 *
 */
@RestController
@RequestMapping("/user")
public class ScoreRecordController {

	@Autowired
	private ScoreRecordService scoreRecordService;

	// 查询积分记录
	@RequestMapping("/ScoreRecordSelect")
	public List<ScoreRecord> ScoreRecordSelect(@RequestBody ScoreRecord scoreRecord) {
		return scoreRecordService.scoreRecordTable(scoreRecord);
	}

	// 添加积分记录
	@RequestMapping("/ScoreRecordInsert")
	public Integer ScoreRecordInsert(@RequestBody ScoreRecord scoreRecord) {
		return scoreRecordService.scoreRecordAdd(scoreRecord);
	}

	// 删除积分记录
	@RequestMapping("/ScoreRecordDelete")
	public Integer ScoreRecordDelete(@RequestBody ScoreRecord scoreRecord) {
		return scoreRecordService.scoreRecordDelete(scoreRecord);
	}

	// 修改积分记录
	@RequestMapping("/ScoreRecordUpdate")
	public Integer ScoreRecordUpdate(@RequestBody ScoreRecord scoreRecord) {
		return scoreRecordService.scoreRecordUpdate(scoreRecord);
	}

}
