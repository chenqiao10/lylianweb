package com.yijie.data.client.model;

public class Admin {
   //主键id
	private Integer id;
	//uuid
	private String uuid;
	//账号电话号码（登录账号）
	private String num;
	//账号密码
	private String 	password;
	//姓名
	private String name;
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Admin(Integer id, String uuid, String num, String password, String name) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.num = num;
		this.password = password;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", uuid=" + uuid + ", num=" + num + ", password=" + password + ", name=" + name
				+ "]";
	}
	public Admin() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}

