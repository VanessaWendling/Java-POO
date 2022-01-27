
public class Pessoa {
	
	String nome;
	int idade;
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	//sobrecarga de método. Se passar 1 param entra no primeiro e se passar dois entra no segundo!
	//Incrível
	public Pessoa (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	
	/*
	 * se tivesse mais atributos, para não precisar repetir, poderia fazer por esse caminho tb.
	 * 
	 * Pessoa (String nome, int idade, String sexo){
	 * this.(nome,sexo);
	 * this.idade = idade
	 * 
	 * 
	 */
}
