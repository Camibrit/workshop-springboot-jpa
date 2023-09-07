package com.educandoweb.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Service
	public class UserService {

		@Autowired
		private UserRepository repository;
		
		public List<User> findAll() {
			return repository.findAll();
		}
}