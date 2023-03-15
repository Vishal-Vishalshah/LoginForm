package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isUserValid(String name, String password) {
		
		if(name.equalsIgnoreCase("Vishal") && password.equals("password"))
			return true;
		return false;
		
		
	}
	
}
