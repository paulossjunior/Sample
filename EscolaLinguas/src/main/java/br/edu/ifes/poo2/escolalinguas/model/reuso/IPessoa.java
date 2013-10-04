package br.edu.ifes.poo2.escolalinguas.model.reuso;

import java.util.List;

import br.edu.ifes.poo2.escolalinguas.model.Endereco;
import br.edu.ifes.poo2.escolalinguas.model.Telefone;

public interface IPessoa {
	
	public void adicionarTelefone(Telefone telefone);
	
	public void adicionarEndereco(Endereco endereco);
	
	public List<Telefone> retornarTelefones();
	
	public List<Endereco> retornarEnderecos();

}
