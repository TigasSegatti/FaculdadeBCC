/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09Parte2;

/**
 *
 * @author tsegatti
 */
public class LocalDate {

    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static LocalDate now() {
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        return new LocalDate(currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());
    }

    public int getYear() {
        return year;
    }

    public int getMonthValue() {
        return month;
    }

    public int getDayOfMonth() {
        return day;
    }

    public LocalDate of(int ano, int mes, int dia) {
        return new LocalDate(ano, mes, dia);
    }

    public LocalDate plusDays(int dias) {
        java.time.LocalDate tempDate = java.time.LocalDate.of(this.year, this.month, this.day).plusDays(dias);
        return new LocalDate(tempDate.getYear(), tempDate.getMonthValue(), tempDate.getDayOfMonth());
    }

}
