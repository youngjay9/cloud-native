package com.polarbookshop.catalogservice.domain;

import java.util.Optional;

public interface BookRepository {

  Iterable<Book> findAll();

  Optional<Book> findByIsbn(String isbn);

  boolean existIsbn(String isbn);

  Book save(Book book);

  void deleteByIsbn(String isbn);
}
