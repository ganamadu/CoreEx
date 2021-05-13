package com.ibm.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.core.entity.Dept;
import com.core.entity.Emp;
import com.core.util.DBUtil;

public class Java8FunctionEx {
	
	public static <A1, A2, R1, R2, R3> R3 genericFunction(A1 a1, A2 a2, 
			BiFunction<A1, A2, R1> biFun,
			Function<R1, R2> fun1,
			Function<R2, R3> fun2) {
		return biFun.andThen(fun1).andThen(fun2).apply(a1, a2);
	}
			
	public static void main(String[] args) throws Exception {
		
		List<Emp> empList = DBUtil.getEmpList();
		List<Dept> deptList = DBUtil.getDeptList();
		
		empList.stream().filter(e->e.getJob().equals("MANAGER") && e.getSal() > 2500 && e.getDeptno() > 10).forEach(e->System.out.println(e.getEname()));;
		System.out.println();
		deptList.stream().forEach(d->System.out.println(d.getDname()));
		System.out.println();
		
		Map<Integer, Emp> empMap = empList.stream().sorted(Comparator.comparing(Emp::getEname)).collect(Collectors.toMap(Emp::getEmpno, Function.identity()));
		empMap.entrySet().forEach(m->System.out.println(m.getValue().getEmpno()+" "+m.getValue().getEname()));
				
		String moreOccurence = "java is good java is used to develop application java give good security java is used to develop web application";
		
		Map<String, Long> strOccurenceCount = Arrays.asList(moreOccurence.split(" ")).stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(strOccurenceCount);
		
		String res = genericFunction(2, 4, (a1,a2)->a1*a2, r->String.valueOf(r), r1->r1);
		System.out.println(res);
	}

}
