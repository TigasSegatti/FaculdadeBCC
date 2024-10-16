/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10;

/**
 *
 * @author tsegatti
 */
public class Circulo extends Figura {

    private int raio;

    public Circulo(int raio) {
        setRaio(raio);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

}
