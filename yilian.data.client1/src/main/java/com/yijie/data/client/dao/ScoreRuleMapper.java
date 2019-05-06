package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.ScoreRule;

public interface ScoreRuleMapper {
	public List<ScoreRule> scoreRuleSelect(ScoreRule scoreRule);

	public Integer scoreRuleInsert(ScoreRule scoreRule);

	public Integer scoreRuleUpdate(ScoreRule scoreRule);

	public Integer scoreRuleDelete(ScoreRule scoreRule);

}
