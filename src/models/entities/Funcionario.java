package models.entities;

public class Funcionario extends Pessoa {
    private int id;
    private int registro;
    private double salario;

    public Funcionario(String nome, int idade, String endereco, char sexo, double altura, String telefone, int registro, double salario) {
        super(nome, idade, endereco, sexo, altura, telefone);
        this.registro = registro;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
