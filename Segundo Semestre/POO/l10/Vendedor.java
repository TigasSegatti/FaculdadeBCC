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
public class Vendedor extends Funcionario {

    private double percentualComissao;
    private ArrayList<Venda> vendas;

    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * Método para setar percentual de venda
     *
     * @param percentualComissao
     */
    public void setPercentualComissao(double percentualComissao) throws IllegalArgumentException {
        if (percentualComissao <= 0) {
            throw new IllegalArgumentException("Percentual de venda deve ser menor que zero");
        }
        this.percentualComissao = percentualComissao;
    }

    public Vendedor(String nome, double salarioBase, double comissao) throws IllegalArgumentException {
        super(nome, salarioBase);
        setPercentualComissao(comissao);
        vendas = new ArrayList();
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void incluirVenda(Venda v) {
        if (v == null) {
            throw new IllegalArgumentException("Venda deve ser informada");
        }
        vendas.add(v);
    }
/**
 * Método para calcular salário do vendedor
 * @return 
 */
    public double calcularSalario() {
        double valorTotalVenda = 0;
        for (Venda v : vendas) {
            valorTotalVenda += v.getValor();
        }
        return getSalarioBase() + (valorTotalVenda * (percentualComissao / 100));
    }

}
