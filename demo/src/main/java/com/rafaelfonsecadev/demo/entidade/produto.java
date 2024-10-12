package com.rafaelfonsecadev.demo.entidade;

public class produto {

   private Long id;
   private String nome;
   private Double preco;

   private departamento Departamento;
   
   
   public produto() {
	   
   }
   
   
   public produto(Long id, String nome, Double preco, departamento departamento) {
	this.id = id;
	this.nome = nome;
	this.preco = preco;
	Departamento = departamento;
}


public departamento getDepartamento() {
	return Departamento;
}
public void setDepartamento(departamento departamento) {
	Departamento = departamento;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getPreco() {
	return preco;
}
public void setPreco(Double preco) {
	this.preco = preco;
}

}
