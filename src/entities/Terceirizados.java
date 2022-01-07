package entities;

public class Terceirizados extends Funcionarios {
	
	private Double pagamentoAdicional;
	
	public Terceirizados() {
		
	}

	public Terceirizados(String nome, Integer horas, Double vlrPorHora, Double pagamentoAdicional) {
		super(nome, horas, vlrPorHora);
		this.pagamentoAdicional = pagamentoAdicional;
	}

	public Double getPagamentoAdicional() {
		return pagamentoAdicional;
	}

	public void setPagamentoAdicional(Double pagamentoAdicional) {
		this.pagamentoAdicional = pagamentoAdicional;
	}
	
	@Override	
	public double pagamento() {
		return super.pagamento() + pagamentoAdicional * 1.1;
	}
	
	

}
