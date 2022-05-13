/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.controlador;

import ec.edu.ups.libreria.modelo.Impreso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS_GAMING
 */
public class controladorImpreso {
    private List<Impreso> listaImpreso;

    public controladorImpreso() {
        listaImpreso = new ArrayList<>();
    }

    public controladorImpreso(List<Impreso> listaImpreso) {
        this.listaImpreso = listaImpreso;
    }
    
    public boolean crearC(Impreso i) {
        return listaImpreso.add(i);
    }

    public boolean eliminarC(Impreso i) {
        return listaImpreso.remove(i);
    }

    public Impreso buscarC(int codigo) {
        for (Impreso libroI : listaImpreso) {
            if (libroI.getCodigo() == codigo) {
                return libroI;
            }
        }
        return null;

    }

    public void modificarC(Impreso i, Impreso nuevoI) {
        Impreso i1 = buscarC(i.getCodigo());
        int posicion = 0;
        for (Impreso listaImpreso : listaImpreso) {
            if (listaImpreso.getCodigo() == i1.getCodigo()) {
                break;
            }
            posicion = posicion + 1;
        }
        listaImpreso.set(posicion, nuevoI);
    }
    
    
    public List<Impreso> getListaImpreso() {
        return listaImpreso;
    }

    public void setListaImpreso(List<Impreso> listaImpreso) {
        this.listaImpreso = listaImpreso;
    }
    
}
