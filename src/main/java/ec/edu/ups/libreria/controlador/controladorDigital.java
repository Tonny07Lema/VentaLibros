/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.libreria.controlador;

import ec.edu.ups.libreria.modelo.Digital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS_GAMING
 */
public class controladorDigital {
    private List<Digital> listaDigital;

    public controladorDigital() {
        listaDigital = new ArrayList<>();
    }

    public controladorDigital(List<Digital> listaDigital) {
        this.listaDigital = listaDigital;
    }
    
    public boolean crearC(Digital i) {
        return listaDigital.add(i);
    }

    public boolean eliminarC(Digital i) {
        return listaDigital.remove(i);
    }

    public Digital buscarC(int codigo) {
        for (Digital libroD : listaDigital) {
            if (libroD.getCodigo() == codigo) {
                return libroD;
            }
        }
        return null;

    }

    public void modificarC(Digital d, Digital nuevoD) {
        Digital d1 = buscarC(d.getCodigo());
        int posicion = 0;
        for (Digital listaDigital : listaDigital) {
            if (listaDigital.getCodigo() == d1.getCodigo()) {
                break;
            }
            posicion = posicion + 1;
        }
        listaDigital.set(posicion, nuevoD);
    }
    
    
    public List<Digital> getListaDigital() {
        return listaDigital;
    }

    public void setListaDigital(List<Digital> listaDigital) {
        this.listaDigital = listaDigital;
    }
}
