package com.suji.RevatureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.RevatureApplication.Order;
//import com.suji.RevatureRepository.BookRepository;
import com.suji.RevatureRepository.OrderRepository;

@Service
public class OrderItemService {


	@Autowired
	private OrderRepository orderItemRepository;
	
	//@Autowired
	//private BookRepository bookRepository;

	public void save(Order orderItem) {
		orderItemRepository.save(orderItem);
	}


}