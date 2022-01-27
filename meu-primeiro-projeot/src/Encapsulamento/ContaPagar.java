package Encapsulamento;

public class ContaPagar {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public ContaPagar() {
		// TODO Auto-generated constructor stub
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		super();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	void pagar () {
		System.out.println("Descrição da conta: " + this.descricao + "\nValor da conta: " + this.valor + "\nData de vencimento: " + this.dataVencimento);
	}
	
	
}
