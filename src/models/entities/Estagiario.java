package models.entities;

public class Estagiario extends Funcionario {
    private double bolsa;
    private int horasServico;
    private int funcionario_id;

     public Estagiario(String nome, int idade, String endereco, char sexo, double altura, String telefone, int registro, double salario, double bolsa, int horasServico, int funcionario_id) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        this.bolsa = bolsa;
        this.horasServico = horasServico;
        this.funcionario_id = funcionario_id;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public int getHorasServico() {
        return horasServico;
    }

    public void setHorasServico(int horasServico) {
        this.horasServico = horasServico;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
    
}
