package com.udemy.produtosapi.controller;

import com.udemy.produtosapi.model.ProdutoModel;
import com.udemy.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController //ele vai controlar os metodos rest: get,put,post,delete
@RequestMapping("/produtos") //requestmapping é a url base do controller
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public ProdutoModel obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }

}
