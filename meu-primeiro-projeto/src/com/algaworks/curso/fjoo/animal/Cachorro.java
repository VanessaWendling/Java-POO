package com.algaworks.curso.fjoo.animal;

public class Cachorro {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//esse m�todo precisa do public pq ele � acessado por outro package.
	//se fosse apenas pelo mesmo, s� o void bastava
	public void sentar() {
		System.out.println("Eu, " + nome + ", vou sentar!");
	}
}
