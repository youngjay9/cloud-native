package com.polarbookshop.catalogservice.domain;

public record Book(
    String isbn,
    String title,
    String author,
    Double price
) {

  public boolean priceIsHigh() {
    return price > 20.00 ? true : false;
  }
}
