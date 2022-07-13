package com.example.experiment_3.views;

import com.example.experiment_3.models.Company;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.ChartType;
import com.vaadin.flow.component.charts.model.DataSeries;
import com.vaadin.flow.component.charts.model.DataSeriesItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.util.List;

@Route(value = "dashboard")
@PageTitle("Dashboard")
class DashboardView extends VerticalLayout {

  List<Company> companies = Company.getDummyData();

  private DashboardView() {
    addClassName("dashboard-view");
    setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    add(getContactStats(), getCompaniesChart());
  }

  private Component getContactStats() {
    Span stats = new Span("100 contacts");
    stats.addClassNames("text-xl", "mt-m");
    return stats;
  }

  private Chart getCompaniesChart() {
    Chart chart = new Chart(ChartType.PIE);

    DataSeries dataSeries = new DataSeries();
    companies.forEach(company ->
        dataSeries.add(new DataSeriesItem(company.name(), company.employeeCount())));

    chart.getConfiguration().setSeries(dataSeries);
    return chart;
  }
}
