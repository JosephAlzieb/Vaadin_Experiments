package com.example.experiment_4;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.UnicastProcessor;

@SpringBootApplication
public class Experiment4Application {

  public static void main(String[] args) {
    SpringApplication.run(Experiment4Application.class, args);
  }

  @Bean
  UnicastProcessor<ChatMessage> publisher() {
    return UnicastProcessor.create();
  }

  @Bean
  Flux<ChatMessage> messages(UnicastProcessor<ChatMessage> publisher) {
    return publisher
        .replay(30)
        .autoConnect();
  }

}
