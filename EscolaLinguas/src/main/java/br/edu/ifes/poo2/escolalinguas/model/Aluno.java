package br.edu.ifes.poo2.escolalinguas.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.escolalinguas.model.reuso.IAluno;
import br.edu.ifes.poo2.escolalinguas.model.reuso.PessoaGeral;

public class Aluno extends PessoaGeral implements IAluno{
	
	private List<Nota> notas = new ArrayList<Nota>();
	
	private List<Turma> turmasMatriculadas = new ArrayList<Turma>();
	
	public void receberNota (Nota nota)
	{
		notas.add(nota);
	}
	
	public void matricular(Turma turma){
		this.turmasMatriculadas.add(turma);
	}
	
	public List<Turma> visualizarNotas()
	{
		return turmasMatriculadas;
	}
	
	

}
