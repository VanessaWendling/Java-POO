package com.algaworks.curso.fjoo.exercicioInterfaces;

public class Notebook implements Seguravel{
	
	private String marca;
	private double valorMercado;
	
	public Notebook(String marca, double valorMercado) {
		super();
		this.marca = marca;
		this.valorMercado = valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		double valorApolice = this.valorMercado * 0.05;
		if(marca == "Apple") {
			valorApolice *= 0.7;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "A marca do notebook é " + this.marca + " e o seu valor de mercado é " + valorMercado + " reais";
	}

}
