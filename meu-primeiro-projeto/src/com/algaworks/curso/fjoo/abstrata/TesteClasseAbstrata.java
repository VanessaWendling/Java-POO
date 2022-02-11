package com.algaworks.curso.fjoo.abstrata;

public class TesteClasseAbstrata {
	public static void main(String[] args) {
	//	Produto p = new Produto();     <- não pode mais fazer
		Produto p = new ProdutoPerecivel();
		p.setDescricao("Caixa de Leite");
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValdiade = "10/03/2022";
		
		p.imprimirDescricao();
		
	}
}
