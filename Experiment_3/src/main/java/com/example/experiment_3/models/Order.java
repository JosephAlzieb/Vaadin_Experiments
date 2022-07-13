package com.example.experiment_3.models;

import java.util.List;

public record Order(String title, String client, int amount) {

  public static List<Order> getDummyData (){
    return List.of(
        new Order("Phone", "Joe", 4),
        new Order("T-shirt", "Goky", 299),
        new Order("Shoes", "Sam", 2),
        new Order("Chair", "Shamy", 12)
    );
  }
}
