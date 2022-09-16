package com.example.experiment_5.backend;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

  private List<Book> books = new ArrayList();

  public void add(Book book){
    books.add(book);
  }

  public List<Book> findAll(){
    return books;
  }

  public void delete(Book book) {
    books.remove(book);
  }
}