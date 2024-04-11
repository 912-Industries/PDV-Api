package com.example.StoreCheckoutSystemApi.produto.dao;

import com.example.StoreCheckoutSystemApi.produto.models.ProdutoModel;
import org.springframework.stereotype.Service;

public interface ProdutoDAO {
    boolean vendaProduto(ProdutoModel produtoModel) throws Exception;

}
