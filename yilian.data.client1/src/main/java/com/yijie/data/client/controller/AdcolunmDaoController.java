package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.Adcolumn;
import com.yijie.data.client.service.AdcolumnService;

@RestController
@RequestMapping("/admin")
public class AdcolunmDaoController {
	@Autowired
	private AdcolumnService adcolumnService;

	// 广告列表查找
	@RequestMapping("/adcolumnSelect")
	public List<Adcolumn> adcolumnSelect(@RequestBody Adcolumn adcolumn) {
		return adcolumnService.adcolumnSelect(adcolumn);
	}

	// 广告更新
	@RequestMapping("/adcolumnUpdate")
	public Integer adcolumnUpdate(@RequestBody Adcolumn adcolumn) {
		return adcolumnService.adcolumnUpdate(adcolumn);
	}

	// 广告删除
	@RequestMapping("/adcolumnDelete")
	public Integer adcolumnDelete(@RequestBody Adcolumn adcolumn) {
		return adcolumnService.adcolumnDelete(adcolumn);
	}

	// 广告增加
	@RequestMapping("/adcolumnInsert")
	public Integer adcolumnInsert(@RequestBody Adcolumn adcolumn) {
		return adcolumnService.adcolumnInsert(adcolumn);

	}

}
