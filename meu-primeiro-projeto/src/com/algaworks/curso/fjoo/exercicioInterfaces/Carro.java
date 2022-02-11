package com.algaworks.curso.fjoo.exercicioInterfaces;

public class Carro implements Seguravel{
	
	private double valorMercado;
	private int anoFabricacao;
	
	public Carro(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		double valorApolice = this.valorMercado * 0.04;
		if(anoFabricacao < 2000) {
			valorApolice *= 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}

}
