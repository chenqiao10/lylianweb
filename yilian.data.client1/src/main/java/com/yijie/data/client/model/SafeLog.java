package com.yijie.data.client.model;

import java.util.Date;

public class SafeLog {
	private Integer id;// 安全日志id
	private String handle_name;// 操作人姓名
	private Integer handle_id;// 操作人id
	private String  handle;// 具体操作
	private Date handle_date;// 操作时间
	private String begin;// 分页字段
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHandle_name() {
		return handle_name;
	}
	public void setHandle_name(String handle_name) {
		this.handle_name = handle_name;
	}
	public Integer getHandle_id() {
		return handle_id;
	}
	public void setHandle_id(Integer handle_id) {
		this.handle_id = handle_id;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	public Date getHandle_date() {
		return handle_date;
	}
	public void setHandle_date(Date handle_date) {
		this.handle_date = handle_date;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public SafeLog(Integer id, String handle_name, Integer handle_id, String handle, Date handle_date, String begin) {
		super();
		this.id = id;
		this.handle_name = handle_name;
		this.handle_id = handle_id;
		this.handle = handle;
		this.handle_date = handle_date;
		this.begin = begin;
	}
	@Override
	public String toString() {
		return "SafeLog [id=" + id + ", handle_name=" + handle_name + ", handle_id=" + handle_id + ", handle=" + handle
				+ ", handle_date=" + handle_date + ", begin=" + begin + "]";
	}
	public SafeLog() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
}
