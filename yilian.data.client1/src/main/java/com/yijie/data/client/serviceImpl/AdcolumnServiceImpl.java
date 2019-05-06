package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.AdcolumnMapper;
import com.yijie.data.client.model.Adcolumn;
import com.yijie.data.client.service.AdcolumnService;

@Service
public class AdcolumnServiceImpl implements AdcolumnService {
	
	@Autowired
	private AdcolumnMapper adcolumnMapper;

	@Override
	public Integer adcolumnInsert(Adcolumn adcolumn) {
		try {
			adcolumnMapper.adcolumnInsert(adcolumn);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public Integer adcolumnDelete(Adcolumn adcolumn) {
		try {
			adcolumnMapper.adcolumnDelete(adcolumn);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer adcolumnUpdate(Adcolumn adcolumn) {
		try {
			adcolumnMapper.adcolumnUpdate(adcolumn);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Adcolumn> adcolumnSelect(Adcolumn adcolumn) {
		try {
			List<Adcolumn> list = adcolumnMapper.adcolumnSelect(adcolumn);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
