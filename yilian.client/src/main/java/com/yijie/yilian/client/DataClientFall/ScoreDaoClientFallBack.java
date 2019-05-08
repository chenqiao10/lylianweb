package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.ScoreDao;
import com.yijie.yilian.client.model.ScoreRecord;
import com.yijie.yilian.client.model.ScoreRule;
@Component
public class ScoreDaoClientFallBack implements ScoreDao{

	@Override
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRuleAdd(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRuleUpdate(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRuleDelete(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<ScoreRecord> scoreRecordSelect(ScoreRecord scoreRecord) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRecordInsert(ScoreRecord scoreRecord) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRecordUpdate(ScoreRecord scoreRecord) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer scoreRecordDelete(ScoreRecord scoreRecord) {
		// TODO 自动生成的方法存根
		return null;
	}

}
