package com.example.fxlesson3;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    private Button exit;

    @FXML
    private Label menu;

    @FXML
    private Label menub;

    @FXML
    private AnchorPane slider;

    @FXML
    private BorderPane centerpane;

    @FXML
    private VBox itemHolder;

    public void initialize (URL location, ResourceBundle resourceBundle) {

        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        slider.setTranslateX(-176);

        menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e)-> {
                menu.setVisible(false);
                menub.setVisible(true);
            });
        });

        menub.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                menu.setVisible(true);
                menub.setVisible(false);
            });
        });
    }

    public void aboutMeClicked(ActionEvent event){
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about_me.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            centerpane.getChildren().clear();
            centerpane.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contactClicked(ActionEvent event){
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("contact.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            centerpane.getChildren().clear();
            centerpane.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void donateClicked(ActionEvent event){
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("donate.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            centerpane.getChildren().clear();
            centerpane.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void FAQClicked(ActionEvent event){
        TranslateTransition slide = new TranslateTransition();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("faq.fxml"));
        try {
            Pane registerPane = fxmlLoader.load();
            centerpane.getChildren().clear();
            centerpane.getChildren().add(registerPane);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}