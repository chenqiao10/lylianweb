package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.ScoreRuleMapper;
import com.yijie.data.client.model.ScoreRule;
import com.yijie.data.client.service.ScoreRuleService;

@Service
public class ScoreServiceImpl implements ScoreRuleService {
	@Autowired
	ScoreRuleMapper ScoreRuleMapper;

	@Override
	public List<ScoreRule> scoreRuleSelect(ScoreRule scoreRule) {
		// TODO 自动生成的方法存根
		return ScoreRuleMapper.scoreRuleSelect(scoreRule);
	}

	@Override
	public Integer scoreRuleAdd(ScoreRule scoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleInsert(scoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRuleUpdate(ScoreRule scoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleUpdate(scoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer scoreRuleDelete(ScoreRule scoreRule) {
		// TODO 自动生成的方法存根
		try {
			ScoreRuleMapper.scoreRuleDelete(scoreRule);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
