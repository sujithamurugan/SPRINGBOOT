package com.suji.RevatureRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suji.RevatureApplication.Order;
@Repository
public interface OrderRepository  extends JpaRepository<Order , Integer>{
	

}
