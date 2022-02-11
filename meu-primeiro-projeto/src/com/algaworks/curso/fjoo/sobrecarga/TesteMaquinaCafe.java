package com.algaworks.curso.fjoo.sobrecarga;

public class TesteMaquinaCafe {

	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe();
		maquina.fazerCafe(20);
		maquina.fazerCafe();

	}

}
