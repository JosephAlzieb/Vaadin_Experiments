package com.example.experiment_4;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import java.time.LocalDateTime;
import reactor.core.publisher.Flux;
import reactor.core.publisher.UnicastProcessor;


@Route("")
@CssImport("./styles/styles.css")
public class MainView extends VerticalLayout {

  private String username;
  private final UnicastProcessor<ChatMessage> publisher;
  private final Flux<ChatMessage> messages;

  public MainView(UnicastProcessor<ChatMessage> publisher, Flux<ChatMessage> messages) {
    this.publisher = publisher;
    this.messages = messages;

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
