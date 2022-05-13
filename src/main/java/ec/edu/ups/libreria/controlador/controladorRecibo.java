/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.controlador;

import ec.edu.ups.libreria.modelo.Cliente;
import ec.edu.ups.libreria.modelo.Libro;
import ec.edu.ups.libreria.modelo.Recibo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS_GAMING
 */
public class controladorRecibo {
    
    private List<Recibo> listaRecibo;
    
    public controladorRecibo( ) {
        listaRecibo= new  ArrayList<>();
        
    }

    public controladorRecibo(List<Recibo> listaRecibo) {
        this.listaRecibo = listaRecibo;
    }


    
    public boolean crear(Recibo r){
        return listaRecibo.add(r);
    }
    
    public boolean elimiar(Recibo r){
        return listaRecibo.remove(r);
    }
    
    public Recibo buscar(int codigo){
        for (Recibo listaRecibo : listaRecibo) {
            if (listaRecibo.getCodigo()== codigo){
                return listaRecibo;
            }
        }
        return null;
    }
    
    public void modificar(Recibo r, Recibo nuevoR){
        Recibo r1 = buscar(r.getCodigo());
        listaRecibo.set(r1.getCodigo(), nuevoR);
        
        
    }
    
    public String ReciboV(int codigo,Cliente cliente,Libro libro,double precio){
        if (cliente.getCredito()< libro.calcularPrecio()){
            return "El cliente no tiene suficiente credito" ;
        }else{
            var recibo = new Recibo(codigo ,cliente, libro, precio);
            crear(recibo);
            return recibo.toString();
        }
    }

    public List<Recibo> getListaLibros() {
        return listaRecibo;
    }

    public void setListaLibros(List<Recibo> listaRecibo) {
        this.listaRecibo = listaRecibo;
    }
}
