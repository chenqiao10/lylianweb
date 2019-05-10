package com.yijie.yilian.client.controller;

import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.yijie.yilian.client.model.Message;
import com.yijie.yilian.client.service.MessageService;

@RestController
@RequestMapping("/user")
public class MessageController {

	@Autowired
	private MessageService messageService;



	

	/**
	 * @ 推送消息列表
	 * 
	 * @param message
	 * @return
	 */
	@RequestMapping("/messageTable")
	public Map<String, Object> messageTable(@RequestBody Message message) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<Message> msglist = messageService.messageTable(message);
			map.put("msglist", msglist);
			map.put("code", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 0);
			map.put("msg", "系统出错");
		}
		return map;
	}
	@RequestMapping("/messageCount")
	public Map<String, Object> messageCount(@RequestBody Message message) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Integer count = messageService.messageCount(message);
			map.put("count", count);
			map.put("code", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 0);
			map.put("msg", "系统出错");
		}
		return map;
	}
}
