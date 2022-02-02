package com.algaworks.curso.fjoo.animal;

public class Cachorro {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//esse método precisa do public pq ele é acessado por outro package.
	//se fosse apenas pelo mesmo, só o void bastava
	public void sentar() {
		System.out.println("Eu, " + nome + ", vou sentar!");
	}
}
