package com.algaworks.curso.fjoo.sobrecarga;

public class MaquinaCafe {
	int acucarDisponivel;

	void fazerCafe(int quantidadeAcucar) {
		if (quantidadeAcucar > this.acucarDisponivel) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�");
		} else {
			this.acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de a�ucar");
		}
	}
	
	/*
	 * Um jeito de fazer 
	 * 
	void fazerCafe() {
		if (this.acucarDisponivel < 10) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�");
		} else {
			this.acucarDisponivel -= 10;
			System.out.println("Fazendo cafezinho com 10 gramas gramas de a�ucar");
		}
	}
	
	*
	* ou
	*/
	
	void fazerCafe() {
		fazerCafe(10);
	}
}
