module com.example.prj {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.servlet.api;
    requires spring.beans;
    requires spring.context;
    requires spring.webmvc;
    requires spring.web;


    opens com.example.prj to javafx.fxml;
    exports com.example.prj;
}