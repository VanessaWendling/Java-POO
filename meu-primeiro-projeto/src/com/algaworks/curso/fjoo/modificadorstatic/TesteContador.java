package com.algaworks.curso.fjoo.modificadorstatic;

public class TesteContador {
	public static void main(String[] args) {
		Contador c = new Contador();
		c.incrementar();
		
		Contador.COUNT++;
		
		Contador.imprimirContador();
	}
}
