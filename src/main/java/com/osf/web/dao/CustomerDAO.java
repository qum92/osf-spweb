package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerDAO {

	public List<Map<String,String>> selectCustomerList();
	public Map<String,String> selectCustomerByCinum(Integer ciNum);
	public int insertCustomer(Map<String,String> user);
	public int updateCustomer(Map<String,String> user);
	public int deleteCustomer(Map<String,String> user);
}
