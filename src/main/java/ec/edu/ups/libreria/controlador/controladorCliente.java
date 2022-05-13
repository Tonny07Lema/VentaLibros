/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.controlador;

import ec.edu.ups.libreria.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS_GAMING
 */
public class controladorCliente {

    private List<Cliente> listaCliente;

    public controladorCliente() {
        listaCliente = new ArrayList<>();
    }

    public controladorCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public boolean crearC(Cliente c) {
        return listaCliente.add(c);
    }

    public boolean eliminarC(Cliente c) {
        return listaCliente.remove(c);
    }

    public Cliente buscarC(int codigo) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;

    }

    public void modificarC(Cliente c, Cliente nuevoC) {
        Cliente c1 = buscarC(c.getCodigo());
        int posicion = 0;
        for (Cliente listaCliente : listaCliente) {
            if (listaCliente.getCodigo() == c1.getCodigo()) {
                break;
            }
            posicion = posicion + 1;
        }
        listaCliente.set(posicion, nuevoC);
    }

    public void recargarCredito(Cliente cliente, double credito) {
        var cli = new Cliente(cliente.getCodigo(), cliente.getNombre(), cliente.getCedula(), cliente.getTelefono(), cliente.getCorreo(), cliente.getCredito() + credito);
        modificarC(cliente, cli);
    }

    public void dismiuiCredito(Cliente cliente, double credito) {
        var cli = new Cliente(cliente.getCodigo(), cliente.getNombre(), cliente.getCedula(), cliente.getTelefono(), cliente.getCorreo(), cliente.getCredito() - credito);
        modificarC(cliente, cli);
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaClientes(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
