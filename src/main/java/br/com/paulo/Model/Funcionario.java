package br.com.paulo.Model;
import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String registroDoColaborador;
    private String cargo;
    private BigDecimal salario;

    public Funcionario() {}
    public Funcionario(String nome, String registroDoColaborador, String cargo, BigDecimal salario) {
        this.nome = nome;
        this.registroDoColaborador = registroDoColaborador;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public String getRegistroDoColaborador() {
        return registroDoColaborador;
    }
    public String getCargo() {
        return cargo;
    }
    public BigDecimal getSalario() {
        return salario;
    }
}
