package com.example.appsupermercado.Janelas;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JanelaVerificadorPreco extends Stage {
    public JanelaVerificadorPreco() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.appsupermercado.HelloApplication.class.getResource("verificadorpreco-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Verificador de Preço");
        this.setScene(scene);
        this.show();
    }
}
