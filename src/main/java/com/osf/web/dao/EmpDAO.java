package com.osf.web.dao;

import java.util.List;
import java.util.Map;

import com.osf.web.vo.EmpVO;

public interface EmpDAO {
	
	public Map<String,String> selectEmpById(Map<String, String> emp);
	public List<Map<String,String>> selectEmpList(Map<String, String> emp);
	public List<EmpVO> selectEmpList2(Map<String, String> emp);
}
