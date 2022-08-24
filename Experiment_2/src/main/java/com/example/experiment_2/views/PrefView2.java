package com.example.experiment_2.views;

import com.example.experiment_2.models.PrefName;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("pref2")
public class PrefView2 extends Div {

  private static final String PREF_NAME = "PREF";

  PrefName prefName = new PrefName();

  public PrefView2() {
    Accordion accordion = new Accordion();
    FormLayout prefFormLayout = new FormLayout();

    AccordionPanel panel = accordion.add(PREF_NAME,  prefFormLayout);

    TextField lang = new TextField("Language");
    TextField pref = new TextField("Pref");
    Button add = new Button("Add");

    prefFormLayout.setResponsiveSteps(
        new FormLayout.ResponsiveStep("0", 3),
        new FormLayout.ResponsiveStep("20em", 3)
    );
    prefFormLayout.setColspan(lang, 1);
    prefFormLayout.setColspan(pref, 1);
    prefFormLayout.setColspan(add, 1);

    prefFormLayout.add(lang,pref,add);

    add(prefFormLayout);

    add.addClickListener(event ->{
      String key = lang.getValue();
      String value = pref.getValue();
      prefName.add(key, value);

      Span span = new Span("PrefName");
      prefFormLayout.setColspan(span, 1);
      prefFormLayout.add(span);

      TextField fieldKey = getReadOnlyTextField(key);
      prefFormLayout.setColspan(fieldKey, 1);
      prefFormLayout.add(fieldKey);

      TextField fieldValue = getReadOnlyTextField(value);
      prefFormLayout.setColspan(fieldValue, 1);
      prefFormLayout.add(fieldValue);

    });

    panel.addOpenedChangeListener(e -> {
      if (e.isOpened()) {
        panel.setSummaryText(PREF_NAME);
      }
    });

    add.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//    panel.addContent(add);

  }


  private TextField getReadOnlyTextField(String value){
    TextField textField = new TextField();
    textField.setValue(value);
    textField.setReadOnly(true);
    return textField;
  }

}
