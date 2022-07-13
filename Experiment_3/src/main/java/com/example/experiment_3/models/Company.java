package com.example.experiment_3.models;

import java.util.List;

public record Company (String name, int employeeCount) {

  public static List<Company> getDummyData (){
    return List.of(
        new Company("A", 11),
        new Company("B", 110),
        new Company("C", 1000),
        new Company("D", 500),
        new Company("E", 288)
    );
  }
}
