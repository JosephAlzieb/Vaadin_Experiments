package com.example.experiment_2.views;

import com.example.experiment_2.models.Antwort;
import com.example.experiment_2.models.Frage;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Route("")
public class MainView extends VerticalLayout {

  LinkedHashMap<Frage, Antwort> map = new LinkedHashMap<>();
  int length = 0;


  public MainView() throws InterruptedException {

    fillMap();
    List<Frage> fragen =  getFragen();

    while(length < fragen.size()){
      Button button = new Button(fragen.get(length).frage());
      add(button);
      button.addClickListener(s->{
        showAnswers(button);
      });
    }
  }

  private ComponentEventListener<ClickEvent<Button>> showAnswers(
      Button button) {
    return s->{
      Button button1 = new Button(map.get(new Frage(button.getText())).option1());

      Button button2 = new Button(map.get(new Frage(button.getText())).option2());

      remove(button);
      add(button1,button2);
      length++;

    };
  }

  private List<Frage> getFragen() {
    return map.entrySet().stream().map(m -> m.getKey()).collect(Collectors.toList());
  }

  private void fillMap() {
    map.put(
        new Frage("Wie geht es dir"),
        new Antwort("Gut, weil","Nicht Gut, weil")
    );
    map.put(
        new Frage("Gut, weil"),
        new Antwort("Gutes Wetter","Gutes Essen")
    );map.put(
        new Frage("Nicht Gut, Weil"),
        new Antwort("Schlechtes Wetter","Schlechtes Essen")
    );map.put(
        new Frage("Gutes Wetter"),
        new Antwort("Sommer","Winter")
    );
  }
}
