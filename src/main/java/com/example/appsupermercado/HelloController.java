package com.example.appsupermercado;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void onCaixaButtonClick() throws IOException {
        new JanelaCaixa();
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