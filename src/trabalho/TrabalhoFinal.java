package trabalho;

import connections.ConnectionFactory;
import java.util.List;
import models.dao.EstagiarioDAO;
import models.dao.FuncionarioDAO;
import models.entities.Estagiario;
import models.entities.Funcionario;
import models.entities.Pessoa;

import view.home;

public class TrabalhoFinal {

    public static void main(String[] args) {
      
        home Home = new home();
        Home.setVisible(true);
      
        ConnectionFactory conn =  new ConnectionFactory();
        conn.getConnection();
        
        Funcionario funcionario1 = new Funcionario(
            "Carlos Silva", 30, "Rua X, 123", 'M', 1.75, "123456789",
            12345, 5000.0
        );
        
        Funcionario funcionario2 = new Funcionario(
            "Roberta Nanica", 30, "Rua X, 123", 'F', 1.55, "123456789",
            12345, 10000.0
        );
        
        Estagiario estagiario1 = new Estagiario(
            "Maria Souza", 22, "Rua Y, 456", 'F', 1.65, "987654321",
            54321, 1500.0, 1200.0, 30, 1
        );
        
        Estagiario estagiario2 = new Estagiario(
           "Joao Roberto", 22, "Rua Y, 456", 'M', 1.95, "987654321",
            54321, 2200.0, 1600.0, 40, 2
        );
        
        //FuncionarioDAO.create(funcionario1);
        //FuncionarioDAO.create(funcionario2);
        //EstagiarioDAO.create(estagiario1);
        //EstagiarioDAO.create(estagiario2);
        
        Funcionario funcionario3 = new Funcionario(
            "Rogerio Ceni", 40, "Rua X, 123", 'M', 1.85, "123456789",
            1001, 2500.0
        );
        
        Estagiario estagiario3 = new Estagiario(
            "Maria Souza", 22, "Rua Y, 456", 'F', 1.65, "987654321",
            54321, 1500.0, 1000.0, 44,2
        );
        
        //FuncionarioDAO.update(2, funcionario3);
        //EstagiarioDAO.update(2, estagiario3);
       
        //EstagiarioDAO.delete(2);
        //FuncionarioDAO.delete(2);
    }
    
}
