package com.yijie.yilian.client.service;

import java.util.List;

import com.yijie.yilian.client.model.ScoreRule;

public interface ScoreRuleService {
	
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule);

	public Integer scoreRuleAdd(ScoreRule ScoreRule);

	public Integer scoreRuleUpdate(ScoreRule ScoreRule);

	public Integer scoreRuleDelete(ScoreRule ScoreRule);
}
