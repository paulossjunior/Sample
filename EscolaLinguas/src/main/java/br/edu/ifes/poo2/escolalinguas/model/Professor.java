package br.edu.ifes.poo2.escolalinguas.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.escolalinguas.model.reuso.PessoaGeral;

public class Professor extends PessoaGeral {
	
	private List<Locacao> locacoes = new ArrayList<Locacao>();
	
	private List<Serie> series = new ArrayList<Serie>();
	
	public void receberLocacao (Locacao locacao)
	{
		this.locacoes.add(locacao);
	}
	
	public void adicionarSeriesHabilitadas (Serie serie)
	{
		this.series.add(serie);
	}
			
	

}
