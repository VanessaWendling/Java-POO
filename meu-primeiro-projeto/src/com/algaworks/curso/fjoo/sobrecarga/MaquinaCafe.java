package com.algaworks.curso.fjoo.sobrecarga;

public class MaquinaCafe {
	int acucarDisponivel;

	void fazerCafe(int quantidadeAcucar) {
		if (quantidadeAcucar > this.acucarDisponivel) {
			System.out.println("Não há açucar suficiente para fazer seu café");
		} else {
			this.acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar");
		}
	}
	
	/*
	 * Um jeito de fazer 
	 * 
	void fazerCafe() {
		if (this.acucarDisponivel < 10) {
			System.out.println("Não há açucar suficiente para fazer seu café");
		} else {
			this.acucarDisponivel -= 10;
			System.out.println("Fazendo cafezinho com 10 gramas gramas de açucar");
		}
	}
	
	*
	* ou
	*/
	
	void fazerCafe() {
		fazerCafe(10);
	}
}
