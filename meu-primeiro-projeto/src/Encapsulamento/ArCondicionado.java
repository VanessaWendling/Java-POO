package Encapsulamento;

public class ArCondicionado {
	private int temperatura;
	
	//não pode mais mexer na temperatura sem passar pela validação do trocar temperatura pq agr a variável é private
	
	public void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <=25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		return temperatura;
	}
}
