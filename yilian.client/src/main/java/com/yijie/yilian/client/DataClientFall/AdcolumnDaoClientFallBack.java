package com.yijie.yilian.client.DataClientFall;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yijie.yilian.client.daoClient.AdcolumnDao;
import com.yijie.yilian.client.model.Adcolumn;

@Component
public class AdcolumnDaoClientFallBack implements AdcolumnDao {

	@Override
	public List<Adcolumn> adcolumnSelect(Adcolumn adcolumn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer adcolumnDelete(Adcolumn adcolumn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer adcolumnUpdate(Adcolumn adcolumn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer adcolumnInsert(Adcolumn adcolumn) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
