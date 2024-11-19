package com.example.appsupermercado.Controllers;

import com.example.appsupermercado.Model.Produtos;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.example.appsupermercado.Model.Util;
import java.util.Map;

public class VerificadorPrecoController {

    @FXML
    private Label lblProduto;
    @FXML
    private Label lblProdutoValor;
    @FXML
    private TextField txtProdutoCodigo;

    private Map<String, Util> produtos;

    public VerificadorPrecoController() {
        inicializarProdutos();
    }

    private void inicializarProdutos() {
        produtos = Produtos.obterMapaProdutos();
    }

    @FXML
    public void onCodigo() {
        String codigo = txtProdutoCodigo.getText().trim();

        if (codigo.isEmpty()) {
            zerar("", 0.0, false);
            return;
        }

        Util produto = produtos.get(codigo);

        if (produto != null) {
            zerar(produto.getDescricao(), produto.getPreco(), true);
        } else {
            zerar("Produto não existente", 0.0, false);
        }
    }

    private void zerar(String descricao, double valor, boolean encontrar) {
        if (encontrar) {
            lblProduto.setText(descricao);
            lblProdutoValor.setText(String.format("R$ %.2f", valor));
        } else {
            lblProduto.setText(descricao);
            lblProdutoValor.setText("R$ 0,00");
        }
    }
}