package models.dao;

import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import models.entities.Evento;

public class EventoDAO {

    public static void delete(String nome) {
        String query = "DELETE FROM evento WHERE nome = ?";
        
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            
            ps.setString(1, nome);
            ps.executeUpdate();
            System.out.println("Evento deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }

    public static Evento view(String nome) {
        String query = "SELECT * FROM evento WHERE nome LIKE ?";
        Evento evento = null;

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            
            ps.setString(1, "%" + nome + "%");
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    evento = new Evento(
                        rs.getString("nome"),
                        rs.getInt("dia"),
                        rs.getInt("hora")
                    );
                    System.out.println("Evento encontrado: " + evento.getNome());
                } else {
                    System.out.println("Nenhum evento encontrado com o nome: " + nome);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar evento: " + e.getMessage());
        }

        return evento;
    }


    public static void create(Evento evento) {
        String query = "INSERT INTO evento (nome, dia, hora) VALUES (?, ?, ?)";
        
        try (Connection connection = (Connection) ConnectionFactory.getConnection();
             PreparedStatement psEvento = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            
            psEvento.setString(1, evento.getNome());
            psEvento.setInt(2, evento.getDia());
            psEvento.setInt(3, evento.getHora());
            psEvento.executeUpdate();

            ResultSet generatedKeys = psEvento.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                System.out.println("Evento adicionado com sucesso! ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro na inserção: " + e.getMessage());
        }
    }
}

