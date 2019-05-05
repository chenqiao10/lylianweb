package com.yijie.data.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.UserBidding;
import com.yijie.data.client.service.UserBiddingService;

/**
 * @描述 用户竞标模块
 * 
 * @author sunzhu
 *
 */
@RestController
@RequestMapping("/UserBidding")
public class UserBiddingController {
	
	@Autowired
	private UserBiddingService userBiddingService;
	
	//用户竞标列表
	@RequestMapping("/UserBiddingTable")
	public Map<String, Object> UserBiddingTable(@RequestBody UserBidding userBidding){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<UserBidding> list = userBiddingService.userBiddingSelect(userBidding);
			map.put("data", list);
			map.put("code", 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("data", "系统出错");
			map.put("code", 0);
		}
		return map;
	}

	//用户竞标添加
	@RequestMapping("/UserBiddingInsert")
	public Map<String, Object> UserBiddingInsert(@RequestBody UserBidding userBidding){
		Map<String, Object> map = new HashMap<String, Object>();
		Integer code = userBiddingService.userBiddingInsert(userBidding);
		map.put("code", code);
		return map;
	}
	
	//用户竞标修改
	@RequestMapping("/UserBiddingUpdate")
	public Map<String, Object> userBiddingUpdate(@RequestBody UserBidding userBidding){
		Map<String, Object> map = new HashMap<String, Object>();
		Integer code = userBiddingService.userBiddingUpdate(userBidding);
		map.put("code", code);
		return map;
	}
	
	//用户竞标删除
	@RequestMapping("/UserBiddingDelete")
	public Map<String, Object> userBiddingDelete(@RequestBody UserBidding userBidding){
		Map<String, Object> map = new HashMap<String, Object>();
		Integer code = userBiddingService.userBiddingDelete(userBidding);
		map.put("code", code);
		return map;
	}
}
