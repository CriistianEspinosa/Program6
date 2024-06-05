module com.example.program6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program6 to javafx.fxml;
    exports com.example.program6;
}