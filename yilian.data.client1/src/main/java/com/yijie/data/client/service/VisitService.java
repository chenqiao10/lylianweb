package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.Visit;

public interface VisitService {
	// 浏览插入
	public Integer visitInsert(Visit visit);

	// 浏览量查询
	public List<Visit> visitSelect(Visit visit);

	// 浏览删除
	public Integer visitDelete(Visit visit);

	// 浏览更新
	public Integer visitUpdate(Visit visit);

}
