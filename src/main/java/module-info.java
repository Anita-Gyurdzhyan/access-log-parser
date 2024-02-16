module com.example.accesslogparser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.accesslogparser to javafx.fxml;
    exports com.example.accesslogparser;
}