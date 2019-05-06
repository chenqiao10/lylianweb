package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.ScoreRecord;

public interface ScoreRecordService {

	public List<ScoreRecord> scoreRecordTable(ScoreRecord scoreRecord);

	public Integer scoreRecordAdd(ScoreRecord scoreRecord);

	public Integer scoreRecordDelete(ScoreRecord scoreRecord);

	public Integer scoreRecordUpdate(ScoreRecord scoreRecord);

}
