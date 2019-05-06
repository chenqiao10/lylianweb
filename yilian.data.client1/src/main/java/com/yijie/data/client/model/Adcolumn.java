package com.yijie.data.client.model;

/**
 * 广告栏位
 * 
 * @author chenqiao
 *
 */
public class Adcolumn {

	// 广告自增id
	private Integer id;

	// 广告轮播uuid
	private String uuid;

	// 广告标题
	private String title;

	// 图片地址
	private String imgurl;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Adcolumn(Integer id, String uuid, String title, String imgurl) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.title = title;
		this.imgurl = imgurl;
	}

	@Override
	public String toString() {
		return "Adcolumn [id=" + id + ", uuid=" + uuid + ", title=" + title + ", imgurl=" + imgurl + "]";
	}

	public Adcolumn() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
