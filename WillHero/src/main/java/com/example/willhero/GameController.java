package com.example.willhero;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.io.IOException;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView myplayer;
    @FXML
    private ImageView Orc1;
    @FXML
    private ImageView Orc2;


    public void onMenuClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pausemenu.fxml"));
        root = loader.load();
        PauseController PauseController = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myplayer);

        translate.setByY(-80);
        translate.setDuration(Duration.millis(700));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setAutoReverse(true);
        translate.play();

        TranslateTransition transOrc1 = new TranslateTransition();
        transOrc1.setNode(Orc1);

        transOrc1.setByY(-80);
        transOrc1.setDuration(Duration.millis(700));
        transOrc1.setCycleCount(TranslateTransition.INDEFINITE);
        transOrc1.setAutoReverse(true);
        transOrc1.play();

        TranslateTransition transOrc2 = new TranslateTransition();
        transOrc2.setNode(Orc2);

        transOrc2.setByY(-80);
        transOrc2.setDuration(Duration.millis(700));
        transOrc2.setCycleCount(TranslateTransition.INDEFINITE);
        transOrc2.setAutoReverse(true);
        transOrc2.play();



    }
}
