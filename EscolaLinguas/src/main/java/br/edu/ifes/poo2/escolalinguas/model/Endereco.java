package br.edu.ifes.poo2.escolalinguas.model;

public class Endereco {
	
	private String logradouro;
	
	private String cidade;
	
	private String estado;
	
	private String CEP;
	
	private EEndereco tipo;
	
	
	public String getLogradouro() {
		return logradouro;
	}

	public EEndereco getTipo() {
		return tipo;
	}

	public void setTipo(EEndereco tipo) {
		this.tipo = tipo;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	

}
