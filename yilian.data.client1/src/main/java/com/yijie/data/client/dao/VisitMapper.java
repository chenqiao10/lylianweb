package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.SafeLog;
import com.yijie.data.client.model.Visit;

public interface VisitMapper {
	//浏览插入
			void visitInsert(Visit visit);
			// 浏览量查询
			
			List<Visit> visitSelect(Visit visit);
			//浏览删除
			
			void visitDelete(Visit visit);
			//浏览更新
			void visitUpdate(Visit visit);
		
}
