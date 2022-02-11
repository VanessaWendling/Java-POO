package com.algaworks.curso.fjoo.modificadorstatic;

public class Contador {
	
	//quando colcoa o static significa que a classe contador só tem uma variavel dessas.
	// se tiver 10 objs, só vai existir um count que será compartilhado entre eles
	//variaveis estáticas geralmente são escritas com letra maiuscula
	public static int COUNT = 0;
	
	public void incrementar () {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}
}
