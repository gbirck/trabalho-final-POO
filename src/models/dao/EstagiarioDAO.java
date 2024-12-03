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

            String query1 = "INSERT INTO estagiario (funcionario_id, bolsa, horas_servico) VALUES (?, ?, ?)";
            psEstagiario = connection.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
            psEstagiario.setInt(1, estagiario.getFuncionario_id());
            psEstagiario.setDouble(2, estagiario.getBolsa());
            psEstagiario.setInt(3, estagiario.getHorasServico());
            psEstagiario.executeUpdate();

            ResultSet generatedKeys = psEstagiario.getGeneratedKeys();
            int id = 0;
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }
            System.out.println("Estagiario adicionado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na inserção: " + e.getMessage());
        }
    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "DELETE FROM estagiario WHERE id= ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }

    public static void update(int id, Estagiario estagiario) {
        Connection connection = null;
        PreparedStatement psEstagiario = null;

        try {
            connection = ConnectionFactory.getConnection();

            String query = "UPDATE estagiario SET funcionario_id = ?, bolsa = ?, horas_servico = ? WHERE id = ?";
            psEstagiario = connection.prepareStatement(query);
            psEstagiario.setInt(1, estagiario.getFuncionario_id());
            psEstagiario.setDouble(2, estagiario.getBolsa());
            psEstagiario.setInt(3, estagiario.getHorasServico());
            psEstagiario.setInt(4, id);
            psEstagiario.executeUpdate();

            System.out.println("Estagiario atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na atualização: " + e.getMessage());
        }
    }

}
