package com.yijie.data.client.model;

import java.util.Date;

public class Visit {
private Integer id;
private Integer visit;
private Date date;//
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getVisit() {
	return visit;
}
public void setVisit(Integer visit) {
	this.visit = visit;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Visit(Integer id, Integer visit, Date date) {
	super();
	this.id = id;
	this.visit = visit;
	this.date = date;
}
@Override
public String toString() {
	return "Visit [id=" + id + ", visit=" + visit + ", date=" + date + "]";
}
public Visit() {
	super();
	// TODO 自动生成的构造函数存根
}


}
