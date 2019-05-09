package com.yijie.yilian.client.model;

public class ScoreRule {
	// 主键id
	private Integer id;

	// 积分规则uuid
	private String uuid;

	// 最大预算
	private double max_budget;

	// 最小预算
	private double min_budget;

	// 积分预算
	private Integer score_budget;
	
	//状态值 0禁用 1启用
	private Integer status;

	// 起始条数
	private Integer begin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public double getMax_budget() {
		return max_budget;
	}

	public void setMax_budget(double max_budget) {
		this.max_budget = max_budget;
	}

	public double getMin_budget() {
		return min_budget;
	}

	public void setMin_budget(double min_budget) {
		this.min_budget = min_budget;
	}

	public Integer getScore_budget() {
		return score_budget;
	}

	public void setScore_budget(Integer score_budget) {
		this.score_budget = score_budget;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	@Override
	public String toString() {
		return "ScoreRule [id=" + id + ", uuid=" + uuid + ", max_budget=" + max_budget + ", min_budget=" + min_budget
				+ ", score_budget=" + score_budget + ", status=" + status + ", begin=" + begin + "]";
	}

	public ScoreRule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreRule(Integer id, String uuid, double max_budget, double min_budget, Integer score_budget,
			Integer status, Integer begin) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.max_budget = max_budget;
		this.min_budget = min_budget;
		this.score_budget = score_budget;
		this.status = status;
		this.begin = begin;
	}
}
