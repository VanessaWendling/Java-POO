package Encapsulamento;

public class ArCondicionado {
	private int temperatura;
	
	//n�o pode mais mexer na temperatura sem passar pela valida��o do trocar temperatura pq agr a vari�vel � private
	
	public void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <=25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		return temperatura;
	}
}
