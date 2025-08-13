package com.udemy.produtosapi.controller;


import com.udemy.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Vai receber requisições REST
@RestController
@RequestMapping("produtos")    //Vai dizer qual é a url base desse controller
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido" + produto);
        return produto;
    }

}
