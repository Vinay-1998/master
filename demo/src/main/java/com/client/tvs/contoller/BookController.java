package com.client.tvs.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.tvs.entity.Book;
import com.client.tvs.service.BookService;


@RestController
@RequestMapping("/bookShop")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		
		return bookService.saveBook(book);
	}
	

}
