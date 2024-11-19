package com.example.appsupermercado.Janelas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JanelaSobre extends Stage {
    public JanelaSobre() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.appsupermercado.HelloApplication.class.getResource("sobre-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Hello World!");
        this.setScene(scene);
        this.show();
    }
}