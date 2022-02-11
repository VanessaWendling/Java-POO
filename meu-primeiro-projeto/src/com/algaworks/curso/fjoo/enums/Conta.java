package com.algaworks.curso.fjoo.enums;

public abstract class Conta {
	protected SituacaoConta situacaoConta;
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	
	
	public abstract void exibirDetalhes();
	
	public Conta() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public Conta(String descricao, Double valor, String dataVencimento) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoConta = SituacaoConta.PENDENTE;
	}



	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void cancelar() {
		System.out.println("Status da conta: " + this.getSituacaoConta());

		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta já está cancelada. Obrigado.");
		} else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta não pode ser cancelada porque já foi paga. Obrigado.");
		} else {
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta cancelada com sucesso.");
		}
	}

}
