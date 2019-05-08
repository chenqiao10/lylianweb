package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yijie.data.client.dao.MessageMapper;
import com.yijie.data.client.model.Message;
import com.yijie.data.client.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public Integer messageInsert(Message message) {
		try {
			messageMapper.messageInsert(message);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	@Override
	public Integer messageUpdate(Message message) {
		try {
			messageMapper.messageUpdate(message);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public Integer messageDelete(Message message) {
		try {
			messageMapper.messageDelete(message);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	@Override
	public List<Message> messageSelect(Message message) {
		try {
			return messageMapper.messageSelect(message);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Integer messageCount(Message message) {
		// TODO 自动生成的方法存根
		try {
			return messageMapper.messageCount(message);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return 0;
		}
	}

}
