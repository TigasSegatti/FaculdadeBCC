/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09Parte2;

/**
 *
 * @author tsegatti
 */
public class Movimento {

    private double valor;
    private LocalDate data;
    private TipoMovimento tipoMovimento;
    private LocalTime hora;

    public Movimento(double valor, TipoMovimento tipoMovimento) {
        this.valor = valor;
        this.tipoMovimento = tipoMovimento;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public LocalTime getHora() {
        return hora;
    }

}
