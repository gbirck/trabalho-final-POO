package models.dao;

import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import models.entities.Estagiario;
import models.entities.Funcionario;
import models.entities.Pessoa;

public class EstagiarioDAO {

    private int registro;
    private double salario;

    public static void create(Estagiario estagiario) {
        Connection connection = null;
        PreparedStatement psEstagiario = null;

        try {
            connection = ConnectionFactory.getConnection();

            // Inserindo os dados na tabela estagiario
            String query = "INSERT INTO estagiario (nome, idade, endereco, sexo, altura, telefone, registro, salario, bolsa, horas_servico) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psEstagiario = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            // Setando os parâmetros do estagiário
            psEstagiario.setString(1, estagiario.getNome());
            psEstagiario.setInt(2, estagiario.getIdade());
            psEstagiario.setString(3, estagiario.getEndereco());
            psEstagiario.setString(4, String.valueOf(estagiario.getSexo()));  // Convertendo char para String
            psEstagiario.setDouble(5, estagiario.getAltura());
            psEstagiario.setString(6, estagiario.getTelefone());
            psEstagiario.setInt(7, estagiario.getRegistro());
            psEstagiario.setDouble(8, estagiario.getSalario());
            psEstagiario.setDouble(9, estagiario.getBolsa());
            psEstagiario.setInt(10, estagiario.getHorasServico());

            // Executando a inserção
            psEstagiario.executeUpdate();

            ResultSet generatedKeys = psEstagiario.getGeneratedKeys();
            int id = 0;
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }

            System.out.println("Estagiário adicionado com sucesso!");

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

            String query = "DELETE FROM estagiario WHERE nome= ?";
            ps = connection.prepareStatement(query);
             ps.setString(1, nome);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }
    
    public static Estagiario view(String nome) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Estagiario estagiario = null;

        try {
            connection = ConnectionFactory.getConnection();

            // Consulta para buscar estagiário pelo nome
            String query = "SELECT * FROM estagiario WHERE nome LIKE ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + nome + "%");  // Usando LIKE para buscar por nome similar
            rs = ps.executeQuery();

            // Verifica se algum resultado foi encontrado
            if (!rs.next()) {
                System.out.println("Nenhum estagiário encontrado com o nome: " + nome);
                return null;
            }

            // Criando o objeto Estagiario com os dados recuperados do banco
            estagiario = new Estagiario(
                rs.getString("nome"),
                rs.getInt("idade"),
                rs.getString("endereco"),
                rs.getString("sexo").charAt(0),  // Convertendo o sexo de String para char
                rs.getDouble("altura"),
                rs.getString("telefone"),
                rs.getInt("registro"),
                rs.getDouble("salario"),
                rs.getDouble("bolsa"),
                rs.getInt("horas_servico")
            );

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar estagiário: " + e.getMessage());
        }

        return estagiario;
    }
}
