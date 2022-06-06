package com.example.javalab10experiment2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableColumn<Kvadrat, Integer> AB;

    @FXML
    private TableColumn<Kvadrat, Integer> BC;

    @FXML
    private TableColumn<Kvadrat, Integer> CD;

    @FXML
    private TableColumn<Kvadrat, Integer> DA;

    @FXML
    private TableColumn<Kvadrat, Double> diag1;

    @FXML
    private TableColumn<Kvadrat, Double> diag2;

    @FXML
    private TableColumn<Kvadrat, Double> perimetr;

    @FXML
    private TableColumn<Kvadrat, Double> squar;

    @FXML
    private TableView<Kvadrat> table;

    @FXML
    private TableColumn<Kvadrat, Integer> x1;

    @FXML
    private TableColumn<Kvadrat, Integer> x2;

    @FXML
    private TableColumn<Kvadrat, Integer> x3;

    @FXML
    private TableColumn<Kvadrat, Integer> x4;

    @FXML
    private TableColumn<Kvadrat, Integer> y1;

    @FXML
    private TableColumn<Kvadrat, Integer> y2;

    @FXML
    private TableColumn<Kvadrat, Integer> y3;
    @FXML
    private TableColumn<Kvadrat, Integer> y4;


    Main main = new Main();
    ObservableList<Kvadrat> obslist = FXCollections.observableArrayList(Main.getKvadratList());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        x1.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("x1"));
        y1.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("y1"));
        x2.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("x2"));
        y2.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("y2"));
        x3.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("x3"));
        y3.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("y3"));
        x4.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("x4"));
        y4.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("y4"));
        AB.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("AB"));
        BC.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("BC"));
        CD.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("CD"));
        DA.setCellValueFactory(new PropertyValueFactory<Kvadrat, Integer>("DA"));
        diag1.setCellValueFactory(new PropertyValueFactory<Kvadrat, Double>("diag1"));
        diag2.setCellValueFactory(new PropertyValueFactory<Kvadrat, Double>("diag2"));
        perimetr.setCellValueFactory(new PropertyValueFactory<Kvadrat, Double>("perimetr"));
        squar.setCellValueFactory(new PropertyValueFactory<Kvadrat, Double>("squar"));

        table.setItems(obslist);
    }


}
