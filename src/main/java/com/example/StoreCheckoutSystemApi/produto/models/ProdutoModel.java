package com.example.StoreCheckoutSystemApi.produto.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    @JsonProperty("id_produto")
    private Integer idProduto;

    @Column(name = "nome_produto")
    @JsonProperty("nome_produto")
    private String nomeProduto;

    @Column(name = "precoFinal_produto")
    @JsonProperty("precoFinal_produto")
    private float precoFinalProduto;

    @Column(name = "categoria_produto")
    @JsonProperty("categoria_produto")
    private String categoriaProduto;

    @Column(name = "descricao_produto")
    @JsonProperty("descricao_produto")
    private String descricaoProduto;

    @Column(name = "precoCusto_produto")
    @JsonProperty("precoCusto_produto")
    private float precoCustoProduto;

    @Column(name = "quantidade_produto")
    @JsonProperty("quantidade_produto")
    private int quantidadeProduto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoFinalProduto() {
        return precoFinalProduto;
    }

    public void setPrecoFinalProduto(float precoFinalProduto) {
        this.precoFinalProduto = precoFinalProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getPrecoCustoProduto() {
        return precoCustoProduto;
    }

    public void setPrecoCustoProduto(float precoCustoProduto) {
        this.precoCustoProduto = precoCustoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
