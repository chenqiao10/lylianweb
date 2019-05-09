package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.VisitDao;
import com.yijie.yilian.client.model.Visit;

@Component
public class VisitDaoClientFallBack implements VisitDao{

	@Override
	public List<Visit> visitSelect(Visit visit) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Integer visitInsert(Visit visit) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public Integer visitUpdate(Visit visit) {
		// TODO 自动生成的方法存根
		return 0;
	}

}
