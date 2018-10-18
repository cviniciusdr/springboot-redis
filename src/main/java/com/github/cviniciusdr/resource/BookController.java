package com.github.cviniciusdr.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cviniciusdr.model.Book;
import com.github.cviniciusdr.repository.BookRepository;

@RestController
public class BookController implements BookResource {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public ResponseEntity<List<Book>> save() {

		Book book = new Book(8533613407L, "O Senhor Dos Anéis");
		bookRepository.save(book);
		
		book = new Book(9788544102923L, "A Guerra Dos Tronos");
		bookRepository.save(book);
		
		Iterable<Book> books = bookRepository.findAll();
		List<Book> bookList = new ArrayList<>();
		books.forEach(bookList::add);
		return ResponseEntity.ok(bookList);
	}
	
}
