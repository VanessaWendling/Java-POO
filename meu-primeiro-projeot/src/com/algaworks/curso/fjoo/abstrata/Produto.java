package com.algaworks.curso.fjoo.abstrata;

//Quando coloca a palavra reservada abstract, não podemos mais instaciar essa classe
public abstract class Produto {
	
	String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//todo mundo que estender a classe deverá desenvolver esse método.
	//assinatura do método
	public abstract void imprimirDescricao();
}
