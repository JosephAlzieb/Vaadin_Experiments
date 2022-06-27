package com.example.experiment_1.layouts;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;

public class PersonFormLayout extends Div {

  public PersonFormLayout(){

    TextField firstName = new TextField("First name");
    TextField lastName = new TextField("Last name");
    EmailField email = new EmailField("Email");
    NumberField numberField = new NumberField("Telefon");

    Button submit = new Button("Submit");
    submit.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

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

}
