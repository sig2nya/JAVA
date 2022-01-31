module com.example.prj {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.servlet.api;


    opens com.example.prj to javafx.fxml;
    exports com.example.prj;
}