package com.suji.RevatureRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suji.RevatureApplication.Book;
@Repository
public interface BookRepository extends JpaRepository<Book , Integer>{

}
