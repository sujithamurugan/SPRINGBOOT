package com.suji.RevatureService;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suji.RevatureApplication.Role;
import com.suji.RevatureRepository.RoleRepository;

@Service
public class RoleService {
	final static Logger logger = LoggerFactory.getLogger(Role.class);



	@Autowired
	private RoleRepository repository;

	@Transactional
	public Role save(@NotNull @Valid final Role role) {
		logger.debug("Creating {}", role);
		return repository.save(role);
	}

	@Transactional
	public List<Role> findAll() {
		logger.debug("Retrieving the list of all users");
		return repository.findAll();
	}

}
