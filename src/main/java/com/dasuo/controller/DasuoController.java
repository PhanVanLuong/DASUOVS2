package com.dasuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DasuoController {
	@RequestMapping("/index")
	public String demo() {
		return "index";
	}
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
	@RequestMapping("/admin")
	public String HomeAdmin() {
		return "admin/homeadmin";
	}

}
