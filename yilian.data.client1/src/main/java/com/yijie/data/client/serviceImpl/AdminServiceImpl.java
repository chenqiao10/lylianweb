package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yijie.data.client.dao.AdminMapper;
import com.yijie.data.client.model.Admin;
import com.yijie.data.client.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Integer adminInsert(Admin admin) {
		try {
			adminMapper.adminInsert(admin);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer adminUpdate(Admin admin) {
		try {
			adminMapper.adminUpdate(admin);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public Integer adminDelete(Admin admin) {
		try {
			adminMapper.adminDelete(admin);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public List<Admin> adminSelect(Admin admin) {
		try {
			List<Admin> list = adminMapper.adminSelect(admin);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Admin adminLogin(Admin admin) {
		try {
			List<Admin> list = adminMapper.adminSelect(admin);
			if (list.size() == 0) {
				return null;
			} else {
				return list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Integer adminCount(Admin admin) {
	try {
		return	adminMapper.adminCount(admin);
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
		return 0;

	}
	 	}

	@Override
	public Integer adminDeleteAll(List<Admin> list) {
			try {
				return adminMapper.adminDeleteAll(list);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				return 0;
			}
	}

}
