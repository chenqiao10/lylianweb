package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.ScoreRule;
import com.yijie.data.client.service.ScoreRuleService;

@RestController
@RequestMapping("/user")
public class ScoreRuleController {
	@Autowired
	private ScoreRuleService ScoreRuleService;

	@RequestMapping("/scoreRuleSelect")
	public List<ScoreRule> scoreRuleSelect(@RequestBody ScoreRule scoreRule) {
		return ScoreRuleService.scoreRuleSelect(scoreRule);
	}

	@RequestMapping("/scoreRuleAdd")
	public Integer scoreRuleAdd(@RequestBody ScoreRule scoreRule) {
		return ScoreRuleService.scoreRuleAdd(scoreRule);
	}

	@RequestMapping("/scoreRuleUpdate")
	public Integer scoreRuleUpdate(@RequestBody ScoreRule scoreRule) {
		return ScoreRuleService.scoreRuleUpdate(scoreRule);
	}

	@RequestMapping("/scoreRuleDelete")
	public Integer scoreRuleDelete(@RequestBody ScoreRule scoreRule) {
		return ScoreRuleService.scoreRuleDelete(scoreRule);
	}
}
