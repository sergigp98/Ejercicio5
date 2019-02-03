/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Sergio
 */
public class Pizza {

    private String tipo;
    private String tamaño;
    static int contador = 0;
    
    private int totalServidas;

    public static void miClase() {
        contador++;
    }

    public Pizza() {
    }

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public int sirve() {
        
        return totalServidas++;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public static int getTotalPedidas() {

        return contador;
    }

    
    public int getTotalServidas() {
        return totalServidas;
    }

    public void setTotalServidas(int totalServidas) {
        this.totalServidas = totalServidas;
    }

}
