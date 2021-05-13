package com.core.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.core.entity.Emp;
import com.core.util.DBUtil;

public class Java8FeaturesTest {
	
	public static void main(String ags[]) throws Exception {
		List<Emp> empList = DBUtil.getEmpList();
		
		Optional<Emp> highestSal = empList.stream().sorted(Comparator.comparingInt(Emp::getSal).reversed()).findFirst();
		System.out.println("Emp Highest Sal: "+highestSal.get().getSal());
		
		Optional<Emp> secondHighestSal = empList.stream().sorted(Comparator.comparingInt(Emp::getSal).reversed()).skip(1).findFirst();
		System.out.println("Emp Second Highest Sal: "+secondHighestSal.get().getSal());
		
		String empNames = empList.stream().map(Emp::getEname).collect(Collectors.joining(","));
		System.out.println("Employe Names: "+empNames);
		
		Map<Integer, Long> groupByDeptMap =  empList.stream().collect(Collectors.groupingBy(Emp::getDeptno, Collectors.counting()));
		System.out.println("Group By DeptNo: "+groupByDeptMap);
		
		Map<Integer, Double> avgSalByDeptNo =  empList.stream().collect(Collectors.groupingBy(Emp::getDeptno, Collectors.averagingInt(Emp::getSal)));
		System.out.println("Avg Sal By Dept No: "+avgSalByDeptNo);
		
		empList.stream().filter(e->e.getJob().equals("MANAGER")).filter(e->e.getSal()>2500).filter(e->e.getDeptno() > 10).forEach(e->System.out.println(e.getEname()));
		
		empList.stream().filter(e->e.getJob().equals("MANAGER") && e.getSal()>2500 && e.getDeptno() >10).forEach(e->System.out.println(e.getEname().toLowerCase()));
		
		Void nil = null;
	}

}
