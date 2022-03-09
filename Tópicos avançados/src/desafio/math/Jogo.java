package desafio.math;

import static java.lang.Math.random;

public class Jogo {
	private int[] numeros = new int[6];
	
	public void sortearJogo () {
		for(int i = 0; i < 6; i++) {
			int sorteia = (int)(random()*60);
			if(verificaSorteio(sorteia))
				numeros[i] = sorteia;
			else
				i--;
		}
	}
	public boolean verificaSorteio (int sorteado) {
		int cont = 0;
		for(int j = 0; j < numeros.length; j++) 
			if(numeros[j] == sorteado)
				cont++;
		
		if(cont == 0)
			return true;
		else 
			return false;
	}
	
	public void imprimirSorteio() {
		for(int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + "\t");
	}
}

