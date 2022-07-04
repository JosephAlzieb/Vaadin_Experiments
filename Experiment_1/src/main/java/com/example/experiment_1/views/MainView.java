package com.example.experiment_1.views;


import com.example.experiment_1.layouts.PersonDataLayout;
import com.example.experiment_1.layouts.PersonFormLayout;
import com.example.experiment_1.services.PersonService;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends HorizontalLayout {


  public MainView(PersonService personService){

    PersonFormLayout form = new PersonFormLayout(personService);

    PersonDataLayout data = new PersonDataLayout(personService);

    setPadding(true);

    addAndExpand(form,data);
  }

}
