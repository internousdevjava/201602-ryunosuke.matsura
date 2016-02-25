package com.internousdev.JissenKadai4.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.JissenKadai4.util.DBConnector;
public class LoginDAO {
	private String admin_name;

	public String select(String user, String password){
		Connection conn = null;
		String ret = "error";
		try{
			conn = (Connection)DBConnector.getConnection();
			String sql = "select * from admin_table where user = ? and password = ?";
			PreparedStatement ps = (PreparedStatement)conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				ret = "success";
				admin_name = rs.getString("user");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	public String getAdmin_name(){
		return admin_name;
	}

	public void setAdmin_name(String admin_name){
		this.admin_name = admin_name;
	}
}
