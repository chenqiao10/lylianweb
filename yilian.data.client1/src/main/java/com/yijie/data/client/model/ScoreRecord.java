package com.yijie.data.client.model;

import java.util.Date;

/**
 * 积分记录表
 * 
 * @author sunzhu
 *
 */
public class ScoreRecord {
	
	//自增id
	private Integer id;
	
	//领取时间
	private Date date;
	
	//积分类型(0签到 1邀请 2发布 3兑换 4注册)
	private Integer type;
	
	//用户id
	private String user_uuid;
	
	//领取积分
	private Integer score;
	
	// 分页数据（初始条数）
	private Integer begin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	@Override
	public String toString() {
		return "ScoreRecord [id=" + id + ", date=" + date + ", type=" + type + ", user_uuid=" + user_uuid + ", score="
				+ score + ", begin=" + begin + "]";
	}

	public ScoreRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreRecord(Integer id, Date date, Integer type, String user_uuid, Integer score, Integer begin) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.user_uuid = user_uuid;
		this.score = score;
		this.begin = begin;
	}

}