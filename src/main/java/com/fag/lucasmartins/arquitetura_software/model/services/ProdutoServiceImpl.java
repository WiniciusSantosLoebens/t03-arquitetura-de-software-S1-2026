package com.fag.lucasmartins.arquitetura_software.service;

import org.springframework.stereotype.Service;
import com.fag.lucasmartins.arquitetura_software.domain.*;
import com.fag.lucasmartins.arquitetura_software.dto.*;
import com.fag.lucasmartins.arquitetura_software.repository.*;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProdutoResponseDTO cadastrar(ProdutoRequestDTO dto) {

        Produto produto = new Produto(dto.getNome(), dto.getPreco(), dto.getEstoque());
        produto.aplicarRegras();

        repository.salvar(produto);

        return new ProdutoResponseDTO(
                produto.getNome(),
                produto.getEstoque(),
                dto.getPreco(),
                produto.getPrecoFinal(),
                "Produto cadastrado com sucesso!"
        );
    }
}
