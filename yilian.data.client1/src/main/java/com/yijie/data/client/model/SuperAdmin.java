package com.yijie.data.client.model;
/**
 * 超管理账号
 * 
 * @author sunzhu
 *
 */
public class SuperAdmin {
	
	//主键id
	private Integer id;
	
	//超管理员uuid
	private String uuid;
	
	//账号电话号码（登录账号）
	private String num;
	
	//账号密码
	private String password;
	
	//账号名称
	private String name;
	
	//操作人名字
	private String handle_name;
	
	//操作人id
	private Integer handle_id;
	//操作人id
    private Integer status;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public SuperAdmin(Integer id, String uuid, String num, String password, String name, String handle_name,
			Integer handle_id, Integer status) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.num = num;
		this.password = password;
		this.name = name;
		this.handle_name = handle_name;
		this.handle_id = handle_id;
		this.status = status;
	}
	@Override
	public String toString() {
		return "SuperAdmin [id=" + id + ", uuid=" + uuid + ", num=" + num + ", password=" + password + ", name=" + name
				+ ", handle_name=" + handle_name + ", handle_id=" + handle_id + ", status=" + status + "]";
	}
	public SuperAdmin() {
		super();
		// TODO 自动生成的构造函数存根
	}

	
}
