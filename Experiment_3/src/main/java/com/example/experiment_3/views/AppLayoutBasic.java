package com.example.experiment_3.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("")
public class AppLayoutBasic extends AppLayout {

  public AppLayoutBasic() {
    DrawerToggle toggle = new DrawerToggle();

    H1 title = new H1("MyApp");
    title.getStyle()
        .set("font-size", "var(--lumo-font-size-l)")
        .set("margin", "0");

    Tabs tabs = getTabs();

    addToDrawer(tabs);
    addToNavbar(toggle, title);
  }

  private Tabs getTabs() {
    Tabs tabs = new Tabs();
    tabs.add(
        createTab(VaadinIcon.DASHBOARD, "Dashboard", DashboardView.class),
        createTab(VaadinIcon.CART, "Orders",OrdersView.class),
        createTab(VaadinIcon.USER_HEART, "Customers",DashboardView.class),
        createTab(VaadinIcon.PACKAGE, "Products",DashboardView.class),
        createTab(VaadinIcon.RECORDS, "Documents",DashboardView.class),
        createTab(VaadinIcon.LIST, "Tasks",DashboardView.class),
        createTab(VaadinIcon.CHART, "Analytics",DashboardView.class)
    );
    tabs.setOrientation(Tabs.Orientation.VERTICAL);
    return tabs;
  }

  private Tab createTab(VaadinIcon viewIcon, String viewName, Class route) {
    Icon icon = viewIcon.create();
    icon.getStyle()
        .set("box-sizing", "border-box")
        .set("margin-inline-end", "var(--lumo-space-m)")
        .set("margin-inline-start", "var(--lumo-space-xs)")
        .set("padding", "var(--lumo-space-xs)");

    RouterLink link = getRouterLink(viewName, icon, route);

    link.setTabIndex(-1);

    return new Tab(link);
  }

  private RouterLink getRouterLink(String viewName, Icon icon, Class route) {
    RouterLink link = new RouterLink();
    link.add(icon, new Span(viewName));
    // Demo has no routes
    link.setRoute(route);
    return link;
  }
}
