package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Adcolumn;

public interface AdcolumnMapper {
	// 广告增加
	public Integer adcolumnInsert(Adcolumn adcolumn);

	// 广告删除
	public Integer adcolumnDelete(Adcolumn adcolumn);

	// 广告更新
	public Integer adcolumnUpdate(Adcolumn adcolumn);

	// 广告查询adcolumnDelete
	public List<Adcolumn> adcolumnSelect(Adcolumn adcolumn);
}
