package com.core.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.core.entity.User;
import com.core.util.DBUtil;

public class UserDAO {
	
	public static int saveUser(User user) throws Exception {
		int row = 0;
		Connection con = DBUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into user(user_name,email,age) values(?,?,?)");
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getEmail());
		ps.setInt(3, user.getAge());
		
		return row = ps.executeUpdate();
		
		
	}
	
	public static User getUser(Integer userId) throws Exception {
		Connection con = DBUtil.getConnection();
		User user = new User();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user where user_id="+userId);
		while(rs.next()) {
			user.setUserId(rs.getInt("user_id"));
			user.setUserName(rs.getString("user_name"));
			user.setEmail(rs.getString("email"));
			user.setAge(rs.getInt("age"));
		}
		return user;
	}

}
