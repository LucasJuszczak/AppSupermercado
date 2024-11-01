package com.example.appsupermercado;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    protected void onCaixaButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("caixa-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        Stage stage = new Stage();
        stage.setTitle("Caixa");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onVerificadorPrecoButtonClick() {
    }

    @FXML
    protected void onSobreButtonClick(){
    }

    @FXML
    protected void onSairButtonClick(){
        System.exit(0);
    }

}