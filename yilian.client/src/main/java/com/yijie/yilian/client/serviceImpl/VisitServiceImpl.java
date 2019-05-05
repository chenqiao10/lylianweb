package com.yijie.yilian.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.yilian.client.daoClient.VisitDao;
import com.yijie.yilian.client.model.Visit;
import com.yijie.yilian.client.service.VisitService;



@Service
public class VisitServiceImpl implements VisitService{
	
	@Autowired
	private VisitDao visitDao;

	@Override
	public Integer visitAdd(Visit visit) {
		// TODO Auto-generated method stub
		return visitDao.visitInsert(visit);
	}

	@Override
	public List<Visit> visitTable(Visit visit) {
		// TODO Auto-generated method stub
		return visitDao.visitSelect(visit);
	}

	@Override
	public Integer visitUpdate(Visit visit) {
		// TODO Auto-generated method stub
		return visitDao.visitUpdate(visit);
	}

}
