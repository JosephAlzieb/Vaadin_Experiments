package com.example.experiment_3.views;

import com.example.experiment_3.models.Order;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.util.List;

@Route(value = "orders")
@PageTitle("Orders")
public class OrdersView extends VerticalLayout {

  public OrdersView() {
    Grid<Order> grid = new Grid<>(Order.class, false);
    grid.addColumn(Order::title).setHeader("Title");
    grid.addColumn(Order::client).setHeader("Client");
    grid.addColumn(Order::amount).setHeader("Amount");

    List<Order> orders = Order.getDummyData();
    grid.setItems(orders);

    add(grid);
  }
}
