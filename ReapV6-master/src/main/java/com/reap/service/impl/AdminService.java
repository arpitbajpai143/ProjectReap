package com.reap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reap.dao.IAdminDao;
import com.reap.service.IAdminService;

@Service	
public class AdminService implements IAdminService{
	
	@Autowired
	private IAdminDao adminDao;
	
	@Override
	public boolean updateRole(String newerId, String role) {
		// TODO Auto-generated method stub
		return adminDao.updateRole(newerId,role);
	}

}
