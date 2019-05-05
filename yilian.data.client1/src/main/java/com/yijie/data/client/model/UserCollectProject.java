package com.yijie.data.client.model;

public class UserCollectProject {
	private Integer id;
	//项目id
	private Integer type;
	//预算
	 private Integer max_budget;
	
	 private  Integer min_budget;
//项目名称
	 private  String  title;
	 //項目id
	 private  String   pro_uuid;
	 private  String   user_uuid;
	// 分页数据（初始条数）
		private Integer begin;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getType() {
			return type;
		}
		public void setType(Integer type) {
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
		public UserCollectProject(Integer id, Integer type, Integer max_budget, Integer min_budget, String title,
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
		public UserCollectProject() {
			super();
			// TODO 自动生成的构造函数存根
		}
		@Override
		public String toString() {
			return "UserCollectPro [id=" + id + ", type=" + type + ", max_budget=" + max_budget + ", min_budget="
					+ min_budget + ", title=" + title + ", pro_uuid=" + pro_uuid + ", user_uuid=" + user_uuid
					+ ", begin=" + begin + "]";
		}
		
		
}