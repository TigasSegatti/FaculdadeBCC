/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l10;

/**
 *
 * @author tsegatti
 */
public class Principal {

    public Principal() {
        Vendedor v1 = new Vendedor("Tiago", 1500, 20);
        Programador p1 = new Programador("Luciana", 1600);
        p1.inserirLinguagem("Java");
        p1.inserirLinguagem("Phyton");
        Funcionario f1 = new Funcionario("Brenda", 1500);
        Empresa e1 = new Empresa("Furb");
        e1.incluirFuncionario(f1);
        e1.incluirFuncionario(p1);
        e1.incluirFuncionario(v1);
        
        System.out.println("salario empresa: "+e1.calcularSalario());
    }

    public static void main(String[] args) {
        new Principal();
    }
}
