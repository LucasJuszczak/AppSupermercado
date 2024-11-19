package com.example.appsupermercado;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    protected void onCaixaMenuClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("caixa-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 400);
        Stage stage = new Stage();
        stage.setTitle("Caixa");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onVerificadorPrecoMenuClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("verificadorpreco-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 400);
        Stage stage = new Stage();
        stage.setTitle("Verificador de Preço");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSobreMenuClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sobre-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 400);
        Stage stage = new Stage();
        stage.setTitle("Sobre o sistema");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSairMenuClick(){
        System.exit(0);
    }

}