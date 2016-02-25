package com.internousdev.JissenKadai4.DTO;

public class LoginDTO {
	private static String username;
	private static String password;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		LoginDTO.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		LoginDTO.username = username;
	}
}

