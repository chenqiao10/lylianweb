package com.yijie.data.client.dao;

import java.util.List;

import com.yijie.data.client.model.Message;

public interface MessageMapper {
	// 信息添加
	public void messageInsert(Message message);

	// 聊天信息查看
	public List<Message> messageSelect(Message message);

	// 信息修改
	public void messageUpdate(Message message);

	// 信息删除
	public void messageDelete(Message message);
}
