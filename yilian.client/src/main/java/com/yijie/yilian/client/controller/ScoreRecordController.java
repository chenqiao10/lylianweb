package com.yijie.yilian.client.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.ScoreRecord;
import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.ScoreRecordService;
import com.yijie.yilian.client.service.UserHandleService;

/**
 * 积分记录
 * 
 * @author sunzhu
 *
 */
@RestController
@RequestMapping("/user")
public class ScoreRecordController {

	@Autowired
	private ScoreRecordService scoreRecordService;

	@Autowired
	private UserHandleService userHandleService;

	/**
	 * 积分记录查询
	 * 
	 * @param scoreRecord
	 * @return
	 */
	@RequestMapping("/ScoreRecordSelect")
	public Map<String, Object> ScoreRecordSelect(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<ScoreRecord> scoreRecordlist = scoreRecordService.scoreRecordTable(scoreRecord);
			result.put("scoreRecordlist", scoreRecordlist);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	/**
	 * @ 查询是否签到
	 * 
	 * @param scoreRecord
	 * @return
	 */
	@RequestMapping("/ScoreRecordSignIn")
	public Map<String, Object> ScoreRecordSignIn(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			scoreRecord.setDate(new Date());
			if (scoreRecord.getType() == 0 && scoreRecord.getDate() != null && scoreRecord.getUser_uuid() != null) {
				List<ScoreRecord> list = scoreRecordService.scoreRecordTable(scoreRecord);
				// 判断是否签到
				if (list.size() != 0) {
					result.put("audit", 1);// 已签到
				} else {
					result.put("audit", 0);// 未签到
				}
			}
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	/**
	 * 添加积分记录
	 * 
	 * @param scoreRecord
	 * @return
	 */
	@RequestMapping("/ScoreRecordInsert")
	public Map<String, Object> ScoreRecordInsert(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		User user = new User();
		try {
			scoreRecord.setDate(new Date());
			user.setUuid(scoreRecord.getUser_uuid());
			User u = userHandleService.userLogin(user);
			// 交换项目修改账户积分
			if (scoreRecord.getType() == 3) {
				if (u.getBalance() >= scoreRecord.getScore()) {
					user.setBalance(u.getBalance() - scoreRecord.getScore());
				} else {
					result.put("code", 3);//积分不足
					return result;
				}
			} else if (scoreRecord.getType() == 0 && scoreRecord.getDate() != null
					&& scoreRecord.getUser_uuid() != null) {
				// 签到加积分
				List<ScoreRecord> list = scoreRecordService.scoreRecordTable(scoreRecord);
				// 判断是否签到
				if (list.size() != 0) {
					result.put("audit", 1);
					return result;
				} else {
					user.setBalance(u.getBalance() + scoreRecord.getScore());
					result.put("audit", 0);
				}
			}
			userHandleService.userUpdate(user);
			Integer code = scoreRecordService.scoreRecordAdd(scoreRecord);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	/**
	 * 删除积分记录
	 * 
	 * @param scoreRecord
	 * @return
	 */
	@RequestMapping("/ScoreRecordDelete")
	public Map<String, Object> ScoreRecordDelete(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Integer code = scoreRecordService.scoreRecordDelete(scoreRecord);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	/**
	 * 修改积分记录
	 * 
	 * @param scoreRecord
	 * @return
	 */
	@RequestMapping("/ScoreRecordUpdate")
	public Map<String, Object> ScoreRecordUpdate(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Integer code = scoreRecordService.scoreRecordUpdate(scoreRecord);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

	@RequestMapping("/ScoreRecordCount")
	public Map<String, Object> ScoreRecordCount(@RequestBody ScoreRecord scoreRecord) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Integer count = scoreRecordService.ScoreRecordCount(scoreRecord);
			result.put("count", count);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

}
