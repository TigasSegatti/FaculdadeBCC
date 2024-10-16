package l08;

import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public class Turma {

    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;

       public Turma(String disciplina, Turno turno, Professor professor) {
        alunos = new ArrayList<Aluno>();
        setDisciplina(disciplina);
        setTurno(turno);
        setProfessor(professor);
    }

    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Método para setar disciplina
     *
     * @param disciplina
     * @throws IllegalArgumentException
     */
    public void setDisciplina(String disciplina) throws IllegalArgumentException {
        if (disciplina.isBlank()) {
            throw new IllegalArgumentException("Disciplina não pode ser vazia");
        }
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    /**
     * Método para setar professor
     *
     * @param professor
     * @throws IllegalArgumentException
     */
    public void setProfessor(Professor professor) throws IllegalArgumentException {
        if (professor == null) {
            throw new IllegalArgumentException("Professor deve ser informado");
        }
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    /**
     * Método para setar turno
     *
     * @param turno
     * @throws IllegalArgumentException
     */
    public void setTurno(Turno turno) throws IllegalArgumentException {
        if (turno == null) {
            throw new IllegalArgumentException("Turno precisa ser informado");
        }
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * Método para incluir aluno
     *
     * @param aluno
     * @throws IllegalArgumentException
     */
    public void incluirAluno(Aluno aluno) throws IllegalArgumentException {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno deve ser informado");
        }
        alunos.add(aluno);
    }

    /**
     * Método para remover aluno da lista
     *
     * @param aluno
     * @throws IllegalArgumentException
     */
    public void removerAluno(String nome, int matricula) throws IllegalArgumentException {
        Aluno aRemover = buscar(matricula, nome);
        if (aRemover == null) {
            throw new IllegalArgumentException("Aluno não existente");
        }
        alunos.remove(aRemover);
    }
    /**
     * Método para buscar aluno dentro da lista
     * @param matricula
     * @param nome
     * @return 
     */
    private Aluno buscar(int matricula, String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().trim().equalsIgnoreCase(nome) && a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }
    /**
     * Método para obter o aluno com a melhor nota de ENEM
     * @return
     * @throws IllegalArgumentException 
     */
    public Aluno obterAlunoMelhorNotaEnem() throws IllegalArgumentException {
        if (alunos.isEmpty()) {
            throw new IllegalArgumentException("Não existe nenhum aluno na lista de alunos");
        }
        Aluno melhorAluno = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.getNotaEnem() > melhorAluno.getNotaEnem()) {
                melhorAluno = aluno;
            }
        }
        return melhorAluno;
    }
    /**
     * Método para listar alunos 
     * @return alunos da turma
     */
    public String listarAlunos() {
        String dados = "";
        for (Aluno aluno : alunos) {
            dados += aluno.getNome() + "\nMatricula" + aluno.getMatricula() + "\nNota ENEM";
        }
        return dados;
    }
    
    
}
