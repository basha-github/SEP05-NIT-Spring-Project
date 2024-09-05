package com.nit.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.movie.LoginService;
import com.nit.movie.model.LoginUser;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/nit/loign")
	public String  checkLogin(@RequestBody LoginUser loginUser) {
		
		System.out.println("Data from react--->"+loginUser);
		
		return "true";
	}
	
	
	@PostMapping("/nit/login/add")
	public List<LoginUser>  addNewLoginUser(@RequestBody List<LoginUser> loginUser) {
		
		System.out.println("Data from react--->"+loginUser);
		
		List<LoginUser> newUser =loginService.saveNewUser(loginUser);
		
		return newUser;
	}
}
