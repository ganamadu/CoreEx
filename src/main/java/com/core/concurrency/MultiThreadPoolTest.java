package com.core.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

import com.core.entity.Emp;
import com.core.util.DBUtil;

public class MultiThreadPoolTest {

	MultiThreadPool threadPool = MultiThreadPool.getInstance();
	Queue<Future<Object>> futures = new ConcurrentLinkedQueue<Future<Object>>();

	public static int count = 0;

	public void getEmpList() throws Exception {

		Callable<Object> empListToken = new Callable<Object>() {

			@Override
			public Emp call() throws Exception {
				return DBUtil.getEmpList().get(0);
			}
		};
		futures.add(threadPool.getFutureReference(empListToken));
		disp();
	}

	public void getEmpList1() throws Exception {

		Callable<Object> empListToken = new Callable<Object>() {

			@Override
			public Emp call() throws Exception {
				return DBUtil.getEmpList().get(1);
			}
		};
		futures.add(threadPool.getFutureReference(empListToken));
		disp();
	}

	public void getEmpList2() throws Exception {

		Callable<Object> empListToken = new Callable<Object>() {

			@Override
			public Emp call() throws Exception {
				return DBUtil.getEmpList().get(2);
			}
		};
		futures.add(threadPool.getFutureReference(empListToken));
		disp();
	}

	public void getEmpList3() throws Exception {

		Callable<Object> empListToken = new Callable<Object>() {

			@Override
			public Emp call() throws Exception {
				return DBUtil.getEmpList().get(3);
			}
		};
		futures.add(threadPool.getFutureReference(empListToken));
		disp();
	}

	public void getEmpList4() throws Exception {

		Callable<Object> empListToken = new Callable<Object>() {

			@Override
			public Emp call() throws Exception {
				return DBUtil.getEmpList().get(4);
			}
		};
		futures.add(threadPool.getFutureReference(empListToken));
		disp();
	}

	public void disp() throws Exception {
		Future<Object> empFuture = futures.iterator().next();
		Emp emp = (Emp) empFuture.get();
		System.out.println(emp.getEname());
	}

	public void disp(Emp e) throws Exception {
		System.out.println(e.getEname());
	}

	public void getEmp0() throws Exception {
		Emp e = DBUtil.getEmpList().get(0);
		disp(e);
	}

	public void getEmp1() throws Exception {
		Emp e = DBUtil.getEmpList().get(1);
		disp(e);
	}

	public void getEmp2() throws Exception {
		Emp e = DBUtil.getEmpList().get(2);
		disp(e);
	}

	public void getEmp3() throws Exception {
		Emp e = DBUtil.getEmpList().get(3);
		disp(e);
	}

	public void getEmp4() throws Exception {
		Emp e = DBUtil.getEmpList().get(4);
		disp(e);
	}

	public static void main(String[] args) throws Exception {
		MultiThreadPoolTest threadPool = new MultiThreadPoolTest();
		long start = System.currentTimeMillis();
		
		/*
		 * while(true) { new MultiThreadPoolTest().getEmpList(); new
		 * MultiThreadPoolTest().getEmpList1(); new MultiThreadPoolTest().getEmpList2();
		 * new MultiThreadPoolTest().getEmpList3(); new
		 * MultiThreadPoolTest().getEmpList4();
		 * 
		 * if(count < 100) { count++; } else { break; }
		 * 
		 * }
		 */
		 
		
		
		
		  while(true) {
		  
		  new MultiThreadPoolTest().getEmp0(); new MultiThreadPoolTest().getEmp1(); new
		  MultiThreadPoolTest().getEmp2(); new MultiThreadPoolTest().getEmp3(); new
		  MultiThreadPoolTest().getEmp4();
		  
		  if(count < 100) { count++; } else { break; }
		  
		  }
		 
		
		 System.out.println("Total Time: "+(System.currentTimeMillis()-start));
	}

}
