package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.VisitDaoClientFallBack;
import com.yijie.yilian.client.model.Visit;

/**
 * @访问量模块
 * @author sunzhu
 *
 */
@FeignClient(name="yijie.zuul.api", fallback = VisitDaoClientFallBack.class)
public interface VisitDao {

	// 积分记录查询
	@RequestMapping("/yilianData/visit/visitSelect")
	public List<Visit> visitSelect(Visit visit);

	// 积分记录添加
	@RequestMapping("/yilianData/visit/visitInsert")
	public Integer visitInsert(Visit visit);

	// 积分记录更新
	@RequestMapping("/yilianData/visit/visitUpdate")
	public Integer visitUpdate(Visit visit);

}
