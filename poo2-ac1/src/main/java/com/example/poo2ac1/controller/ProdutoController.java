package com.example.poo2ac1.controller;

import com.example.poo2ac1.model.Produto;
import com.example.poo2ac1.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoId
 */
@Controller
@RequestMapping("/app")
public class ProdutoController {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/produto/{id}")
    public ModelAndView getProduto(
        @PathVariable("id") int codigo
    ){
        ModelAndView mv = new ModelAndView("produtoView");
        ModelAndView mv2 = new ModelAndView("errorView");

        Produto produto = ps.getProduto(codigo);

        if(produto==null)
        {
            return mv2;
        }

        mv.addObject("produto", produto);

        return mv;
    }
    
}