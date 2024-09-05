package com.nit.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.movie.model.LoginUser;

public interface LoginRepo  extends JpaRepository<LoginUser, Integer> {

}
