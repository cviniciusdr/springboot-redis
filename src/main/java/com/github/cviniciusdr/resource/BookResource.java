package com.github.cviniciusdr.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.cviniciusdr.model.Book;

public interface BookResource {

	@GetMapping("/generate-and-save-retrive")
	ResponseEntity<List<Book>> save();

	
}
