package com.michael.vue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.vue.entity.User;
import com.michael.vue.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/getAll")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
}
