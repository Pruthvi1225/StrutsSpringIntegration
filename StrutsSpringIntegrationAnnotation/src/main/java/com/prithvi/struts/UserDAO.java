package com.prithvi.struts;

public class UserDAO {

	public boolean checkLogin(User user){
		return user.getUsername().equals("admin") && user.getPassword().equals("patel");
	}
}
