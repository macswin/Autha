package com.macswin.autha;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void init(){
        Font.loadFont(Objects.requireNonNull(Main.class.getResource("fonts/PoppinsReg.ttf")).toExternalForm(), 10);
        Font.loadFont(Objects.requireNonNull(Main.class.getResource("fonts/PoppinsSemiBold.ttf")).toExternalForm(), 10);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new Autha().getView(), 1920, 1080);
        scene.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("css/default.css")).toExternalForm());
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
