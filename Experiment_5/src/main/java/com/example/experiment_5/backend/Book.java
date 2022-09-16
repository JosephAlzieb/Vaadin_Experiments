
package com.example.experiment_5.backend;//package com.example.experiment_5.backend;

import java.time.LocalDate;

public class Book {

  private Long id;

  private String title;

  private LocalDate published;

  private Integer rating;

  public Book(String title, LocalDate published, Integer rating) {
    this.title = title;
    this.published = published;
    this.rating = rating;
  }

  public Book() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getPublished() {
    return published;
  }

  public void setPublished(LocalDate published) {
    this.published = published;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }
}
