package L11;

import L11.Exessões.ValorInvalidoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * 
 * @author Tiago
 */
public class Principal {

    public static void main(String[] args) {
        try {
            ArrayList<Pagavel> contas = new ArrayList<>();

           
            contas.add(new ContaAgua(30, 5));
            PrevidenciaPrivada previdencia = new PrevidenciaPrivada(100);
            contas.add(previdencia);
            contas.add(new Investimento(50));
            contas.add(new MensalidadeEnsino(7, 64));

            double total = 0;
            StringBuilder detalhesContas = new StringBuilder();

            for (Pagavel conta : contas) {
                double valor = conta.calcularValorPagar();
                total += valor;
                detalhesContas.append(conta.getClass().getSimpleName()).append(": ").append(valor).append("\n");

                if (conta instanceof PrevidenciaPrivada) {
                    detalhesContas.append("Saldo da Previdência Privada: ").append(((PrevidenciaPrivada) conta).getValor()).append("\n");
                }
            }

            JOptionPane.showMessageDialog(null, "Total de todas as contas: " + total + "\n\n" + detalhesContas.toString());

        } catch (ValorInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
