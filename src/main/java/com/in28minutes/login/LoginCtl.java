package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginCtl {
	@Autowired
	LoginService lg;

	@RequestMapping("/")
	public String initial() {
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String sh() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String show(@RequestParam String t1, @RequestParam String t2, Model m ) {
		
	t1=	t1.substring(0, 1).toUpperCase()+t1.substring(1);
	
		
		if(lg.isUserValid(t1, t2)) {
		m.addAttribute("name", t1);
			return "welcome";
		}
		m.addAttribute("ErrorMessage", "Oops!! invalid Credential");
		return "login";
	}
	
}
