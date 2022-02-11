package com.algaworks.curso.fjoo.abstrata;

//Quando coloca a palavra reservada abstract, n�o podemos mais instaciar essa classe
public abstract class Produto {
	
	String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//todo mundo que estender a classe dever� desenvolver esse m�todo.
	//assinatura do m�todo
	public abstract void imprimirDescricao();
}
