package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerDAO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SqlSession ss;
	
	public List<Map<String, String>> selectCustomerList() {
		return ss.selectList("customer.selectCustomerList");
	}

	public Map<String, String> selectCustomerByCinum(Integer ciNum) {
		return null;
	}

	public int insertCustomer(Map<String, String> user) {
		return 0;
	}

	public int updateCustomer(Map<String, String> user) {
		return 0;
	}

	public int deleteCustomer(Map<String, String> user) {
		return 0;
	}

}
