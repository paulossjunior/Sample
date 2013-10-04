package br.edu.ifes.poo2.escolalinguas.model.reuso;

import java.util.List;

import br.edu.ifes.poo2.escolalinguas.model.Nota;
import br.edu.ifes.poo2.escolalinguas.model.Turma;

public interface IAluno {

	public void receberNota (Nota nota);
	
	public void matricular(Turma turma);
	
	public List<Turma> visualizarNotas();
	
}
