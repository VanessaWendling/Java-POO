package com.algaworks.curso.fjoo.heranca;


//se marcasse essa classe como final, ela n�o poderia extender nenhuma outra
//public final class
public class Pessoa {
	//protected serve para todas as classes que heraderem pessoa, estando no mesmo pacote ou n�o
	protected String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Ol�, eu sou o " + nome + " e tenho " + idade +" anos");
	}
}
