package L11;

import L11.Exessões.ValorInvalidoException;
/**
 * 
 * @author Tiago
 */
public class PrevidenciaPrivada extends Investimento {

    private double valor;

    /**
     * 
     * @param valor
     * @throws ValorInvalidoException 
     */
    public PrevidenciaPrivada(double valor) throws ValorInvalidoException {
        super(valor);  
        setValor(valor); 
    }

   /**
    * 
    * @return 
    */
    public double getValor() {
        return valor;
    }

    /**
     * 
     * @param valor
     * @throws ValorInvalidoException 
     */
    public void setValor(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(); 
        }
        this.valor = valor;
    }

   
    @Override
    public double calcularValorPagar() {
        return this.valor;
    }

    /**
     * 
     * @param valorInvestido
     * @throws ValorInvalidoException 
     */
    public void investir(double valorInvestido) throws ValorInvalidoException {
        if (valorInvestido < 0) {
            throw new ValorInvalidoException();
        }
        this.valor += valorInvestido;
    }
}
