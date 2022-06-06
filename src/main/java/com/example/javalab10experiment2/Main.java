package com.example.javalab10experiment2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Application {

    private static ArrayList list1;
    private static ArrayList list2;

    public static void main(String[] args) {

        Random random = new Random();
        final int numbersKvadrats = 5;
        final int numbersRightKvadrats = 5;
        Kvadrats kvadrats = new Kvadrats();
        RightKvadrats rightkvadrats = new RightKvadrats();

        for (int i = 0; i < numbersKvadrats; i++) {
            kvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

        for (int i = 0; i < numbersRightKvadrats; i++) {
            rightkvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

        System.out.println(kvadrats);
        System.out.println(rightkvadrats);


        System.out.println();

        setKvadratList(kvadrats.getKvadrats());

        setRightKvadratList(rightkvadrats.getKvadrats());

        System.out.println();

        launch();
    }

    public static void setKvadratList(ArrayList kvadrats)
    {
        list1 = kvadrats;
    }

    public static ArrayList getKvadratList()
    {
        return list1;
    }

    public static void setRightKvadratList(ArrayList kvadrats)
    {
        list2 = kvadrats;
    }

    public static ArrayList getRightKvadratList()
    {
        return list2;
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("table.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }


}