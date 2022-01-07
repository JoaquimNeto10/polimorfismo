package entities;

public class Funcionarios {
	
	private String nome;
	private Integer horas;
	private Double vlrPorHora;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, Integer horas, Double vlrPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.vlrPorHora = vlrPorHora;
	}
	
	public double pagamento() {
		return vlrPorHora * horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getVlrPorHora() {
		return vlrPorHora;
	}

	public void setVlrPorHora(Double vlrPorHora) {
		this.vlrPorHora = vlrPorHora;
	}
	
	
	
	

}
								