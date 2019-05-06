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
	@RequestMapping("/yilianData/userBidding/userBiddingTable")
	public List<UserBidding> userBiddingSelect(UserBidding userBidding);

	// 用户竞标信息查询
	@RequestMapping("/yilianData/userBidding/userBiddingTable")
	public UserBidding userBiddingMessage(UserBidding userBidding);

	// 用户竞标创建
	@RequestMapping("/yilianData/userBidding/userBiddingBuild")
	public Integer userBiddingInsert(UserBidding userBidding);

	// 用户竞标更新
	@RequestMapping("/yilianData/userBidding/userBiddingDelete")
	public Integer userBiddingUpdate(UserBidding userBidding);

	// 用户竞标删除
	@RequestMapping("/yilianData/userBidding/userBiddingUpdate")
	public Integer userBiddingDelete(UserBidding userBidding);

}
