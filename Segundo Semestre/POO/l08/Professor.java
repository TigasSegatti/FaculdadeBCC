package l08;

/**
 *
 * @author Tiago
 */
public class Professor {

    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao) {
        setEmail(email);
        setNome(nome);
        setTitulacao(titulacao);
    }

    
    public String getNome() {
        return nome;
    }
    /**
     * Método para setar nome
     * @param nome
     * @throws IllegalArgumentException 
     */
    public void setNome(String nome)throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    /**
     * Método para setar email
     * @param email
     * @throws IllegalArgumentException 
     */
    public void setEmail(String email) throws IllegalArgumentException {
        if (email.isBlank()) {
            throw new IllegalArgumentException("Email não pode ser vazio");
        }
        this.email = email;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }
    /**
     * Método para setar titulação
     * @param titulacao
     * @throws IllegalArgumentException 
     */
    public void setTitulacao(Titulacao titulacao) throws IllegalArgumentException {

        if (titulacao == null){
            throw new IllegalArgumentException("Titulação não pode ser vazia");
        }
        this.titulacao = titulacao;
    }

}
