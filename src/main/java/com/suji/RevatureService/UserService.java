package com.suji.RevatureService;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.suji.RevatureApplication.User;

import com.suji.RevatureRepository.UserRepository;
@Service
public class UserService {
	final static Logger logger = LoggerFactory.getLogger(User.class);



	@Autowired
	private UserRepository repository;

	@Transactional
	public User save(@NotNull @Valid final User user) {
		logger.debug("Creating {}", user);
		return repository.save(user);
	}

	@Transactional
	public List<User> findAll() {
		logger.debug("Retrieving the list of all users");
		return repository.findAll();
	}
	@Transactional
	public User login(String username,String password) {
		logger.debug("Creating {}", username,password);
		return repository.loginUser(username,password);
	}
	
	@Transactional
	public User update(String username,String password) {
		logger.debug("Creating {}", username,password);
		return repository.passwordUpdate(username,password);
	}

}
