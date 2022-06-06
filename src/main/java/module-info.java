module com.example.javalab10experiment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalab10experiment2 to javafx.fxml;
    exports com.example.javalab10experiment2;
}