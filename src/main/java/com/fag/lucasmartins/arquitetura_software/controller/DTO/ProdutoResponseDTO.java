package com.fag.lucasmartins.arquitetura_software.dto;

public class ProdutoResponseDTO {

    private String nome;
    private Integer estoque;
    private Double preco;
    private Double precoFinal;
    private String mensagem;

    public ProdutoResponseDTO(String nome, Integer estoque, Double preco, Double precoFinal, String mensagem) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.precoFinal = precoFinal;
        this.mensagem = mensagem;
    }

    public String getNome() { return nome; }
    public Integer getEstoque() { return estoque; }
    public Double getPreco() { return preco; }
    public Double getPrecoFinal() { return precoFinal; }
    public String getMensagem() { return mensagem; }
}
