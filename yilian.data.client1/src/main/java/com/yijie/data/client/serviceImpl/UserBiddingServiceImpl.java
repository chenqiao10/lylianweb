package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.UserBiddingMapper;
import com.yijie.data.client.model.UserBidding;
import com.yijie.data.client.service.UserBiddingService;
@Service
public class UserBiddingServiceImpl implements UserBiddingService{
	
	@Autowired
	private UserBiddingMapper userBiddingMapper;

	@Override
	public List<UserBidding> userBiddingSelect(UserBidding userBidding) {
		// TODO Auto-generated method stub
		return userBiddingMapper.userBiddingSelect(userBidding);
	}

	@Override
	public Integer userBiddingInsert(UserBidding userBidding) {
		// TODO Auto-generated method stub
		try {
			userBiddingMapper.userBiddingInsert(userBidding);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userBiddingUpdate(UserBidding userBidding) {
		// TODO Auto-generated method stub
		try {
			userBiddingMapper.userBiddingUpdate(userBidding);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer userBiddingDelete(UserBidding userBidding) {
		// TODO Auto-generated method stub
		try {
			userBiddingMapper.userBiddingDelete(userBidding);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
