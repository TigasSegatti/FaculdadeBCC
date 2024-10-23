/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

import L11.Exessões.ValorInvalidoException;

/**
 *
 * @author Tiago
 */
public class ContaAgua implements Pagavel {

    private int metrosCubico;
    private double precoMetroCubico;

    public int getMetrosCubico() {
        return metrosCubico;
    }

    public void setMetrosCubico(int metrosCubico) throws ValorInvalidoException {
        if (metrosCubico < 0) {
            throw new ValorInvalidoException();
        }
        this.metrosCubico = metrosCubico;
    }

    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    public void setPrecoMetroCubico(double precoMetroCubico) throws ValorInvalidoException {
        if (precoMetroCubico < 0) {
            throw new ValorInvalidoException();
        }
        this.precoMetroCubico = precoMetroCubico;
    }

    public ContaAgua(int metrosCubico, double precoMetroCubico) throws ValorInvalidoException {
        setMetrosCubico(metrosCubico);
        setPrecoMetroCubico(precoMetroCubico);
    }

    @Override
    public double calcularValorPagar() {
        return getMetrosCubico() * getPrecoMetroCubico();
    }

}
