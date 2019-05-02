package com.osf.web.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public interface EmpService {
	public boolean loginEmp(Map<String,String> emp, HttpSession hs);
	public List<Map<String,String>> selectDeptList();
}
