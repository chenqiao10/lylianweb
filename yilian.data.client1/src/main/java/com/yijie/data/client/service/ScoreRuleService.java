package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.ScoreRule;

public interface ScoreRuleService {
	public List<ScoreRule> scoreRuleSelect(ScoreRule scoreRule);

	public Integer scoreRuleAdd(ScoreRule scoreRule);

	public Integer scoreRuleUpdate(ScoreRule scoreRule);

	public Integer scoreRuleDelete(ScoreRule scoreRule);
}
