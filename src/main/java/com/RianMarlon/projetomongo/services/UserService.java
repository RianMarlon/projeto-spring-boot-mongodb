package com.RianMarlon.projetomongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RianMarlon.projetomongo.domain.User;
import com.RianMarlon.projetomongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List <User> findAll() {
		return repo.findAll();
	}
}
