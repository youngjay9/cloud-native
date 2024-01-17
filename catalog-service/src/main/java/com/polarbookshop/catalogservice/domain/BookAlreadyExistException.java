package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistException extends
    RuntimeException {

  public BookAlreadyExistException(String isbn) {
    super("The Book with ISBN:" + isbn + "already exists.");
  }
}
