package com.yijie.yilian.client.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.yilian.client.model.Visit;
import com.yijie.yilian.client.service.VisitService;

/**
 * @ 访问量模块
 * @author sunzhu
 *
 */
@RestController
@RequestMapping("/visit")
public class VisitController {

	@Autowired
	private VisitService visitService;

	/**
	 * @访问量列表
	 * @param visit
	 * @return
	 */
	@RequestMapping("/visitTable")
	public Map<String, Object> visitTable(@RequestBody Visit visit) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Visit> visitlist = visitService.visitTable(visit);
			result.put("visitlist", visitlist);
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
	 * @访问记录量添加
	 * @param visit
	 * @return
	 */
	@RequestMapping("/visitAdd")
	public Map<String, Object> visitAdd() {
		Map<String, Object> result = new HashMap<String, Object>();
		Visit visit = new Visit();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
			Date date = new Date();//获取当前时间
			visit.setDate(sdf.parse(sdf.format(date)));
			List<Visit> list = visitService.visitTable(visit);
			if(list.size()!=0) {//没有当天记录
				visit.setVisit(1);
				Integer code = visitService.visitAdd(visit);
				result.put("code", code);
			}else {//有当天记录
				Visit v = new Visit();
				v.setVisit(list.get(0).getVisit()+1);
				Integer code = visitService.visitUpdate(v);
				result.put("code", code);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("code", 0);
			result.put("msg", "系统出错");
			return result;
		}
		return result;
	}

	/**
	 * @访问记录量修改
	 * @param visit
	 * @return
	 */
	@RequestMapping("/visitUpdate")
	public Map<String, Object> visitUpdate(@RequestBody Visit visit) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			Integer code = visitService.visitUpdate(visit);
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

}
