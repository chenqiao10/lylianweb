package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.Message;

public interface MessageService {
	    // 信息增加
		public Integer messageInsert(Message message);
		// 信息删除
		public Integer messageUpdate(Message message);
		// 信息更新
		public Integer messageDelete(Message message);
		// 信息查询
		public  List<Message> messageSelect(Message message);
		// 信息总数
		public Integer messageCount(Message message);
}
