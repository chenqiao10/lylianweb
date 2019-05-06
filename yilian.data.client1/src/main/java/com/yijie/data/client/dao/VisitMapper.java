package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.SafeLog;
import com.yijie.data.client.model.Visit;

public interface VisitMapper {
	// 浏览插入
	public void visitInsert(Visit visit);

	// 浏览量查询
	public List<Visit> visitSelect(Visit visit);

	// 浏览删除
	public void visitDelete(Visit visit);

	// 浏览更新
	public void visitUpdate(Visit visit);

}
