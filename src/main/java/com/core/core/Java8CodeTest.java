package com.core.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.core.entity.Dept;
import com.core.entity.Emp;
import com.core.util.DBUtil;

public class Java8CodeTest {
	
	
	
	public static void main(String[] args) throws Exception {
		
		List<Emp> empList = DBUtil.getEmpList();
		List<Dept> deptList = DBUtil.getDeptList();
		
		Optional<Emp> empHighestSal = empList.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).findAny();
		System.out.println("Emp Highest Sal: "+empHighestSal.get().getSal());
		
		Optional<Emp> empSecondHighest =  empList.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).skip(1).findFirst();
		System.out.println("Emp Second Highest Sal: "+empSecondHighest.get().getSal());
		
		Optional<Emp> empThirdHighest = empList.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).skip(3).findFirst();
		System.out.println("Emp Third Highest Sal: "+empThirdHighest.get().getSal());
		
		String empNames = empList.stream().map(Emp::getEname).collect(Collectors.joining(","));
		System.out.println("Emp Names: "+empNames);
		
		String deptNames = deptList.stream().map(Dept::getDname).collect(Collectors.joining(","));
		System.out.println("Dept Names: "+deptNames);
		
		Map<Integer, Double> empSalAvgByDeptNo = empList.stream().collect(Collectors.groupingBy(Emp::getDeptno, Collectors.averagingInt(Emp::getSal)));
		System.out.println("Emp Sal Avg By Dept No: "+empSalAvgByDeptNo);
		
		Map<Integer, Long> empGorupByDeptNo =  empList.stream().collect(Collectors.groupingBy(Emp::getDeptno, Collectors.counting()));
		System.out.println("Emp Group By Dept No: "+empGorupByDeptNo);
		
		Map<Integer, Emp> empSortedMap = empList.stream().sorted(Comparator.comparing(Emp::getSal).thenComparing(Emp::getEname)).collect(Collectors.toMap(Emp::getEmpno, Function.identity()));
		empSortedMap.entrySet().forEach(m->System.out.println(m.getKey()+"	"+m.getValue().getEname()+"	"+m.getValue().getSal()));
		
		Integer sumOfSal = empList.stream().collect(Collectors.summingInt(Emp::getSal));
		System.out.println("Sum Of Emp Sal: "+sumOfSal);
		
		Integer sumOfComm = empList.stream().collect(Collectors.summingInt(Emp::getComm));
		System.out.println("Sum of Emp Commission: "+sumOfComm);
		//Add the two numbers with out + operator
		System.out.println(12-(-4));
		
	}

}
