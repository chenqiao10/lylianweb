package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.ScoreRecord;

public interface ScoreRecordMapper {

	// 积分记录查询
	public List<ScoreRecord> scoreRecordSelect(ScoreRecord scoreRecord);

	// 积分记录添加
	public void scoreRecordInsert(ScoreRecord scoreRecord);

	// 积分记录更新
	public void scoreRecordUpdate(ScoreRecord scoreRecord);

	// 积分记录删除
	public void scoreRecordDelete(ScoreRecord scoreRecord);
	// 积分记录总数
	
	public Integer scoreRecordCount(ScoreRecord scoreRecord);
	
}
