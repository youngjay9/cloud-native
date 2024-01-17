package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException{

  public BookAlreadyExistsException(String message) {
    super(message);
  }
}
