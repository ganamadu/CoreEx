package com.core.core;

import java.util.List;

import com.core.entity.Dept;
import com.core.entity.Emp;
import com.core.util.DBUtil;

public class EmpDeptAggergationTest {
	
	public static void main(String[] args) throws Exception {
		
		List<Emp> empList = DBUtil.getEmpList();
		System.out.println(empList.size());
		List<Dept> deptList = DBUtil.getDeptList();
		System.out.println(deptList.size());
	}

}
