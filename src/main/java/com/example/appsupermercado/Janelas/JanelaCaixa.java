package com.example.appsupermercado.Janelas;

import com.example.appsupermercado.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JanelaCaixa extends Stage {
    public JanelaCaixa() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("caixa-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Hello World!");
        this.setScene(scene);
        this.show();
    }
}