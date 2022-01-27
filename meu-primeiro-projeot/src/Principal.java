
public class Principal {

	public static void main(String[] args) {
		
		Proprietario dono = new Proprietario();
		dono.nome = "João da Silva";
		dono.cpf = "000.000.000-00";
		dono.idade = 20;
		dono.logradouro = "Rua João Wendling, 145";
		dono.bairro = "Mosela";
		dono.cidade = "Petrópolis";
		
		Carro carro = new Carro();
		
		carro.modelo = "Palio";
		carro.anoDeFabricacao = 2022;
		carro.fabricante = "Fiat";
		carro.cor = "Prata";
		carro.dono = dono;
		
		//ou 
		//carro.dono.nome = "Vanessa" ......
		
		System.out.println("Modelo: " + carro.modelo);
		System.out.println("Modelo: " + carro.anoDeFabricacao);

	}

}
