package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yijie.data.client.dao.ScoreRecordMapper;
import com.yijie.data.client.model.ScoreRecord;
import com.yijie.data.client.service.ScoreRecordService;

@Service
@Transactional
public class ScoreRecordServiceImpl implements ScoreRecordService {

	@Autowired
	private ScoreRecordMapper scoreRecordMapper;

	@Override
	public List<ScoreRecord> scoreRecordTable(ScoreRecord scoreRecord) {
		// TODO Auto-generated method stub
		try {
			List<ScoreRecord> ScoreRecordlist = scoreRecordMapper.scoreRecordSelect(scoreRecord);
			return ScoreRecordlist;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer scoreRecordAdd(ScoreRecord scoreRecord) {
		// TODO Auto-generated method stub
		try {
			scoreRecordMapper.scoreRecordInsert(scoreRecord);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRecordDelete(ScoreRecord scoreRecord) {
		// TODO Auto-generated method stub
		try {
			scoreRecordMapper.scoreRecordDelete(scoreRecord);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRecordUpdate(ScoreRecord scoreRecord) {
		// TODO Auto-generated method stub
		try {
			scoreRecordMapper.scoreRecordUpdate(scoreRecord);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRecordCount(ScoreRecord scoreRecord) {
		try {
			// TODO 自动生成的方法存根
			return scoreRecordMapper.scoreRecordCount(scoreRecord);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

}
