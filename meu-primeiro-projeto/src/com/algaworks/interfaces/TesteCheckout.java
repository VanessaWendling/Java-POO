package com.algaworks.interfaces;

public class TesteCheckout {
	public static void main(String[] args) {
		
		//não funciona pq não é uma classe, é uma interface
		//Operadora operadora = new Operadora();
		
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
