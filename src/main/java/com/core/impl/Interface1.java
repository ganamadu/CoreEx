package com.core.impl;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.core.entity.Emp;
import com.core.util.DBUtil;

public class Interface1 implements Inter2, Inter1 {
	
	public static Predicate<Emp> empPred = (e->e.getJob().equals("MANAGER") && e.getDeptno()>10 && e.getSal() > 2500);
	
	public static void main(String args[]) throws Exception {
		
		List<Emp> empList = DBUtil.getEmpList();
		
		Map<Integer, Emp> empMap = empList.stream().collect(Collectors.toMap(Emp::getEmpno, Function.identity()));
		
		System.out.println(empMap);
		
//		empList.stream().filter(empPred.and(empPred))
		
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Inter1.super.message();
		Inter2.super.message();
	}

}
