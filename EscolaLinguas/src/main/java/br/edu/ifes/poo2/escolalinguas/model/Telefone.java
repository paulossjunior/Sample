package br.edu.ifes.poo2.escolalinguas.model;

public class Telefone {

	private String DD;
	
	private String numero;

	private ETelefone tipo;
	
	public ETelefone getTipo() {
		return tipo;
	}

	public void setTipo(ETelefone tipo) {
		this.tipo = tipo;
	}

	public String getDD() {
		return DD;
	}

	public void setDD(String dD) {
		DD = dD;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
