/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l10;

/**
 *
 * @author tsegatti
 */
public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) throws IllegalArgumentException {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser branco");
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws IllegalArgumentException {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salário não pode ser menor ou igual a zero");
        }
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

}
