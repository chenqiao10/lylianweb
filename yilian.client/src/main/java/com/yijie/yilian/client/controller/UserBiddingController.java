package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.UserBidding;
import com.yijie.yilian.client.service.UserBiddingService;

/**
 * @描述 用户竞标模块
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/userBidding")
public class UserBiddingController {

	@Autowired
	private UserBiddingService userBiddingService;

	// 用户竞标列表
	@RequestMapping("/biddingTable")
	public Map<String, Object> biddingTable(@RequestBody UserBidding userBidding) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<UserBidding> list = userBiddingService.biddingTable(userBidding);
		result.put("list", list);
		result.put("code", 1);
		return result;
	}

	// 用户竞标详细信息
	@RequestMapping("/biddingMessage")
	public Map<String, Object> biddingMessage(@RequestBody UserBidding userBidding) {
		Map<String, Object> result = new HashMap<String, Object>();
		UserBidding bidding = userBiddingService.biddingMessage(userBidding);
		result.put("bidding", bidding);
		result.put("code", 1);
		return result;
	}

	// 用户竞标创建
	@RequestMapping("/biddingBuild")
	public Map<String, Object> biddingBuild(@RequestBody UserBidding userBidding) {
		Map<String, Object> result = new HashMap<String, Object>();
		Integer code = userBiddingService.biddingBuild(userBidding);
		result.put("code", code);
		return result;
	}

	// 用户竞标信息修改
	@RequestMapping("/biddingUpdate")
	public Map<String, Object> biddingUpdate(@RequestBody UserBidding userBidding) {
		Map<String, Object> result = new HashMap<String, Object>();
		Integer code = userBiddingService.biddingUpdate(userBidding);
		result.put("code", code);
		return result;
	}

}
