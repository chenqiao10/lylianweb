package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yijie.data.client.dao.SuperAdminMapper;
import com.yijie.data.client.model.Admin;
import com.yijie.data.client.model.SuperAdmin;
import com.yijie.data.client.service.SuperAdminService;

@Service
@Transactional
public class SuperAdminServiceImpl implements SuperAdminService {
	@Autowired
	SuperAdminMapper superAdminMapper;

	@Override
	public Integer superAdminInsert(SuperAdmin superAdmin) {
		try {
			superAdminMapper.superAdminInsert(superAdmin);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

	@Override
	public Integer superAdminUpdate(SuperAdmin superAdmin) {
		try {
			superAdminMapper.superAdminUpdate(superAdmin);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

	@Override
	public Integer superAdminDelete(SuperAdmin superAdmin) {
		try {
			superAdminMapper.superAdminDelete(superAdmin);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

	@Override
	public List<SuperAdmin> superAdminSelect(SuperAdmin superAdmin) {
		try {
			return superAdminMapper.superAdminSelect(superAdmin);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SuperAdmin superAdminLogin(SuperAdmin superAdmin) {
		
			try {
				List<SuperAdmin> list = superAdminMapper.superAdminSelect(superAdmin);
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

}
