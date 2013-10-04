package br.edu.ifes.poo2.escolalinguas.model;

import java.util.Date;

public class Periodo {

	
	public Date horaInicial;
	
	public Date horaFinal;
	
	public EDia dia;

	public Date getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}

	public Date getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}

	public EDia getDia() {
		return dia;
	}

	public void setDia(EDia dia) {
		this.dia = dia;
	}
	
}
