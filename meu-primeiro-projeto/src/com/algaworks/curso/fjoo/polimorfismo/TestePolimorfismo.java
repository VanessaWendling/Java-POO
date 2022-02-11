package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		// TestePolimorfismo.imprimirSaldo(conta);   ou
		imprimirSaldo(conta);
		//------------------------
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);  //polimorfismo ->  pq Conta Corrente � uma Conta 
		//------------------------
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);  
		
	}
	
	//pode assumir v�rios objetos diferentes mas que herdam de um objeto comum 
	// conta corrente e conta poupanca herdam de conta
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		//perguntando se conta � uma ContaCorrente
		if(conta instanceof ContaCorrente) {
			//casting do obj
			ContaCorrente cc = (ContaCorrente) conta; // for�ando e falando que conta � uma ContaCorrente
			System.out.println("O limite da cc � R$" + cc.getLimite());
		}
		
		if(conta instanceof ContaPoupanca) {
			//casting do obj
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp � R$" + cp.getRendimentos());
		}
	}
}
