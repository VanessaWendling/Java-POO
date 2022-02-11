package com.algaworks.curso.fjoo.enums;

public class ContaPagar extends Conta{
	private Fornecedor fornecedor;

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ContaPagar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.fornecedor = fornecedor;
	}
	
	public void pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que ja foi paga");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que foi cancelada");
		}else {
			System.out.println("Pagando conta:\ndescrição: " + descricao + ".\nvalor: " + valor + " reais\nfornecedor: " + fornecedor.getNome());
			this.setSituacaoConta(SituacaoConta.PAGA);
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Descricao da Conta: " + super.descricao + ".\nVencimento: " + super.getDataVencimento() + ".\nFornecedor: " + this.getFornecedor().getNome() );
		
	}
}
