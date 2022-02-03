package com.algaworks.curso.fjoo.enums;

public class ContaPagar {
	private SituacaoConta situacaoConta;
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;

	public ContaPagar() {
		situacaoConta = SituacaoConta.PENDENTE;
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		super();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void pagar() {
		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())
				|| SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Status da conta: " + this.getSituacaoConta());
			System.out.println("O pagamento não pode ser efetuado. Verifique o status da sua conta. Obrigado");
		} else {
			System.out.println("Status anterior da conta " + this.getSituacaoConta());
			this.situacaoConta = SituacaoConta.PAGA;

			System.out.println("Conta paga com sucesso.");
			System.out.println("Descrição: " + this.getDescricao());
			System.out.println("Valor: " + this.getValor());
			System.out.println("Data de vencimento: " + this.getDataVencimento());
			System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		}
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
