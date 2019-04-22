package com.yijie.yilian.client.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.utils.LocalUtil;

/**
 * @描述 城市列表接口
 * @author Lucifer
 *
 */
@RestController
@RequestMapping("/city")
public class CityListController {
	
	private LocalUtil localUtil;
	
	/**
	 * @描述 初始化
	 */
	public void iniLocal(){
		this.localUtil = LocalUtil.getInstance();
	}
	
	/**
	 * @描述 获取国家列表
	 * @return
	 */
	@RequestMapping("/getCountry")
	public List<String> getCountry(){
		iniLocal();
		return localUtil.getCountry();
	}
	
	/**
	 * @描述 根据国家获取省份
	 * @return
	 */
	@RequestMapping("/getProvince")
	public List<String> getProvince(String countryName){
		iniLocal();
		return localUtil.getProvinces(countryName);
	}
	
	/**
	 * @描述 根据国家名和省份名获取城市列表
	 * @return
	 */
	@RequestMapping("/getCitys")
	public List<String> getCitys(String countryName,String provinceName){
		iniLocal();
		return localUtil.getCities(countryName, provinceName);
	}

}
