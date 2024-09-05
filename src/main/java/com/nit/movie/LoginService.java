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

}
