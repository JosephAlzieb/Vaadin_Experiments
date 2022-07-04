package com.example.experiment_1.layouts;

import com.example.experiment_1.models.Person;
import com.example.experiment_1.services.PersonService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;

public class PersonFormLayout extends Div {

  private final PersonService personService;

  private TextField firstName = new TextField("First name");
  private TextField lastName = new TextField("Last name");
  private EmailField email = new EmailField("Email");
  private NumberField numberField = new NumberField("Telefon");

  public PersonFormLayout(PersonService personService){

    this.personService = personService;

    Button submit = new Button("Submit");
    submit.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    submit.addClickListener(
      peson ->{
        Person person = new Person(
            firstName.getValue(),
            lastName.getValue(),
            email.getValue(),
            numberField.getValue().toString());
        personService.addPerson(person);
        clearFormFields();

      });

    FormLayout formLayout = new FormLayout();
    formLayout.add(
        firstName, lastName,
        email, numberField, submit
    );
    formLayout.setResponsiveSteps(
        // Use one column by default
        new ResponsiveStep("0", 1),
        // Use two columns, if layout's width exceeds 500px
        new ResponsiveStep("500px", 2)
    );

// Stretch the username field over 2 columns
    formLayout.setColspan(email, 2);
    formLayout.setColspan(numberField, 2);
    formLayout.setColspan(submit, 2);

    add(formLayout);
  }

  private void clearFormFields() {
    firstName.clear();
    lastName.clear();
    email.clear();
    numberField.clear();
  }

}
