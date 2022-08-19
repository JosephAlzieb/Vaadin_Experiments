package com.example.experiment_4;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@CssImport("./styles/styles.css")
public class MainView extends VerticalLayout {

  private String username;

  public MainView() {
    addClassName("main-view");
    setSizeFull();
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    H1 header = new H1("Vaadin Chat");
    header.getElement().getThemeList().add("dark");
    add(header);

    startApp();
  }

  private void startApp() {
    askUsername();
  }

  private void askUsername() {
    HorizontalLayout layout = new HorizontalLayout();

    TextField usernameField = new TextField();
    Button startButton = new Button("Start chatting");

    startButton.addClickListener(click -> {
      username = usernameField.getValue();
      remove(layout);
      startChat();
    });

    layout.add(usernameField, startButton);

    add(layout);

  }

  private void startChat() {

  }
}
