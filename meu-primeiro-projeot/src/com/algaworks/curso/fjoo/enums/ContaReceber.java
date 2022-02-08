package com.algaworks.curso.fjoo.enums;

public class ContaReceber extends Conta {
	private Cliente cliente;

	public ContaReceber() {
		// TODO Auto-generated constructor stub
	}

	public ContaReceber(Cliente cliente, String descrica, Double valor, String dataVencimento) {
		super(descrica, valor, dataVencimento);
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void cancelar() {
		if (this.getValor() < 50000d) {
			super.cancelar();
		}
	}

	public void receber() {
		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Você não pode receber uma conta que foi cancelada");
		} else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Você nçao pode receber uma conta que ja foi paga");
		} else {
			System.out.println("Recebendo a conta\ndescrição: " + descricao + "\nvalor: " + valor + " reais\ncliente "
					+ cliente.getNome());
			this.setSituacaoConta(SituacaoConta.PAGA);
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Descricao da Conta: " + super.descricao + ".\nVencimento: " + super.getDataVencimento()
				+ ".\nCliente: " + this.getCliente().getNome());

	}
}
