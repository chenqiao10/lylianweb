package com.yijie.yilian.client.model;

import java.sql.Date;

/**
 * @描述 用户已交换项目
 * @author Lucifer
 *
 */
public class UserChangeProject {
	
	// 自增ID
	private Integer id;
	
	// 对应项目UUID
	private String pro_uuid;
	
	// 交换项目用户UUID
	private String user_uuid;
	// 联系电话
	private String phone;
	// 项目名称
	private String title;
	//交换时间
	private Date date;
	//项目 类型
	private String type;

	private String begin;

	public UserChangeProject() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "UserChangeProject [id=" + id + ", pro_uuid=" + pro_uuid + ", user_uuid=" + user_uuid + ", phone="
				+ phone + ", title=" + title + ", date=" + date + ", type=" + type + ", getId()=" + getId()
				+ ", getPro_uuid()=" + getPro_uuid() + ", getUser_uuid()=" + getUser_uuid() + ", getPhone()="
				+ getPhone() + ", getTitle()=" + getTitle() + ", getDate()=" + getDate() + ", getType()=" + getType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public UserChangeProject(Integer id, String pro_uuid, String user_uuid, String phone, String title, Date date,
			String type) {
		super();
		this.id = id;
		this.pro_uuid = pro_uuid;
		this.user_uuid = user_uuid;
		this.phone = phone;
		this.title = title;
		this.date = date;
		this.type = type;
	}

}
