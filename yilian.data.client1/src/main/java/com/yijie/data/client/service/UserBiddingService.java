package com.yijie.data.client.service;

import java.util.List;

import com.yijie.data.client.model.UserBidding;

public interface UserBiddingService {

	public List<UserBidding> userBiddingSelect(UserBidding userBidding);

	public Integer userBiddingInsert(UserBidding userBidding);

	public Integer userBiddingUpdate(UserBidding userBidding);

	public Integer userBiddingDelete(UserBidding userBidding);

}
