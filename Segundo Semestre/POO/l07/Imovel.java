package l07;

/**
 *
 * @author Tiago
 */
public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area menor igual a zero nn perimitida");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro inválido");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        if(finalidade == null){
        throw new IllegalArgumentException("Finalidade não pode ser vazia");
        }
        this.finalidade = finalidade;
    }

    public double calcularIptu() {
        if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade do imóvel não definida.");
        }
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não definido.");
        }
        if (bairro.getCoeficienteIptu() <= 0) {
            throw new IllegalArgumentException("Coeficiente de IPTU do bairro inválido.");
        }

        double valorBase;

        switch (finalidade) {
            case RESIDENCIAL -> {
                valorBase = area * 1.00;
            }
            case COMERCIAL -> {
                if (area <= 100) {
                    valorBase = 500;
                } else if (area <= 400) {
                    valorBase = 1000;
                } else {
                    valorBase = area * 2.55;
                }
            }
            case INDUSTRIAL -> {
                if (area <= 2000) {
                    valorBase = 1000;
                } else {
                    valorBase = 1000 + ((area - 2000) * 0.55);
                }
            }
            default ->
                throw new IllegalArgumentException("Finalidade inválida.");
        }

        return valorBase * bairro.getCoeficienteIptu();
    }

}
