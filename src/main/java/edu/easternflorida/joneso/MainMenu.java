package edu.easternflorida.joneso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import edu.easternflorida.martinezi.App;
import edu.easternflorida.wardb.PartTableDisplay;

public class MainMenu extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button customerBtn = new Button("View Customers");
        Button partBtn = new Button("View Parts");

        customerBtn.setOnAction(e -> new App().start(new Stage()));
        partBtn.setOnAction(e -> new PartTableDisplay().start(new Stage()));

        VBox layout = new VBox(20, customerBtn, partBtn);
        primaryStage.setScene(new Scene(layout, 300, 200));
        primaryStage.setTitle("TPC-H Database Dashboard");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
