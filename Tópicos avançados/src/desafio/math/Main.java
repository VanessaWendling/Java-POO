package desafio.math;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDeJogos = sc.nextInt();
		for(int i = 0; i < numeroDeJogos; i++) {
			System.out.println( i+1 +"º jogo");
			Jogo jogo = new Jogo();
			jogo.sortearJogo();
			jogo.imprimirSorteio();
			System.out.println("\n-----------");	
		}
	}
}