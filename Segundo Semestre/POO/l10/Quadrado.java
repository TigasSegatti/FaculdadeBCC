package L10;

/**
 *
 * @author tsegatti
 */
public class Quadrado extends Retangulo {

    private int medida;

    public Quadrado(int medida, int largura, int altura) {
        super(largura, altura);
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

}
