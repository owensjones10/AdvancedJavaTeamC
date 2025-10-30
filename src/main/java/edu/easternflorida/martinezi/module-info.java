module edu.easternflorida.teamc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    // Open your packages to JavaFX runtime
    opens edu.easternflorida.joneso to javafx.graphics, javafx.fxml;
    opens edu.easternflorida.martinezi to javafx.graphics, javafx.fxml;
    opens edu.easternflorida.wardb to javafx.graphics, javafx.fxml;

    // Export them so others can use their classes
    exports edu.easternflorida.joneso;
    exports edu.easternflorida.martinezi;
    exports edu.easternflorida.wardb;
}
