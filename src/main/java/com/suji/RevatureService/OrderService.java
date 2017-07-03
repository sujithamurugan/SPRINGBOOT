package com.suji.RevatureService;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suji.RevatureApplication.Order;
import com.suji.RevatureRepository.OrderRepository;
@Service
public class OrderService {
	final static Logger logger = LoggerFactory.getLogger(Order.class);



	@Autowired
	private OrderRepository repository;

	@Transactional
	public Order save(@NotNull @Valid final Order booksales) {
		logger.debug("Creating {}", booksales);
		return repository.save(booksales);
	}

	@Transactional
	public List<Order> findAll() {
		logger.debug("Retrieving the list of all users");
		return repository.findAll();
	}

	public Order findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
