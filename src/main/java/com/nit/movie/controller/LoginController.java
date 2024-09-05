package com.nit.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.movie.LoginService;
import com.nit.movie.model.LoginUser;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/nit/login")
	public String  checkLogin(@RequestParam String username,String password) {
		
		
		LoginUser loginUser = new LoginUser(username,password);
		
		return loginService.isValidUser(loginUser);
		
	}
	
	
	@PostMapping("/nit/login/add")
	public List<LoginUser>  addNewLoginUser(@RequestBody List<LoginUser> loginUser) {
		
		System.out.println("Data from react--->"+loginUser);
		
		List<LoginUser> newUser =loginService.saveNewUser(loginUser);
		
		return newUser;
	}
	
	
	@PutMapping("/nit/login/update")
	public LoginUser  updateUser(@RequestBody LoginUser loginUser) {
		
		System.out.println("Data from react--->"+loginUser);
		
		return loginService.updateUser(loginUser);
		
		
	}
	@DeleteMapping("/nit/login/delete")
	public String  updateUser(@RequestParam int id) {
		
		
		
		return loginService.deleteUser(id);
		
		
	}
}
