package com.example.experiment_5.backend;

import java.util.Collection;

;

public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Collection<Book> findAll() {
    return bookRepository.findAll();
  }

  public void add(Book book) {
    bookRepository.add(book);
  }

  public void delete(Book book) {
    bookRepository.delete(book);
  }
}
