package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.CustomerDAO;
import com.osf.web.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO cdao;
	
	public List<Map<String, String>> selectCustomerList() {
		return cdao.selectCustomerList();
	}

	@Override
	public Map<String, String> selectCustomerByCinum(Integer ciNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCustomer(Map<String, String> user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Map<String, String> user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(Map<String, String> user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
