package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.UserBidding;

/**
 * 用户竞标接口
 * 
 * @author sunzhu
 *
 */
@FeignClient("yijie.zuul.api")
public interface UserBiddingDao {

	// 用户竞标信息查询
	@RequestMapping("/yilianData/UserBidding/UserBiddingTable")
	public List<UserBidding> userBiddingSelect(UserBidding userBidding);

	// 用户竞标信息查询
	@RequestMapping("/yilianData/UserBidding/UserBiddingTable")
	public UserBidding userBiddingMessage(UserBidding userBidding);

	// 用户竞标创建
	@RequestMapping("/yilianData/UserBidding/UserBiddingBuild")
	public Integer userBiddingInsert(UserBidding userBidding);

	// 用户竞标更新
	@RequestMapping("/yilianData/UserBidding/UserBiddingDelete")
	public Integer userBiddingUpdate(UserBidding userBidding);

	// 用户竞标删除
	@RequestMapping("/yilianData/UserBidding/UserBiddingUpdate")
	public Integer userBiddingDelete(UserBidding userBidding);

}
