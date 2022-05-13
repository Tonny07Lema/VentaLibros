/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.modelo;

/**
 *
 * @author ASUS_GAMING
 */
public class Digital extends Libro<Digital>{

    public Digital() {
    }

    public Digital(int codigo, String titulo, String autor, String edicion, double precio) {
        super(codigo, titulo, autor, edicion, precio);
    }
    
    
    @Override
    public double calcularComision() {
        double comision = 0.05;
        return comision;
    }

    @Override
    public double calcularPrecio() {
       return  this.precio;
    }
    
}
