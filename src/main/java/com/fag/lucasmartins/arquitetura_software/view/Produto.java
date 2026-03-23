package com.fag.lucasmartins.arquitetura_software.domain;

public class Produto {

    private String nome;
    private Double preco;
    private Integer estoque;
    private Double precoFinal;

    public Produto(String nome, Double preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void aplicarRegras() {
        validarProdutoPremium();
        aplicarDescontoAtacado();
        this.precoFinal = this.preco;
    }

    private void validarProdutoPremium() {
        if (nome != null && nome.toLowerCase().contains("premium")) {
            if (preco < 100.0) {
                throw new IllegalArgumentException("Produtos Premium não podem custar menos de R$ 100,00.");
            }
        }
    }

    private void aplicarDescontoAtacado() {
        if (estoque != null && estoque >= 50) {
            preco = preco - (preco * 0.10);
        }
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public Integer getEstoque() { return estoque; }
    public Double getPrecoFinal() { return precoFinal; }
}
