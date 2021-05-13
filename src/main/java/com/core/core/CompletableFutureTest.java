package com.core.core;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.core.entity.Emp;
import com.core.util.DBUtil;

public class CompletableFutureTest {
	
	public static CompletableFuture<List<Emp>> empListFuture() throws Exception {
		return CompletableFuture.supplyAsync(() -> {
			try {
				return DBUtil.getEmpList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
	}

	
	public static void main(String args[]) throws Exception {
		
		empListFuture().get().stream().forEach(emp->System.out.println(emp.getEmpno()+"  "+emp.getEname()));
		
	}

}
