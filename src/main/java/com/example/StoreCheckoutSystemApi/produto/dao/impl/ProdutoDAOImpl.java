package com.example.StoreCheckoutSystemApi.produto.dao.impl;

import com.example.StoreCheckoutSystemApi.produto.dao.ProdutoDAO;
import com.example.StoreCheckoutSystemApi.produto.models.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ProdutoDAOImpl implements ProdutoDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProdutoDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean vendaProduto(ProdutoModel produtoModel) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE produto SET quantidade_produto = ? WHERE id = ?");
        int rowsAffected = jdbcTemplate.update(String.valueOf(sql), produtoModel.getIdProduto());
        return rowsAffected > 0;
    }
}
