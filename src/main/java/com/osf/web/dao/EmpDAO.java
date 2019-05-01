package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface EmpDAO {
	
	public Map<String,String> selectEmpById(Map<String, String> emp);
	public List<Map<String,String>> selectEmpList(Map<String, String> emp);
}
