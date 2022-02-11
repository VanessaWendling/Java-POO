package com.algaworks.curso.fjoo.exercicioInterfaces;

public class Imovel implements Seguravel{
	
	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida) {
		super();
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		double valorApolice = this.valorMercado * 0.003;
		valorApolice += areaConstruida * 0.5;
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "Imóvel com área construída de " + this.areaConstruida + "m2 e valor de mercado " + this.valorMercado;
	}

}
