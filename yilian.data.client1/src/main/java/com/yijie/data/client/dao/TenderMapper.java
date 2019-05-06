package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Tender;

public interface TenderMapper {

	// 标书查询
	public List<Tender> tenderSelect(Tender tender);

	// 标书添加
	public void tenderInsert(Tender tender);

	// 标书更新
	public void tenderUpdate(Tender tender);

	// 标书删除
	public void tenderDelete(Tender tender);

}
