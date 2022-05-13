/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.modelo;

import java.util.Date;

/**
 *
 * @author ASUS_GAMING
 */
public class Recibo {
    private int codigo;
    private Cliente cliente;
    private Libro libro;
    private double total ;

    public Recibo() {
    }

    public Recibo(int codigo,  Cliente cliente, Libro libro, double total) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.libro = libro;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Recibo{" + "codigo=" + codigo +  ", cliente=" + cliente + ", libro=" + libro + ", total=" + total + '}';
    }
    
    
}
