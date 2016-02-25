package com.internousdev.JissenKadai4.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.JissenKadai4.DAO.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String email;
	private String password;
	private Map<String, Object>session;

	public String execute() throws SQLException{
		LoginDAO dao = new LoginDAO();
		String ret = dao.select(email, password);
		session.put("name_key", dao.getAdmin_name());
		return ret;

	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void setSession(Map < String, Object > session){
		this.session = session;
	}


}
