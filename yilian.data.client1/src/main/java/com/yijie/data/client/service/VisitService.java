package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.SafeLog;
import com.yijie.data.client.model.Visit;


public interface VisitService {
	//浏览插入
	Integer visitInsert(Visit visit);
	// 浏览量查询
	
	List<Visit> visitSelect(Visit visit);
	//浏览删除
	
	Integer visitDelete(Visit visit);
	//浏览更新
	Integer visitUpdate(Visit visit);

}
