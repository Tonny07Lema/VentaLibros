/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.modelo;

/**
 *
 * @author ASUS_GAMING
 */
public class Impreso extends Libro<Impreso>{

    public Impreso() {
    }

    public Impreso(int codigo, String titulo, String autor, String edicion, double precio) {
        super(codigo, titulo, autor, edicion, precio);
    }

    
    @Override
    public double calcularComision() {
        return this.precio*0.02;
    }

    @Override
    public double calcularPrecio() {
        return this.precio + 20;
    }
    
    
}
