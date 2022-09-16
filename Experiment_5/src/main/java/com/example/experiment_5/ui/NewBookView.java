package com.example.experiment_5.ui;

import com.example.experiment_5.backend.Book;
import com.example.experiment_5.backend.BookService;
import com.vaadin.collaborationengine.CollaborationBinder;
import com.vaadin.collaborationengine.CollaborationMessageInput;
import com.vaadin.collaborationengine.CollaborationMessageList;
import com.vaadin.collaborationengine.UserInfo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import javax.annotation.security.RolesAllowed;

@Route("new")
//@RolesAllowed("ADMIN")
public class NewBookView extends VerticalLayout {

  private TextField title = new TextField("Title");
  private DatePicker published = new DatePicker("Published");
  private IntegerField rating = new IntegerField("Rating");

  public NewBookView(BookService service) {
//    UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//    String username = userDetails.getUsername();
//    String username = "JOE";
//    var userInfo = new UserInfo(username, username);
//
//    var binder = new CollaborationBinder<>(Book.class, userInfo);
//    binder.bindInstanceFields(this);
//    binder.setTopic("new-book", Book::new);
//
////    var messageList = new CollaborationMessageList(userInfo, "new-book");
//    add(
//        new H1("New book"),
//
//        new HorizontalLayout(
//            new VerticalLayout(
//                new FormLayout(title, published, rating),
//                new Button("Save", event -> {
//                  var book = new Book();
//                  binder.writeBeanIfValid(book);
//                  service.add(book);
//                  Notification.show("Book saved.");
//                  binder.reset(new Book());
//                })
//            )
////            new VerticalLayout(
////                messageList,
////                new CollaborationMessageInput(messageList)
////            )
//        )
//    );
  }
}