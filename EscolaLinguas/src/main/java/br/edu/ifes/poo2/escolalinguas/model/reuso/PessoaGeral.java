package br.edu.ifes.poo2.escolalinguas.model.reuso;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.escolalinguas.model.Endereco;
import br.edu.ifes.poo2.escolalinguas.model.Telefone;

public abstract class PessoaGeral implements IPessoa {
	
	private String nome;
	
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	private List<Telefone> telefones = new ArrayList<Telefone>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarTelefone(Telefone telefone)
	{
		telefones.add(telefone);
	}
	
	public void adicionarEndereco(Endereco endereco){
		
		enderecos.add(endereco);
	}
	
	public List<Telefone> retornarTelefones(){
		
		return telefones;
		
	}
	
	public List<Endereco> retornarEnderecos(){
	
		return enderecos;
	}
}
