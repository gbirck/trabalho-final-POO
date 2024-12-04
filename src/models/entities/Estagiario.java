package models.entities;

public class Estagiario extends Funcionario {
    private double bolsa;
    private int horasServico;

     public Estagiario(String nome, int idade, String endereco, char sexo, double altura, String telefone, int registro, double salario, double bolsa, int horasServico) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        this.bolsa = bolsa;
        this.horasServico = horasServico;
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
    
}
