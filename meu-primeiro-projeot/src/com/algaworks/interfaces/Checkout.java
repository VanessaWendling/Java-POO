package com.algaworks.interfaces;

public class Checkout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		 boolean autorizado = this.operadora.autorizar(compra, cartao);
		 
		 if(autorizado) {
			 this.impressora.imprimir(compra);
		 }else {
			 System.out.println("pagamento negado");
		 }
	}
}
