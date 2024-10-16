/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l10;

import java.util.ArrayList;

/**
 *
 * @author tsegatti
 */
public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser em branco");
        }
        this.nome = nome;
    }

    /**
     * Construtor da classe empresa
     *
     * @param nome
     * @param funcionarios
     * @throws IllegalArgumentException
     */
    public Empresa(String nome) throws IllegalArgumentException {
        setNome(nome);
        funcionarios = new ArrayList<>();
    }

    /**
     * Método para incluir Funcionário na lista
     *
     * @param f
     */
    public void incluirFuncionario(Funcionario f) {
        if (f == null) {
            throw new IllegalArgumentException("Funcionario deve ser informado");
        }
        funcionarios.add(f);
    }

    /**
     * Método para remover funcionario da lista
     *
     * @param f
     */
    public void removerFuncionario(Funcionario f) {
        Funcionario fRemover = null;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(f.getNome())) {
                funcionarios.remove(funcionario);
                break;
            }
        }

    }
    
    public ArrayList<Funcionario> getFuncionarios(){
    return funcionarios;
    }
    
    public double calcularSalario() {
        double salarioTotal = 0;
        for (Funcionario f : funcionarios) {
            salarioTotal += f.calcularSalario();
        }
        return salarioTotal;
    }
}
