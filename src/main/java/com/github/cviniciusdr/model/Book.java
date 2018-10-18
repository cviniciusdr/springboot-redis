package com.github.cviniciusdr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@RedisHash("Book")
public class Book {
	
	@Id
	private Long isbn;
	private String name;
	
}
