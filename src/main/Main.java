/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente modelo = rellenarDatosCliente();
        ClienteView vista = new ClienteView();
        ClienteController controlador = new ClienteController(modelo, vista);
        controlador.actualizarVista();
        controlador.setNombre("Largo");
        controlador.actualizarVista();
    }
        private static Cliente rellenarDatosCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Martin");
        cliente.setApellido("Fowler");
        return cliente;
    }
}
