package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.Message;
import com.yijie.data.client.service.MessageService;
@RestController
@RequestMapping("/admin")
public class MessageDaoController {
	@Autowired
	private MessageService messageService;

	//  信息列表查找
	@RequestMapping("/messageSelect")
	public List<Message> messageSelect(@RequestBody Message message) {
		return messageService.messageSelect(message);
	}
	//  信息更新
	@RequestMapping("/messageUpdate")
	public Integer messageUpdate(@RequestBody Message message) {
		return messageService.messageUpdate(message);
	}
	// 信息 删除
	@RequestMapping("/messageDelete")
	public Integer messageDelete(@RequestBody Message message) {
		return messageService.messageDelete(message);
	}
	// 信息增加
	@RequestMapping("/messageInsert")
	public Integer messageInsert(@RequestBody Message message) {
		return messageService.messageInsert(message);
	}

}
