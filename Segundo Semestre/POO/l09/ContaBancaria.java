/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.herancameudeus.l09;

/**
 *
 * @author tsegatti
 */
public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws IllegalArgumentException {
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Numero da conta não pode ser em branco");
        }
        this.numero = numero;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) throws IllegalArgumentException {
        if (titular == null) {
            throw new IllegalArgumentException("Titular não pode ser em branco");
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser sacado precisa ser maior quer zero");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo menor que valor do saque");
        }
        this.saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta deve existir");
        } else if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

}
