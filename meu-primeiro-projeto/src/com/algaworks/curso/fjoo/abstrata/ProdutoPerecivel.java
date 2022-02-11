package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto{

	String dataValdiade;
	
	@Override
	public void imprimirDescricao() {
		// TODO Auto-generated method stub
		System.out.println("Descrição " + super.getDescricao() + ". Vencendo em: " + dataValdiade);
	}
}
