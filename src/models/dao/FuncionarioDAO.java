package models.dao;

import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.entities.Funcionario;

public class FuncionarioDAO {

    private int registro;
    private double salario;

    public static void create(Funcionario funcionario) {
        Connection connection = null;
        PreparedStatement psFuncionario = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "INSERT INTO funcionario (nome, idade, endereco, sexo, altura, telefone, registro, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            psFuncionario = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            psFuncionario.setString(1, funcionario.getNome());
            psFuncionario.setInt(2, funcionario.getIdade());
            psFuncionario.setString(3, funcionario.getEndereco());
            psFuncionario.setString(4, String.valueOf(funcionario.getSexo()));
            psFuncionario.setDouble(5, funcionario.getAltura());
            psFuncionario.setString(6, funcionario.getTelefone());
            psFuncionario.setInt(7, funcionario.getRegistro());
            psFuncionario.setDouble(8, funcionario.getSalario());
            psFuncionario.executeUpdate();

            ResultSet generatedKeys = psFuncionario.getGeneratedKeys();
            int id = 0;
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }

            System.out.println("Funcionario adicionado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na inserção: " + e.getMessage());
        }
    }

    public static void delete(String nome) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "DELETE FROM funcionario WHERE nome= ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, nome);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }
    
    public static Funcionario view(String nome) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Funcionario funcionario = null;

        try {
            connection = ConnectionFactory.getConnection();

            // Consulta para buscar funcionário pelo nome
            String query = "SELECT * FROM funcionario WHERE nome LIKE ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + nome + "%");  // Usando LIKE para buscar por nome similar
            rs = ps.executeQuery();

            // Verifica se algum resultado foi encontrado
            if (!rs.next()) {
                System.out.println("Nenhum funcionário encontrado com o nome: " + nome);
                return null;
            }

            // Criando o objeto Funcionario com os dados recuperados do banco
            funcionario = new Funcionario(
                rs.getString("nome"),
                rs.getInt("idade"),
                rs.getString("endereco"),
                rs.getString("sexo").charAt(0),  // Assume-se que sexo é um único caractere
                rs.getDouble("altura"),
                rs.getString("telefone"),
                rs.getInt("registro"),
                rs.getDouble("salario")
            );

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar funcionário: " + e.getMessage());
        }

        return funcionario;
    }


    public static void update(int id, Funcionario funcionario) {
        Connection connection = null;
        PreparedStatement psFuncionario = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query1 = "UPDATE funcionario SET nome = ?, idade = ?, endereco = ?, sexo = ?, altura = ?, telefone = ?, registro = ?, salario = ? WHERE id = ?";
            psFuncionario = connection.prepareStatement(query1);
            psFuncionario.setString(1, funcionario.getNome());
            psFuncionario.setInt(2, funcionario.getIdade());
            psFuncionario.setString(3, funcionario.getEndereco());
            psFuncionario.setString(4, String.valueOf(funcionario.getSexo()));
            psFuncionario.setDouble(5, funcionario.getAltura());
            psFuncionario.setString(6, funcionario.getTelefone());
            psFuncionario.setInt(7, funcionario.getRegistro());
            psFuncionario.setDouble(8, funcionario.getSalario());
            psFuncionario.setInt(9, id);
            psFuncionario.executeUpdate();

            System.out.println("Funcionario atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na atualização: " + e.getMessage());
        }
    }
}
