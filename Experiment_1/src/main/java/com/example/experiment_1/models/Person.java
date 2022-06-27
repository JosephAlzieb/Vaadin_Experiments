package com.example.experiment_1.models;


import java.util.Objects;

public class Person {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final String telefon;


  public Person(String firstName, String lastName, String email, String telefon) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.telefon = telefon;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getTelefon() {
    return telefon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Person)) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(firstName, person.firstName) && Objects.equals(lastName,
        person.lastName) && email.equals(person.email) && Objects.equals(telefon,
        person.telefon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, telefon);
  }
}
