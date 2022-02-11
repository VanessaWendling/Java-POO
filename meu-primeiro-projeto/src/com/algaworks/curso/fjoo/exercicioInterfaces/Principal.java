package com.algaworks.curso.fjoo.exercicioInterfaces;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Notebook meuNotebook = new Notebook ("Apple", 9000);
		Barco meuBarco = new Barco(5000, 2016);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuNotebook);
		corretora.fazerPropostaSeguro(meuBarco);
	}

}
