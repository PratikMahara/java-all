module com.example.multiarray {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiarray to javafx.fxml;
    exports com.example.multiarray;
}