package com.algaworks.curso.fjoo.heranca;

//s� pode extender uma classe por vez
public class Jogador extends Pessoa{
	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga );
	}
}
