package com.algaworks.curso.fjoo.enums;

public enum Naipe {
	//serve para declarar grupos de constantes
	OURO("Vermelho"), 
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	private String cor;
	
	Naipe (String cor){
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}

