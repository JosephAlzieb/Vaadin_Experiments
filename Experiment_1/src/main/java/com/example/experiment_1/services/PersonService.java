package com.example.experiment_1.services;

import com.example.experiment_1.models.Person;
import com.example.experiment_1.repositories.PersonRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public void addPerson(Person person){
    personRepository.insert(person);
  }

  public void deletePerson(Person person){
    personRepository.delete(person);
  }

  public List<Person> getPersonen(){
    return personRepository.findAll();
  }

}
