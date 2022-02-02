package com.algaworks.curso.fjoo.exercicio;

public class MatematicaUtil {
	
	private static final Double PI = 3.14;
	
	public static int calcularFibonacci (int posicao) {
		if(posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci (posicao - 2);
	}
	
	public static double calcularAreaCirculo (double raio) {
		double area = (raio*raio)*PI;
		
		return area; 
		
	}
}
