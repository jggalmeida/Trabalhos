package com.example.poo2ac1.repository;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.example.poo2ac1.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer,Produto> prod = new HashMap<Integer,Produto>(); 


    public ProdutoRepository()
    {
        prod.put(1, new Produto(1, "Gol", 40000, 20));
        prod.put(2, new Produto(2, "Ka", 35000, 5));
        prod.put(3, new Produto(3, "Ferrari", 1000000, 1));
        prod.put(4, new Produto(4, "BMW", 300000, 5));
        prod.put(5, new Produto(5, "Celta", 30000, 30));
        prod.put(6, new Produto(6, "HB20", 50000, 12));
        prod.put(7, new Produto(7, "Cherry", 25000, 10));
        prod.put(8, new Produto(8, "Lifan", 20000, 60));
        prod.put(9, new Produto(9, "McLaren", 1000000, 5));
        prod.put(10, new Produto(10, "Corsa", 15000, 30));

    }

    public Produto getProdutoById(int id)
    {
        return prod.get(id);   
    }

    
    public List<Produto> getProdutos(){
        List<Produto> listaProdutos = new ArrayList<Produto>();
        return listaProdutos;
    }


    
}