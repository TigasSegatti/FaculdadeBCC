package Model;

/**
 *
 * @author tsegatti
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser em branco");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws IllegalArgumentException {
        if (salario < 0 || salario == 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero");
        }

        this.salario = salario;
    }

    public FaixaIrpf identificarFaixaIrpf() {
        if (salario < 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (salario > 1903.99 && salario < 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario > 2826.66 && salario < 3752.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario > 3751.06 && salario < 4664.68) {
            return FaixaIrpf.QUARTA;
        } else {
            return FaixaIrpf.QUINTA;
        }
    }

}
