
public class Carro {
	// driblando a exce��o do NullPointerException
	// Proprietario dono = new Proprietario();
	
	Proprietario dono;
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; 
	
	void ligar() {
		System.out.println("Ligando o carro " + modelo);
	}
}
