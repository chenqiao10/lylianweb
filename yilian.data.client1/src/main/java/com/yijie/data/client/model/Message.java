package com.yijie.data.client.model;

import java.util.Date;

public class Message {
	private Integer id;
	//消息类容
	private String content;
	//消息標題
	private String title;
	//用户id
	private Integer user_id;
	//管理员id
	private Integer admin_id;
	//消息时间
	private Date date;
	//是否读取1biao
	private Integer status;
	//用户名
	private String name;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", title=" + title + ", user_id=" + user_id
				+ ", admin_id=" + admin_id + ", date=" + date + ", status=" + status + ", name=" + name + "]";
	}

	public Message(Integer id, String content, String title, Integer user_id, Integer admin_id, Date date,
			Integer status, String name) {
		super();
		this.id = id;
		this.content = content;
		this.title = title;
		this.user_id = user_id;
		this.admin_id = admin_id;
		this.date = date;
		this.status = status;
		this.name = name;
	}
	public Message() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
