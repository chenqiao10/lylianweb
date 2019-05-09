package com.yijie.yilian.client.model;

public class UserCollectProject {

	// 主键id
	private Integer id;

	// 项目类型
	private String type;

	// 最大预算
	private Integer max_budget;

	// 最小预算
	private Integer min_budget;

	// 项目名称
	private String title;

	// 項目id
	private String pro_uuid;

	// 用户uuid
	private String user_uuid;

	// 分页数据（初始条数）
	private Integer begin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMax_budget() {
		return max_budget;
	}

	public void setMax_budget(Integer max_budget) {
		this.max_budget = max_budget;
	}

	public Integer getMin_budget() {
		return min_budget;
	}

	public void setMin_budget(Integer min_budget) {
		this.min_budget = min_budget;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPro_uuid() {
		return pro_uuid;
	}

	public void setPro_uuid(String pro_uuid) {
		this.pro_uuid = pro_uuid;
	}

	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	@Override
	public String toString() {
		return "UserCollectProject [id=" + id + ", type=" + type + ", max_budget=" + max_budget + ", min_budget="
				+ min_budget + ", title=" + title + ", pro_uuid=" + pro_uuid + ", user_uuid=" + user_uuid + ", begin="
				+ begin + "]";
	}

	public UserCollectProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCollectProject(Integer id, String type, Integer max_budget, Integer min_budget, String title,
			String pro_uuid, String user_uuid, Integer begin) {
		super();
		this.id = id;
		this.type = type;
		this.max_budget = max_budget;
		this.min_budget = min_budget;
		this.title = title;
		this.pro_uuid = pro_uuid;
		this.user_uuid = user_uuid;
		this.begin = begin;
	}

	

}