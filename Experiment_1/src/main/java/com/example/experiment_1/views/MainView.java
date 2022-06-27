package com.example.experiment_1.views;


import com.example.experiment_1.layouts.PersonFormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

  public MainView(){

    PersonFormLayout form = new PersonFormLayout();

    add(form);
  }

}
