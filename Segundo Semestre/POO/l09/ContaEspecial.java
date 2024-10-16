package br.furb.herancameudeus.l09;

/**
 *
 * @author tsegatti
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;

    public ContaEspecial(double limiteCredito) {
        super();
        setLimiteCredito(limiteCredito);
    }
    
    

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    /**
     * Método para sacar
     * @param valor
     * @throws IllegalArgumentException 
     */
    @Override
    public void sacar(double valor) throws IllegalArgumentException{
            if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser sacado precisa ser maior quer zero");
        }
       this.setSaldo(this.getSaldo()-valor);
    }
}
