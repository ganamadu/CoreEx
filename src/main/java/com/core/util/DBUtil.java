package com.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.core.entity.Dept;
import com.core.entity.Emp;

public class DBUtil {

	private static Connection con = null;

	public static Connection getConnection() {
		if(con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
				System.out.println("Connection created....");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static List<Emp> getEmpList() throws Exception {
		List<Emp> empList = new ArrayList<>();
		
		PreparedStatement ps = getConnection().prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Emp emp = new Emp();
			emp.setEmpno(rs.getInt("empno"));
			emp.setEname(rs.getString("ename"));
			emp.setJob(rs.getString("job"));
			emp.setMgr(rs.getInt("mgr"));
			emp.setHiredate(rs.getString("hiredate"));
			emp.setSal(rs.getInt("sal"));
			emp.setComm(rs.getInt("comm"));
			emp.setDeptno(rs.getInt("deptno"));
			empList.add(emp);
		}
		return empList;
	}
	
	public static List<Dept> getDeptList() throws Exception {
		List<Dept> deptList = new ArrayList<>();
		PreparedStatement ps = getConnection().prepareStatement("select * from department");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Dept dept = new Dept();
			dept.setDeptno(rs.getInt("deptno"));
			dept.setDname(rs.getString("dname"));
			dept.setLoc(rs.getString("loc"));
			deptList.add(dept);
		}
		return deptList;
	}

}
