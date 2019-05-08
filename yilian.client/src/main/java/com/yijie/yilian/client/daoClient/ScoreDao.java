package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.ProjectDaoClientFallBack;
import com.yijie.yilian.client.DataClientFall.ScoreDaoClientFallBack;
import com.yijie.yilian.client.model.ScoreRecord;
import com.yijie.yilian.client.model.ScoreRule;

/**
 * 
 * 积分记录接口 积分策略接口
 * 
 * @author sunzhu
 *
 */
@FeignClient(name="yijie.zuul.api", fallback=ScoreDaoClientFallBack.class)
public interface ScoreDao {

	//积分策略查询
	@RequestMapping("yilianData/user/scoreRuleSelect")
	public List<ScoreRule> scoreRuleSelect(ScoreRule ScoreRule);

	//积分策略添加
	@RequestMapping("yilianData/user/scoreRuleAdd")
	public Integer scoreRuleAdd(ScoreRule ScoreRule);

	//积分策略修改
	@RequestMapping("yilianData/user/scoreRuleUpdate")
	public Integer scoreRuleUpdate(ScoreRule ScoreRule);

	//积分策略删除
	@RequestMapping("yilianData/user/scoreRuleDelete")
	public Integer scoreRuleDelete(ScoreRule ScoreRule);

	// 积分记录查询
	@RequestMapping("yilianData/user/ScoreRecordSelect")
	public List<ScoreRecord> scoreRecordSelect(ScoreRecord scoreRecord);

	// 积分记录添加
	@RequestMapping("yilianData/user/ScoreRecordInsert")
	public Integer scoreRecordInsert(ScoreRecord scoreRecord);

	// 积分记录更新
	@RequestMapping("yilianData/user/ScoreRecordDelete")
	public Integer scoreRecordUpdate(ScoreRecord scoreRecord);

	// 积分记录删除
	@RequestMapping("yilianData/user/ScoreRecordUpdate")
	public Integer scoreRecordDelete(ScoreRecord scoreRecord);

}
