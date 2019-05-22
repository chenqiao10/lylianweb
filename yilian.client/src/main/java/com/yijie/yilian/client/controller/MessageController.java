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

	/**
	 * @ 推送消息批量已读
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/messageUpdateAll")
	public Map<String, Object> messageUpdateAll(@RequestBody List<Message> messageList) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < messageList.size(); i++) {
				messageList.get(i).setStatus(1);
				Integer code = messageService.messageUpdate(messageList.get(i));
				map.put("code", code);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("msg", "系统出错");
			map.put("code", 0);
		}
		return map;
	}

	/**
	 * @ 推送消息批量删除
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/messageDeleteAll")
	public Map<String, Object> messageDeleteAll(@RequestBody List<Message> messageList) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < messageList.size(); i++) {
				Integer code = messageService.messageDelete(messageList.get(i));
				map.put("code", code);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("msg", "系统出错");
			map.put("code", 0);
		}
		return map;
	}

	/**
	 * @ 推送消息修改
	 * 
	 * @param message
	 * @return
	 */
	@RequestMapping("messageUpdate")
	public Map<String, Object> messageUpdate(@RequestBody Message message) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (message.getId() != null) {
				message.setStatus(1);
				Integer code = messageService.messageUpdate(message);
				map.put("code", code);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 0);
		}
		return map;
	}

	/**
	 * @ 推送消息删除
	 * 
	 * @param message
	 * @return
	 */
	@RequestMapping("messageDelete")
	public Map<String, Object> messageDelete(@RequestBody Message message) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			if (message.getId() != null) {
				Integer code = messageService.messageDelete(message);
				map.put("code", code);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 0);
		}
		return map;
	}

}
