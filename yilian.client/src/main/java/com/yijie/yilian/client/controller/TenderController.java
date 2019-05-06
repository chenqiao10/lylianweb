package com.yijie.yilian.client.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.Tender;
import com.yijie.yilian.client.model.TenderDesign;
import com.yijie.yilian.client.service.TenderService;

/**
 * @描述 标书执行模块
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/tender")
public class TenderController {
	
	@Autowired
	private TenderService tenderService;
	
	/**
	 * @描述 创建标书
	 * @param tender
	 * @return
	 */
	@RequestMapping("/tenderBuild")
	public Map<String,Object> tenderBuild(@RequestBody Tender tender){
		Map<String,Object> result = new HashMap<String, Object>();
		Integer code = tenderService.tenderBuild(tender);
		result.put("code", code);
		return result;
	}
	
	/**
	 * @描述 标书列表
	 * @param tender
	 * @return
	 */
	@RequestMapping("/tenderTable")
	public Map<String,Object> tenderTable(@RequestBody Tender tender){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			List<Tender> tenderTable = tenderService.tenderTable(tender);
			result.put("tenderTable", tenderTable);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "查询出错");
			return result;
		}
	}
	
	/**
	 * @描述 标书详细信息
	 * @param tender
	 * @return
	 */
	@RequestMapping("/tenderMessage")
	public Map<String,Object> tenderMessage(@RequestBody Tender tender){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Tender tenderMessage = tenderService.tenderMessage(tender);
			result.put("tenderMessage", tenderMessage);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "查询出错");
			return result;
		}
	}
	
	/**
	 * @描述 标书信息更新
	 * @param tender
	 * @return
	 */
	@RequestMapping("/tenderUpdate")
	public Map<String,Object> tenderUpdate(@RequestBody Tender tender){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Tender tenderUpdate = tenderService.tenderUpdate(tender);
			result.put("tender", tenderUpdate);
			result.put("code", 1);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "信息更改失败");
			return result;
		}
	}
	
	/**
	 * @描述 标书删除
	 * @param tender
	 * @return
	 */
	@RequestMapping("/tenderDelete")
	public Map<String,Object> tenderDelete(@RequestBody Tender tender){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = tenderService.tenderDelete(tender);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	/**
	 * @描述 标书附件添加
	 * @param tenderDesigns
	 * @return
	 */
	@RequestMapping("/tenderDesignAdd")
	public Map<String,Object> tenderDesignAdd(@RequestBody List<TenderDesign> tenderDesigns){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = tenderService.tenderDesignAdd(tenderDesigns);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 标书附件更新
	 * @param tenderDesigns
	 * @return
	 */
	@RequestMapping("/tenderDesignUodate")
	public Map<String,Object> tenderDesignUodate(@RequestBody List<TenderDesign> tenderDesigns){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = tenderService.tenderDesignUodate(tenderDesigns);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}
	
	
	/**
	 * @描述 标书附件删除
	 * @param tenderDesigns
	 * @return
	 */
	@RequestMapping("/tenderDesignDelete")
	public Map<String,Object> tenderDesignDelete(@RequestBody TenderDesign tenderDesign){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			Integer code = tenderService.tenderDesignDelete(tenderDesign);
			result.put("code", code);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
	}

}
