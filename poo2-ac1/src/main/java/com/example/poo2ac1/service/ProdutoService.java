package com.example.poo2ac1.service;


import java.util.List;
import java.util.ArrayList;
import com.example.poo2ac1.model.Produto;
import com.example.poo2ac1.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    public Produto getProduto(int id)
    {
        Produto produto = pr.getProdutoById(id);

        if(produto==null)
        {
            produto = null;
        }

        return produto;
    }    

    public List<Produto> getProdutosEmEstoque(){
        List<Produto> produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getEstoque() > 0){
                prod.add(produtos);
            }
        }
        return prod;
    }

    public List<Produto> getProdutosByValorAcima(double valor){
        List<Produto> produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getValor() > valor){
                prod.add(produtos);
            }
        }
        return prod;
    }

    public List<Produto> getProdutosByValorAbaixo(double valor){
        List<Produto> produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getValor() < valor){
                prod.add(produtos);
            }
        }
        return prod;
    }
    
}