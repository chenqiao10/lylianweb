package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.Visit;
import com.yijie.data.client.service.VisitService;

@RestController
@RequestMapping("/admin")
public class VisitDaoController {
	@Autowired
	private VisitService visitService;

	// 日誌刪除
	@RequestMapping("/visitInsert")
	public Integer visitInsert(@RequestBody Visit visit) {
		System.out.println(visit);
		return visitService.visitInsert(visit);

	}

	@RequestMapping("/visitDelete")
	public Integer visitDelete(@RequestBody Visit visit) {
		System.out.println(visit);
		return visitService.visitDelete(visit);

	}

	@RequestMapping("/visitUpdate")
	public Integer visitUpdate(@RequestBody Visit visit) {
		System.out.println(visit);
		return visitService.visitUpdate(visit);

	}

	// 项目列表
	@RequestMapping("/visitSelect")
	public List<Visit> visitSelect(@RequestBody Visit visit) {
		return visitService.visitSelect(visit);
	}
}
