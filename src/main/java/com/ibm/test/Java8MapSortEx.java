package com.ibm.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.entity.Emp;
import com.core.util.DBUtil;

public class Java8MapSortEx {
	
	public static void main(String[] args) throws Exception {
		
		List<Emp> empList = DBUtil.getEmpList();
		
		Map<Emp, String> empMap = empList.stream().collect(Collectors.toMap(e->e, Emp::getEname));
		System.out.println(empMap);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getEname).thenComparing(Emp::getEmpno))).forEach(m->System.out.println(m.getKey().getEmpno()+"  "+m.getValue()));
		
	}

}
