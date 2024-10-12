package com.rafaelfonsecadev.demo.controlador;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; // biblioteca spring

import com.rafaelfonsecadev.demo.entidade.departamento;
import com.rafaelfonsecadev.demo.entidade.produto;

@RestController // uma anotaçao para configuraçao e responder a API 
@RequestMapping(value = "products")
public class ProdutoControlador {

    @GetMapping
	public List<produto> getObejects() {
	   departamento d1 = new departamento(1L , "tech"); // criando os departamnetos e sua relaçao
	   departamento d2 = new departamento(2L ,"pet");
	   
	   produto p1 = new produto(1L, "Macbook Pro", 4000.0, d1);
	   produto p2 = new produto(2L, "Pc Gamer", 5000.0, d1);
	   produto p3 = new produto(3L, "Pet House", 3000.0, d2);
	   
	   List<produto> list = Arrays.asList(p1,p2,p3);
	   
	   return list;
   
   }
}
