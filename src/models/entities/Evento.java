package models.entities;

public class Evento {
    
    private String nome; 
    private int dia;
    private int hora;   

    public Evento(String nome, int dia, int hora) {
        this.nome = nome;
        this.dia = dia;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}   


    
