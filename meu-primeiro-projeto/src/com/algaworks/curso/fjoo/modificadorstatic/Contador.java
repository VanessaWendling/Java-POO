package com.algaworks.curso.fjoo.modificadorstatic;

public class Contador {
	
	//quando colcoa o static significa que a classe contador s� tem uma variavel dessas.
	// se tiver 10 objs, s� vai existir um count que ser� compartilhado entre eles
	//variaveis est�ticas geralmente s�o escritas com letra maiuscula
	public static int COUNT = 0;
	
	public void incrementar () {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora �: " + Contador.COUNT);
	}
}
