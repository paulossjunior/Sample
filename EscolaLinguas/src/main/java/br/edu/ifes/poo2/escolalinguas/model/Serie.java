package br.edu.ifes.poo2.escolalinguas.model;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	
	private List<Serie> requisitos = new ArrayList<Serie>();
	
	public void adicionarRequisito (Serie serie)
	{
		this.requisitos.add(serie);
	}
			

}
