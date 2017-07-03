package com.suji.RevatureService;

import java.util.List;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suji.RevatureApplication.Book;
import com.suji.RevatureRepository.BookRepository;
@Service
public class BookService {

	 final static Logger logger = LoggerFactory.getLogger(Book.class);



	@Autowired
	private BookRepository repository;

	@Transactional
	public Book save(@NotNull @Valid final Book book) {
		logger.debug("Creating {}", book);
		return repository.save(book);
	}

	@Transactional
	public List<Book> findAll() {
		logger.debug("Retrieving the list of all users");
		return repository.findAll();
	}
	@Transactional
	public Book findOne(int isbnid) {
		return repository.findOne(isbnid);
	}
}


