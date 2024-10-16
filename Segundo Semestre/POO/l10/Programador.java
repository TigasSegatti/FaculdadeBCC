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
public class Programador extends Funcionario {

    private ArrayList<String> linguagens;

    public Programador(String nome, double salarioBase) throws IllegalArgumentException {
        super(nome, salarioBase);
        linguagens = new ArrayList<String>();
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    /**
     * Método para Inserir uma linguagem de programação
     *
     * @param linguagem
     * @throws IllegalArgumentException
     */
    public void inserirLinguagem(String linguagem) throws IllegalArgumentException {
        if (linguagem.isBlank()) {
            throw new IllegalArgumentException("Linguagem deve ser informada uma linguagem de programação");
        }
        if (buscarLinguagem(linguagem) != null) {
            throw new IllegalArgumentException("Não pode inserir a mesma linguagem duas vezes");
        }
        linguagens.add(linguagem);

    }

    /**
     * Método para remover uma linguagem
     *
     * @param linguagem
     */
    public void removerLinguagem(String linguagem) {
        String linguagemRemover = buscarLinguagem(linguagem);
        if (linguagemRemover != null) {
            linguagens.remove(linguagemRemover);
        }
    }

    /**
     * Método para calclar o salário
     *
     * @return
     */
    @Override
    public double calcularSalario() {
        if (buscarLinguagem("Java") != null) {
            return getSalarioBase() + (getSalarioBase() * 0.2);
        }
        return getSalarioBase();
    }

    /**
     * Método para buscar linguagem na lista
     *
     * @param linguagem
     * @return
     */
    private String buscarLinguagem(String linguagem) {
        for (String linguagemProgramação : linguagens) {
            if (linguagemProgramação.equalsIgnoreCase(linguagem)) {
                return linguagemProgramação;
            }
        }
        return null;
    }
}
