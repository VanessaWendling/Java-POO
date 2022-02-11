package com.algaworks.interfaces;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") 
				&& autorizavel.getValorTotal() < 100;
	}

}
