package com.nit.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.movie.model.LoginUser;
import com.nit.movie.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepo loginRepo;

	public List<LoginUser> saveNewUser(List<LoginUser> loginUser) {
		
		
		List<LoginUser> dbUser =  loginRepo.saveAll(loginUser);
		
		return dbUser;
	}

	public String isValidUser(LoginUser loginUser) {
		String res = "fail";
		LoginUser dbUser = loginRepo.findByName(loginUser.getName());
		
		if(dbUser != null) {
			if(
					(dbUser.getName().equalsIgnoreCase(loginUser.getName()))
					&&
					(dbUser.getPassword().equalsIgnoreCase(loginUser.getPassword()))
					){
				res = "success";
			}
		}
		
		return res;
	}

	public LoginUser updateUser(LoginUser loginUser) {
		
		String res = isValidUser(loginUser);
		if(res.equalsIgnoreCase("success")) {
			
			return loginRepo.save(loginUser);
		}
		else {
			return new LoginUser("No data found","invalid password");
		}
		
	}

	public String deleteUser(int id) {
		String res = "success";
		try {
			
			loginRepo.deleteById(id);
			LoginUser dbuser = loginRepo.findById(id).get();
			
		}catch(Exception e) {
			res = "fail";
		}
		
		
		return res;
	}

}
