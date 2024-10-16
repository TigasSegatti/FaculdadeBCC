/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l08;

import javax.swing.JOptionPane;

/**
 *
 * @author tsegatti
 */
public class PrincipalTeste {

    public PrincipalTeste(){
    Turma turma = new Turma("POO", Turno.MATUTINO, 
                new Professor("Luciana", "lpa@furb.br", Titulacao.MESTRADO));
    
    turma.incluirAluno(new Aluno(123, "Tiago"));
    turma.incluirAluno(new Aluno(1213, "Eugenio",876));
    turma.incluirAluno(new Aluno(12376, "Eduarda", 765));
    turma.incluirAluno(new Aluno(1379, "Laura"));
    
        JOptionPane.showMessageDialog(null, turma.listarAlunos());
        
    
    }
    public static void main(String[] args) {
     
    }
    
}
