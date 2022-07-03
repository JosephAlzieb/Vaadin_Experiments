package com.example.experiment_1.services;

import com.example.experiment_1.models.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

  private static List<Person> personen = new ArrayList<>();

  public void addPerson(Person person){
    personen.add(person);
  }

  public void deletePerson(Person person){
    personen.remove(person);
  }

  public List<Person> getPersonen(){
    return List.copyOf(personen);
  }

}
