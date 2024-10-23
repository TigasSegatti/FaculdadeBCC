/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public class Contas {

    private Pagavel conta;
    private ArrayList<Pagavel> contas;

    public Contas() {
        contas = new ArrayList();
    }

    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }

    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel conta1 : contas) {
            total += conta.calcularValorPagar();
        }

        return total;
    }

}
