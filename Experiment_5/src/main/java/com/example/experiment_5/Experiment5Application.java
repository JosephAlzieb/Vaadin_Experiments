package com.example.experiment_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Experiment5Application{

  public static void main(String[] args) {
    SpringApplication.run(Experiment5Application.class, args);
  }

//  @Override
//  @Bean
//  protected UserDetailsService userDetailsService() {
//    return new InMemoryUserDetailsManager(
//        User.withUsername("Joe")
//            .password("{noop}p")
//            .roles("ADMIN")
//            .build(),
//        User.withUsername("Mar")
//            .password("{noop}p")
//            .roles("ADMIN")
//            .build()
//    );
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    super.configure(http);
//    setLoginView(http, LoginView.class);
//  }
}
