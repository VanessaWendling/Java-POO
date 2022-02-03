package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
	protected Date dataValidade;
	
	public void identificar() {
		super.identificar(); //faz pegar o método identificar dentro de produto
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
