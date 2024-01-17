package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.domain.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);

		var book = new Book("2345", "On Java", "Bruce", 10.99);

		System.out.printf("book isbn:"+book.isbn());

	}

}
