package edu.easternflorida.wardb;
//imports
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;

import javafx.scene.control.TableView;










public class PartTableDisplay extends Application {
//part class which contains id name and price



// where i cut and put into new file




    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage){

        TableView<Part> tableOfParts=new TableView<Part>();
        //this creates colums

        TableColumn<Part,Integer> partIdColumn=new TableColumn<>("Part id:");
        partIdColumn.setCellValueFactory(new PropertyValueFactory<>("P_PARTKEY"));

        TableColumn<Part,String> partNameColumn=new TableColumn<>("Part Name:");
        partNameColumn.setCellValueFactory(new PropertyValueFactory<>("P_NAME"));

        TableColumn<Part,String> partMFGRColumn=new TableColumn<>("Part MFGR:");
        partMFGRColumn.setCellValueFactory(new PropertyValueFactory<>("P_MFGR"));

        TableColumn<Part,String> partBrandColumn=new TableColumn<>("Part Brand:");
        partBrandColumn.setCellValueFactory(new PropertyValueFactory<>("P_BRAND"));

        TableColumn<Part,String> partTypeColumn=new TableColumn<>("Part Type:");
        partTypeColumn.setCellValueFactory(new PropertyValueFactory<>("P_TYPE"));

        TableColumn<Part,Integer> partSizeColumn=new TableColumn<>("Part Size:");
        partSizeColumn.setCellValueFactory(new PropertyValueFactory<>("P_SIZE"));

        TableColumn<Part,String> partContainerColumn=new TableColumn<>("Part Container:");
        partContainerColumn.setCellValueFactory(new PropertyValueFactory<>("P_CONTAINER"));

        TableColumn<Part,Double> partPriceColumn=new TableColumn<>("Part Price:");
        partPriceColumn.setCellValueFactory(new PropertyValueFactory<>("P_RETAILPRICE"));

        TableColumn<Part,String> partCommentColumn=new TableColumn<>("Part Comment:");
        partCommentColumn.setCellValueFactory(new PropertyValueFactory<>("P_COMMENT"));


















        //adding columns
        tableOfParts.getColumns().add(partIdColumn);
        tableOfParts.getColumns().add(partNameColumn);
        tableOfParts.getColumns().add(partMFGRColumn);
        tableOfParts.getColumns().add(partBrandColumn);
        tableOfParts.getColumns().add(partTypeColumn);
        tableOfParts.getColumns().add(partSizeColumn);
        tableOfParts.getColumns().add(partContainerColumn);
        tableOfParts.getColumns().add(partPriceColumn);
        tableOfParts.getColumns().add(partCommentColumn);







        //Test data




        VBox VBoxDisplay=new VBox(tableOfParts);
        Scene displayDimensions=new Scene(VBoxDisplay,1000,1000);
        stage.setScene(displayDimensions);
        tableOfParts.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        stage.show();


    }


}