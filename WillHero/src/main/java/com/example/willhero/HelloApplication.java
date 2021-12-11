package com.example.willhero;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainmenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        stage.setResizable(false);
        Image image = new Image("E:\\WillHero\\src\\Helmet1.png");
        stage.getIcons().add(image);
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);});
    }
    public void logout(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit Game");
        alert.setHeaderText("You're about to Quit!");
        alert.setContentText("Do you want to Quit ?");
        if(alert.showAndWait().get()== ButtonType.OK){

            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}