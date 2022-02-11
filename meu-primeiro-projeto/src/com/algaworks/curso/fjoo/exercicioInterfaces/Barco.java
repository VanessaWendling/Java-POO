package com.algaworks.curso.fjoo.exercicioInterfaces;

public class Barco implements Seguravel{
	
	private double valorMercado;
	private int anoFabricacao;
	
	public Barco(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		double valorApolice = this.valorMercado * 0.06;
		if(anoFabricacao < 2015) {
			valorApolice *= 0.2;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "Barco ano " + this.anoFabricacao + " com o valor de mercado " + this.valorMercado;
	}

}
