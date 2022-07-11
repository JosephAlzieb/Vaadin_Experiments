package com.example.experiment_2.models;

import java.util.Objects;

public record Frage(String frage) {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Frage)) {
      return false;
    }
    Frage frage1 = (Frage) o;
    return Objects.equals(frage, frage1.frage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frage);
  }
}
