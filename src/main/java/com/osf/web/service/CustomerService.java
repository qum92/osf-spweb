package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerService {
	
	public List<Map<String,String>> selectCustomerList();
	public Map<String,String> selectCustomerByCinum(Integer ciNum);
	public int insertCustomer(Map<String,String> user);
	public int updateCustomer(Map<String,String> user);
	public int deleteCustomer(Map<String,String> user);
}
