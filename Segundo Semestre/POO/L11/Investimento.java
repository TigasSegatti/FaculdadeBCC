package L11;

import L11.Exessões.ValorInvalidoException;

public class Investimento implements Pagavel {

    private double saldo;

    // Construtor que recebe o saldo inicial do investimento
    public Investimento(double saldo) throws ValorInvalidoException {
        setSaldo(saldo);  // Chama o setter para verificar se o saldo não é negativo
    }

    // Getter para o saldo do investimento
    public double getSaldo() {
        return saldo;
    }

    // Setter com validação para não aceitar saldo negativo
    protected void setSaldo(double saldo) throws ValorInvalidoException {
        if (saldo < 0) {
            throw new ValorInvalidoException(); // Exceção mais clara
        }
        this.saldo = saldo;
    }

    // Implementação do método da interface Pagavel para calcular o valor a ser pago
    @Override
    public double calcularValorPagar() {
        return this.saldo;
    }
}
