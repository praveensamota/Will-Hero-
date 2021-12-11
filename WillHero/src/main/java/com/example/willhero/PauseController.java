package com.example.willhero;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class PauseController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label savelabel;

    public void onResumeClick(ActionEvent event) throws IOException {


         FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            root = loader.load();
            GameController GameController = loader.getController();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


    }

    public void onRestartClick(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Restart Game");
        alert.setContentText("Do you want to Restart the game ?");
        if (alert.showAndWait().get() == ButtonType.OK) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            root = loader.load();
            GameController GameController = loader.getController();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }
    public void onHomeClick(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit Game");
        alert.setContentText("Do you want to Quit ? All unsaved changes will be lost");
        if (alert.showAndWait().get() == ButtonType.OK) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainmenu.fxml"));
            root = loader.load();
            HelloController HelloController = loader.getController();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }
    public void onSaveClick(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save Game");
        alert.setContentText("Do you want to Save the game ?");
        if (alert.showAndWait().get() == ButtonType.OK) {

            /*FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(3000));
            fade.setFromValue(0);
            fade.setToValue(10);
            fade.setCycleCount(2);
            fade.setNode(savelabel);
            fade.play();*/


            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            root = loader.load();

            GameController GameController = loader.getController();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }

}
