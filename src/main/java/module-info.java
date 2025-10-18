module com.example.projectteamc1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.easternflorida.wardb to javafx.fxml;
    exports edu.easternflorida.wardb;
}