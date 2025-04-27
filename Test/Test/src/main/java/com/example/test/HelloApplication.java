package com.example.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomePage.fxml"));

//        String path = "F:\\/018 (1)قران كريم"; // تأكد من أن هذا المسار يشير إلى ملف صوت (مثل .mp3)
//        Media sound = new Media(new File(path).toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(sound);
//        mediaPlayer.play();

        Scene scene = new Scene(fxmlLoader.load(), 1024, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Bank");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/bank-icon.jpeg")));
        stage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        launch();
    }
}
