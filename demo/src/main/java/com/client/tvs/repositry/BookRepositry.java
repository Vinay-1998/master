package com.client.tvs.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.tvs.entity.Book;

@Repository
public interface BookRepositry extends JpaRepository<Book, Integer> {
	

}
