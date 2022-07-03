package com.example.experiment_1.layouts;

import com.example.experiment_1.models.Person;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import java.util.List;

public class PersonDataLayout extends Div {

  private static List<Person> people = List.of(
    new Person("Joe","Jojo", "aaaaa","1111")
  );

  private static Grid<Person> grid;
  private static Div hint;

  public PersonDataLayout() {

    grid = new Grid<>(Person.class, false);
    grid.setAllRowsVisible(true);
    grid.addColumn(Person::getFirstName).setHeader("FirstName");
    grid.addColumn(Person::getLastName).setHeader("LastName");
    grid.addColumn(Person::getEmail).setHeader("Email");
    grid.addColumn(Person::getTelefon).setHeader("Phone");

    grid.addColumn(
        new ComponentRenderer<>(Button::new, (button, person) -> {
          button.addThemeVariants(ButtonVariant.LUMO_ICON,
              ButtonVariant.LUMO_ERROR,
              ButtonVariant.LUMO_TERTIARY);
          button.addClickListener(e -> this.removeInvitation(person));
          button.setIcon(new Icon(VaadinIcon.TRASH));
        })).setHeader("Manage");

    grid.setItems(people);

    hint = new Div();
    hint.setText("No persons data has been saved");
    hint.getStyle().set("padding", "var(--lumo-size-l)")
        .set("text-align", "center").set("font-style", "italic")
        .set("color", "var(--lumo-contrast-70pct)");

    add(grid, hint);
  }

  private void removeInvitation(Person person) {
    if (person == null)
      return;
    people.remove(person);
    this.refreshGrid();
  }

  private void refreshGrid() {
    if (people.size() > 0) {
      grid.setVisible(true);
      hint.setVisible(false);
      grid.getDataProvider().refreshAll();
    } else {
      grid.setVisible(false);
      hint.setVisible(true);
    }
  }
}
