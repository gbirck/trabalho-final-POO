package models.dao;

import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.entities.Funcionario;

public class FuncionarioDAO {

    public static void create(Funcionario funcionario) {
        String query = "INSERT INTO funcionario (nome, idade, endereco, sexo, altura, telefone, registro, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement psFuncionario = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            
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
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                System.out.println("Funcionario adicionado com sucesso! ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na inserção: " + e.getMessage());
        }
    }

    public static void delete(String nome) {
        String query = "DELETE FROM funcionario WHERE nome = ?";
        
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            
            ps.setString(1, nome);
            ps.executeUpdate();
            System.out.println("Funcionario deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }

    public static Funcionario view(String nome) {
        String query = "SELECT * FROM funcionario WHERE nome LIKE ?";
        Funcionario funcionario = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            
            ps.setString(1, "%" + nome + "%");
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    funcionario = new Funcionario(
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("endereco"),
                        rs.getString("sexo").charAt(0),
                        rs.getDouble("altura"),
                        rs.getString("telefone"),
                        rs.getInt("registro"),
                        rs.getDouble("salario")
                    );
                    System.out.println("Funcionario encontrado: " + funcionario.getNome());
                } else {
                    System.out.println("Nenhum funcionário encontrado com o nome: " + nome);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar funcionário: " + e.getMessage());
        }

        return funcionario;
    }

}
