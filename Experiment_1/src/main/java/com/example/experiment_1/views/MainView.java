package com.example.experiment_1.views;


import com.example.experiment_1.layouts.PersonDataLayout;
import com.example.experiment_1.layouts.PersonFormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends HorizontalLayout {


  public MainView(){

    PersonFormLayout form = new PersonFormLayout();

    PersonDataLayout data = new PersonDataLayout();

    setPadding(true);

    addAndExpand(form,data);
  }

}
