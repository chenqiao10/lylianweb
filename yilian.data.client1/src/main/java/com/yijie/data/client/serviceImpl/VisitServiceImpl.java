package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yijie.data.client.dao.VisitMapper;
import com.yijie.data.client.model.Visit;
import com.yijie.data.client.service.VisitService;

@Service
@Transactional
public class VisitServiceImpl implements VisitService {
	@Autowired
	private VisitMapper VisitMapper;

	@Override
	public Integer visitInsert(Visit visit) {
		try {
			VisitMapper.visitInsert(visit);
			return 1;
		} catch (Exception e) {
		}
		return 0;

	}


	@Override
	public List<Visit> visitSelect(Visit visit) {
		try {
			return VisitMapper.visitSelect(visit);
		} catch (Exception e) {
			return null;
		}
	}

	// 日志刪除
	@Override
	public Integer visitDelete(Visit visit) {
		try {
			VisitMapper.visitDelete(visit);
			return 1;
		} catch (Exception e) {
			return 0;// TODO: handle exception
		}
		// TODO 自动生成的方法存根

	}

	// 日志更新
	@Override
	public Integer visitUpdate(Visit visit) {
		try {
			VisitMapper.visitUpdate(visit);
			return 1;
		} catch (Exception e) {
			return 0;
		}
		// TODO 自动生成的方法存根

	}

}
