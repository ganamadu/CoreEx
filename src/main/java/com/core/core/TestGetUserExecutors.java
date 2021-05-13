package com.core.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.core.entity.User;
import com.core.service.GetUserProcess;

public class TestGetUserExecutors {
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newFixedThreadPool(50);
		UserDAO dao = new UserDAO();
		List<User> userList = new ArrayList<>();
		for(int i=1; i<=500; i++) {
			Future<User> feature = executorService.submit(new GetUserProcess(i, dao));
			userList.add(feature.get());
			//System.out.println(feature.get().getUserName());
		}
		
		Map<Integer, Long> ageGroupMap =  userList.stream().collect(Collectors.groupingBy(User::getAge, Collectors.counting()));
		System.out.println("Age Group Map: "+ageGroupMap);
		System.out.println();
		
		String namesListwith20 = userList.stream().filter(u->u.getAge()==25).map(User::getUserName).collect(Collectors.joining(","));
		System.out.println("Names List 10 Group: "+namesListwith20);

		List<String> strList = Arrays.asList(namesListwith20.split(","
				+ ""));
		Spliterator<String> spliterator = strList.spliterator();
		spliterator.tryAdvance(System.out::println);
		spliterator.forEachRemaining(System.out::println);
		
		
		executorService.shutdown();
	}

}
