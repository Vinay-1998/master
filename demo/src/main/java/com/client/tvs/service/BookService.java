package com.client.tvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.tvs.entity.Book;
import com.client.tvs.repositry.BookRepositry;

@Service
public class BookService {
	
	@Autowired
	BookRepositry bookRepositry;

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepositry.save(book);
	}

	
}
