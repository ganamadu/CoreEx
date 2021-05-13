package com.core.core;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.core.service.UserService;

public class TestUserExecutors {
	
	public static List<String> readFile(String fileUrl) throws Exception {
		List<String> fileLines = new ArrayList<>();
		Path path = Paths.get(fileUrl);
		fileLines = Files.readAllLines(path);
		return fileLines;
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(50);
		String filePath = "D:\\UserData.txt";
		
		UserDAO dao = new UserDAO();
		
		readFile(filePath).parallelStream().forEach(line->{
			Future<Integer> feature =  service.submit(new UserService(line, dao));
			try {
				System.out.println(feature.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		service.shutdown();
		
		/*
		 * String str = "User100,user100@gmail.com,28"; StringTokenizer st = new
		 * StringTokenizer(str,","); while(st.hasMoreTokens()) {
		 * System.out.println(st.nextToken()); }
		 */
		
	}

}
