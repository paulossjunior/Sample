package br.edu.ifes.poo2.escolalinguas.model;

import java.util.ArrayList;
import java.util.List;


public class Turma {
	
	private int numero;
	
	private int numeroMaximoAluno;
	
	private int numeroMinimoAluno;
	
	private Professor professor;
	
	private EStatusTurma status;
	
	private Periodo periodo;
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroMaximoAluno() {
		return numeroMaximoAluno;
	}

	public void setNumeroMaximoAluno(int numeroMaximoAluno) {
		this.numeroMaximoAluno = numeroMaximoAluno;
	}

	public int getNumeroMinimoAluno() {
		return numeroMinimoAluno;
	}

	public void setNumeroMinimoAluno(int numeroMinimoAluno) {
		this.numeroMinimoAluno = numeroMinimoAluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void cadastrarAluno(Aluno aluno) throws Exception
	{
		int qtdAlunos = numeroAlunos();
		
		if (qtdAlunos < numeroMaximoAluno) alunos.add(aluno);
		else throw new Exception("Numero maximo");
	}
	
	public void cadastrarProfessor(Professor professor){
		this.professor = professor;
	}
	
	public int numeroAlunos()
	{
		return alunos.size();
	}
	
	
	public EStatusTurma getStatus()
	{
		int qtdAlunos = numeroAlunos();
		
		if (numeroMinimoAluno < qtdAlunos) return EStatusTurma.CANCELADA;
		else if (numeroMinimoAluno <= qtdAlunos) return EStatusTurma.HABILITADA;
		else if (numeroMaximoAluno == qtdAlunos) return EStatusTurma.COMPLETA;
		else return EStatusTurma.FECHADA;
	}
	
	
}
