package com.github.cviniciusdr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.cviniciusdr.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String>{

}
