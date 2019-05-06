package com.yijie.data.client.model;

import java.util.Date;
import java.util.List;

/**
 * @描述 标书信息
 * @author Lucifer
 *
 */
public class Tender {
	
	//自增ID
	private Integer id;
	
	//系统生成UUID
	private String uuid;
	
	//对应发布人UUID
	private String user_uuid;
	
	//标书项目名称
	private String title;
	
	//项目信息
	private String message;
	
	//区域
	private String area;
	
	//项目周期
	private Integer days;
	
	//最小预算
	private Double min_budget;
	
	//最大预算
	private Double max_budget;
	
	//联系电话
	private String phone;
	
	//联系微信
	private String oicq;
	
	//项目类型
	private String type;
	
	//相关证书对应URL
	private String license;
	
	//是否通过审核（1.通过，0.未通过，2.审核中）
	private Integer audit;
	
	//竞标截止周期
	private Date end_time;
	
	//标书对应附件
	private List<TenderDesign> designs;

	// 分页数据（初始条数）
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

	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getMin_budget() {
		return min_budget;
	}

	public void setMin_budget(Double min_budget) {
		this.min_budget = min_budget;
	}

	public Double getMax_budget() {
		return max_budget;
	}

	public void setMax_budget(Double max_budget) {
		this.max_budget = max_budget;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOicq() {
		return oicq;
	}

	public void setOicq(String oicq) {
		this.oicq = oicq;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Integer getAudit() {
		return audit;
	}

	public void setAudit(Integer audit) {
		this.audit = audit;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public List<TenderDesign> getDesigns() {
		return designs;
	}

	public void setDesigns(List<TenderDesign> designs) {
		this.designs = designs;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	@Override
	public String toString() {
		return "Tender [id=" + id + ", uuid=" + uuid + ", user_uuid=" + user_uuid + ", title=" + title + ", message="
				+ message + ", area=" + area + ", days=" + days + ", min_budget=" + min_budget + ", max_budget="
				+ max_budget + ", phone=" + phone + ", oicq=" + oicq + ", type=" + type + ", license=" + license
				+ ", audit=" + audit + ", end_time=" + end_time + ", designs=" + designs + ", begin=" + begin + "]";
	}

	public Tender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tender(Integer id, String uuid, String user_uuid, String title, String message, String area, Integer days,
			Double min_budget, Double max_budget, String phone, String oicq, String type, String license, Integer audit,
			Date end_time, List<TenderDesign> designs, Integer begin) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.user_uuid = user_uuid;
		this.title = title;
		this.message = message;
		this.area = area;
		this.days = days;
		this.min_budget = min_budget;
		this.max_budget = max_budget;
		this.phone = phone;
		this.oicq = oicq;
		this.type = type;
		this.license = license;
		this.audit = audit;
		this.end_time = end_time;
		this.designs = designs;
		this.begin = begin;
	}
}