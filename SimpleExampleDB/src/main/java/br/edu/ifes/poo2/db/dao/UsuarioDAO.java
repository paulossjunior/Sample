package br.edu.ifes.poo2.db.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.db.model.Usuario;

public class UsuarioDAO extends DAOGeneric implements DAO<Usuario> {

	public Usuario create() {
		
		return new Usuario();
	}
	//CRIANDO A TABELA USUARIO
	public void criarTabela() throws ClassNotFoundException, SQLException
	{
		this.openConnection();
		
		this.execute("DROP TABLE IF EXISTS USUARIO;");
		
		String sql = "CREATE TABLE USUARIO " +
					 " (ID SERIAL," +
					 " NOME varchar(255) NOT NULL," +
					 " SENHA varchar(255) NOT NULL," +
					 " PRIMARY KEY (ID) )";
		
		this.execute(sql);
		
		this.closeConnection();
	}

	public void insert(Usuario obj) throws SQLException, ClassNotFoundException {
		
		this.openConnection();
		
		String sql = "INSERT INTO USUARIO (NOME, SENHA) VALUES ('"+obj.getNome()+"','"+obj.getSenha()+"')"; 
		
		int id = this.executeUpdate(sql);
		
		obj.setId(id);
		
		this.closeConnection();
		
	}

	public void update(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	public Usuario findbyID(Long id) throws ClassNotFoundException, SQLException {
		//Query para buscar o usuario
		this.openConnection();
		
		String sql = "SELECT * FROM USUARIO WHERE ID ="+id;
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Usuario> usuarios = retriveUsuarios(rs);
		
		this.closeConnection();
		
		return usuarios.get(0);
	}
	public List<Usuario> findAll() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.openConnection();
		
		String sql = "SELECT * FROM USUARIO ";
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Usuario> usuarios = retriveUsuarios(rs);
		
		this.closeConnection();
		
		return usuarios;
	}
	
	private List<Usuario> retriveUsuarios(ResultSet rs) throws SQLException
	{
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		while (rs.next())
		{
			Usuario usuario = new Usuario();
			
			usuario.setId(rs.getInt("ID"));
			
			usuario.setNome(rs.getString("NOME"));
			
			usuario.setSenha(rs.getString("SENHA"));
			
			usuarios.add(usuario);
		}
		
		return usuarios;
	}
	

}
