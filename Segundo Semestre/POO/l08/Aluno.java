package l08;

/**
 *
 * @author Tiago
 */
public class Aluno {
    /**
     * Construtor sem nota do ENEM
     * @param matricula
     * @param nome 
     */
    public Aluno(int matricula, String nome)throws IllegalArgumentException {
        setMatricula(matricula);
        setNome(nome);
    }
    /**
     * Construtor com nota do ENEM
     * @param matricula
     * @param nome
     * @param notaEnem 
     */
    public Aluno(int matricula, String nome, double notaEnem)throws IllegalArgumentException {
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
    }

    private int matricula;
    private String nome;
    private double notaEnem;

    public int getMatricula() {
        return matricula;
    }
    /**
     * Método para setar matricula 
     * @param matricula
     * @throws IllegalArgumentException 
     */
    public void setMatricula(int matricula) throws IllegalArgumentException {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matricula precisa ser maior que zero");
        }
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    /**
     * Método para setar nome do aluno
     * @param nome
     * @throws IllegalArgumentException 
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }
    /**
     * Método para seta nota do ENEM 
     * @param notaEnem
     * @throws IllegalArgumentException 
     */
    public void setNotaEnem(double notaEnem)throws IllegalArgumentException {
        if (notaEnem < 0 || notaEnem > 1000) {
            throw new IllegalArgumentException("Nota ENEM inválida");
        }
        this.notaEnem = notaEnem;
    }

}
