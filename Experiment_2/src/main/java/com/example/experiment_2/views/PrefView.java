package com.example.experiment_2.views;

import com.example.experiment_2.models.PrefName;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("pref")
public class PrefView extends VerticalLayout {

  TextField lang = new TextField("Language");
  TextField pref = new TextField("Pref");
  Button add = new Button("Add");

  PrefName prefName = new PrefName();
  public PrefView() {
    add(lang,pref,add);
    add.addClickListener(event -> {
      if(lang.isEmpty() == false && pref.isEmpty() == false){
        prefName.add(lang.getValue(), pref.getValue());
        add(new Span("Lang : " + lang.getValue() + "Pref : " + pref.getValue()));
      }
    });
  }
}
