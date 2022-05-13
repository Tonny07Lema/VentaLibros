/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.ups.libreria;

import ec.edu.ups.libreria.controlador.controladorCliente;
import ec.edu.ups.libreria.controlador.controladorDigital;
import ec.edu.ups.libreria.controlador.controladorImpreso;
import ec.edu.ups.libreria.controlador.controladorRecibo;
import ec.edu.ups.libreria.modelo.Cliente;
import ec.edu.ups.libreria.modelo.Digital;
import ec.edu.ups.libreria.modelo.Impreso;
import java.util.Scanner;

/**
 *
 * @author ASUS_GAMING
 */
public class Libreria {

    public static void main(String[] args) {
        controladorCliente controladorCliente = new controladorCliente();
        controladorImpreso controladorImpreso = new controladorImpreso();
        controladorDigital controladorDigital = new controladorDigital();
        controladorRecibo controladorRecibo = new controladorRecibo();
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("____Comercio Electronico_________");
        System.out.println("Datos del Libro");
        System.out.println("Ingrese el codigo");
        var id = teclado.nextInt();
        System.out.println("Ingrese el Titulo");
        var titulo = teclado.next();
        System.out.println("Ingrese el Autor");
        var Autor = teclado.next();
        System.out.println("Ingrese la Edicion");
        var Edicion = teclado.next();
        System.out.println("Ingrese el Precio");
        var Precio = teclado.nextDouble();
        
        System.out.println("Tipo de Libro");
        System.out.println("1:Libro Digital");
        System.out.println("2:Libro Impreso");
        var TipoLibro = teclado.nextInt();
        
        System.out.println("Datos del Cliente");
        System.out.println("Ingrese el codigo");
        var idC = teclado.nextInt();
        System.out.println("Ingrese el Nombre");
        var nombre = teclado.next();
        System.out.println("Ingrese la Cedula");
        var cedula = teclado.next();
        System.out.println("Ingrese el telefono");
        var telefono = teclado.next();
        System.out.println("Ingrese el Correo");
        var correo = teclado.next();
        System.out.println("Ingrese el Credito");
        var credito = teclado.nextDouble();
        
        var cliente = new Cliente(idC, nombre, cedula, telefono, correo, credito);
        
        switch (TipoLibro) {
            case 1:
                var Digital = new Digital(id, titulo, Autor, Edicion, Precio);

                System.out.println(controladorRecibo.ReciboV(0, cliente, Digital, Digital.getPrecio(),Digital.calcularPrecio()));
                cliente.setCredito(cliente.getCredito() - Digital.calcularPrecio());
                break;
            case 2:
                var Impreso = new Impreso(id, titulo, Autor, Edicion, Precio);

                System.out.println(controladorRecibo.ReciboV(0, cliente, Impreso, Impreso.getPrecio(), Impreso.calcularPrecio()));
                cliente.setCredito(cliente.getCredito() - Impreso.calcularPrecio());
                break;
            default:
                throw new AssertionError();
        }
    }
}
