package com.example.experiment_5.backend;

import java.util.Collection;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

@Service
public class BookService implements CrudListener<Book> {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public Collection<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public Book add(Book book) {
    bookRepository.add(book);
    return book;
  }

  @Override
  public Book update(Book book) {
    bookRepository.add(book);
    return book;
  }

  @Override
  public void delete(Book book) {
    bookRepository.delete(book);
  }
}
