package com.example.appsupermercado.Controllers;

import com.example.appsupermercado.Model.Produtos;
import com.example.appsupermercado.Model.Util;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class CaixaController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtQuantidade;

    @FXML
    private Label lblProdutoInformacao;

    @FXML
    private ListView<String> listProdutos;

    @FXML
    private Label lblValorTotal;

    @FXML
    private TextField txtPagamento;

    @FXML
    private Label lblValorTroco;

    private final List<Util> produtosDisponiveis = new ArrayList<>();

    private double valorTotal = 0.0;

    @FXML
    public void initialize() {
        lblValorTotal.setText("0.00");
        produtosDisponiveis.addAll(Produtos.obterListaProdutos());
    }

    @FXML
    public void adicionarLista() {
        String codigo = txtCodigo.getText();
        String quantidade = txtQuantidade.getText();

        if (!codigo.isEmpty() && !quantidade.isEmpty()) {
            try {
                int tamanho = Integer.parseInt(codigo) - 1;
                if (tamanho < 0 || tamanho >= produtosDisponiveis.size()) {
                    lblProdutoInformacao.setText("Produto não encontrado.");
                    return;
                }

                Util produto = produtosDisponiveis.get(tamanho);
                int qtd = Integer.parseInt(quantidade);
                double totalItem = produto.getPreco() * qtd;

                listProdutos.getItems().add(
                        "Produto: " + produto.getDescricao() +
                                " - Qtd: " + qtd +
                                " - Unit: R$ " + produto.getPreco() +
                                " - Total: R$ " + String.format("%.2f", totalItem)
                );

                valorTotal += totalItem;
                lblValorTotal.setText(String.format("%.2f", valorTotal));

                lblProdutoInformacao.setText(produto.getDescricao() + " - R$ " + produto.getPreco());
            } catch (NumberFormatException e) {
                lblProdutoInformacao.setText("Código e/ou quantidade inválida.");
            }
        } else {
            lblProdutoInformacao.setText("Por favor, preencha o código e/ou a quantidade corretamente.");
        }
    }

    @FXML
    public void removerProduto() {
        String produtoSelecionado = listProdutos.getSelectionModel().getSelectedItem();

        if (produtoSelecionado != null) {
            try {
                listProdutos.getItems().remove(produtoSelecionado);

                if (!produtoSelecionado.contains("Total: R$ ")) {
                    lblProdutoInformacao.setText("Formato do produto inválido.");
                    return;
                }

                String[] parte = produtoSelecionado.split("Total: R\\$ ");
                if (parte.length < 2) {
                    lblProdutoInformacao.setText("Formato do produto inválido, não foi possível remover.");
                    return;
                }

                String valorLimpo = parte[1].trim().replace(",", ".");
                double totalDoProduto = Double.parseDouble(valorLimpo);

                valorTotal -= totalDoProduto;
                lblValorTotal.setText(String.format("%.2f", valorTotal));
                lblProdutoInformacao.setText("Item removido.");
            } catch (NumberFormatException e) {
                lblProdutoInformacao.setText("Erro ao processar o total do produto.");
            }
        } else {
            lblProdutoInformacao.setText("Selecione um produto para remover.");
        }
    }


    @FXML
    public void calcularTroco() {
        try {
            double pagamento = Double.parseDouble(txtPagamento.getText());
            double troco = pagamento - valorTotal;

            if (troco < 0) {
                lblValorTroco.setText("0.00");
                lblProdutoInformacao.setText("Valor pago insuficiente.");
            } else {
                lblProdutoInformacao.setText("Troco calculado: " + troco);
                lblValorTroco.setText(String.format("%.2f", troco));
            }
        } catch (NumberFormatException e) {
            lblProdutoInformacao.setText("Insira um valor válido para o pagamento.");
        }
    }
}