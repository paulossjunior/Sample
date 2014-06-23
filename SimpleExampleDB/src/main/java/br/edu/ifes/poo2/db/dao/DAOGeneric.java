package br.edu.ifes.poo2.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOGeneric {

    private Connection con;

    /**
     * Abre uma conexão com o banco de dados do postgresql.
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    protected void openConnection() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/testedb";

        con = DriverManager.getConnection(url, "postgres", "ifes");
    }

    /**
     * Executa queries de criação e deleção de tabelas.
     *
     * @param query Query a ser executada.
     * @throws SQLException
     */
    protected void execute(String query) throws SQLException {
        Statement statement = con.createStatement();
        // Comando para criar
        statement.execute(query);

        statement.close();
    }

    /**
     * Executa queries de consulta ao banco .
     *
     * @param query A query a ser executada.
     * @return Um ResultSet com os dados resultantes da consulta.
     * @throws SQLException
     */
    protected ResultSet executeQuery(String query) throws SQLException {
        Statement statement = con.createStatement();

        ResultSet rs = statement.executeQuery(query);

        return rs;
    }

    /**
     * Usado para operações de insert, delete e update.
     *
     * @param query Query a ser executada.
     * @return O id da linha inserida, deletada ou atualizada.
     * @throws SQLException
     */
    protected int executeUpdate(String query) throws SQLException {
        Statement statement = con.createStatement();

        int numero = 0;
        // Comando para update, insert e delete		
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

        ResultSet rs = statement.getGeneratedKeys();

        if (rs.next()) {
            numero = rs.getInt(1);
        }

        statement.close();

        return numero;
    }

    /**
     * Fecha a conexão com o banco de dados.
     *
     * @throws SQLException
     */
    protected void closeConnection() throws SQLException {
        con.close();
    }
}
