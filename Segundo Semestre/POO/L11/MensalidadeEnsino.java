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
public class MensalidadeEnsino implements Pagavel {

    private int nrCreditos;
    private double precoCredito;

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) throws ValorInvalidoException {
        if (nrCreditos < 0) {
            throw new ValorInvalidoException();
        }
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(double precoCredito) throws ValorInvalidoException {
        if (precoCredito < 0) {
            throw new ValorInvalidoException();
        }
        this.precoCredito = precoCredito;
    }

    public MensalidadeEnsino(int nrCreditos, double precoCredito) throws ValorInvalidoException {
        setNrCreditos(nrCreditos);
        setPrecoCredito(precoCredito);
    }

    @Override
    public double calcularValorPagar() {
    return getNrCreditos()*getPrecoCredito();
    }

}
