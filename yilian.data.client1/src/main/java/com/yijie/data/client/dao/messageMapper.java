package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Message;

public interface messageMapper {
	// 信息添加
	public void messageInsert(Message Message);

	// 聊天信息查看
	public List<Message> messageSelect(Message Message);

	// 信息修改
	public void messageUpdate(Message Message);

	// 信息删除
	public void messageDelete(Message Message);
}
