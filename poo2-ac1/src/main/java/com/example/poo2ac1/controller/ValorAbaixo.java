package com.example.poo2ac1.controller;

import java.util.List;

import com.example.poo2ac1.model.Produto;
import com.example.poo2ac1.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoValorAbaixo
 */
@Controller
public class ValorAbaixo {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/valorAbaixo/{valor}")
    public ModelAndView getProdutosByValorAbaixo(
        @PathVariable("valor") int valor
    ){
        ModelAndView mv = new ModelAndView("estoqueView");
        List<Produto> produto = ps.getProdutosByValorAbaixo(valor);

        if(produto.size() == 0){
            mv.setViewName("valorView");
            return mv;
        }
        
        mv.addObject("produto", produto);

        return mv;
    }
    
}