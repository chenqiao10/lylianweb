package com.yijie.yilian.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.ScoreDao;
import com.yijie.yilian.client.model.ScoreRule;
import com.yijie.yilian.client.service.ScoreRuleService;

@Service
public class ScoreRuleServiceImpl implements ScoreRuleService {
	@Autowired
	private ScoreDao scoreDao;

	@Override
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return scoreDao.scoreRuleSelect(ScoreRule);
	}

	@Override
	public Integer scoreRuleAdd(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return scoreDao.scoreRuleAdd(ScoreRule);
	}

	@Override
	public Integer scoreRuleUpdate(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return scoreDao.scoreRuleUpdate(ScoreRule);
	}

	@Override
	public Integer scoreRuleDelete(ScoreRule ScoreRule) {
		// TODO 自动生成的方法存根
		return scoreDao.scoreRuleDelete(ScoreRule);
	}

}
