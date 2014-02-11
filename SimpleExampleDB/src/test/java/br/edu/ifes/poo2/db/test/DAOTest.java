package br.edu.ifes.poo2.db.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifes.poo2.db.dao.UsuarioDAO;
import br.edu.ifes.poo2.db.model.Usuario;

public class DAOTest {

	public UsuarioDAO usuarioDAO;

	@Before
	public void before() throws ClassNotFoundException, SQLException {
		usuarioDAO = new UsuarioDAO();
		criarTabelaUsuario();
	}

	 //@Test
	private void criarTabelaUsuario() throws ClassNotFoundException,
			SQLException {

		// Criando a tabela
		usuarioDAO.criarTabela();
	}

	@Test
	public void salvarUsuario() throws ClassNotFoundException, SQLException {
		Usuario usuario = usuarioDAO.create();

		usuario.setNome("Paulo1");
		usuario.setSenha("12341");

		// inserindo o usuario no banco de dados
		usuarioDAO.insert(usuario);
		Assert.assertNotSame(0, usuario.getId());

	}

	@Test
	public void buscarUsuario() throws ClassNotFoundException, SQLException {
		Usuario usuario = usuarioDAO.create();
		usuario.setNome("Paulo1");
		usuario.setSenha("12341");

		usuarioDAO.insert(usuario);

		Usuario usuarioX = usuarioDAO.findbyID(usuario.getId());
		Assert.assertNotNull(usuarioX.getNome());

	}
	@Test
	public void listarUsuarios() throws ClassNotFoundException, SQLException{

		Usuario usuario = usuarioDAO.create();
		usuario.setNome("Paulo1");
		usuario.setSenha("12341");

		usuarioDAO.insert(usuario);
		
		Usuario usuario2 = usuarioDAO.create();
		usuario2.setNome("Paulo2");
		usuario2.setSenha("12341");

		usuarioDAO.insert(usuario2);
		
		List<Usuario> usuarios = usuarioDAO.findAll();
		
		Assert.assertNotNull(usuarios);
		
		Assert.assertNotSame(0, usuarios.size());
	}

}
