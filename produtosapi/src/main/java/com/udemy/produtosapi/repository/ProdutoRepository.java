package com.udemy.produtosapi.repository;

import com.udemy.produtosapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {

}
