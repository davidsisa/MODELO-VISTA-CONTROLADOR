/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author david
 */
public class ClienteController {
    private Cliente modelo;
    private ClienteView vista;

    public ClienteController(Cliente modelo, ClienteView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public int getId() {
        return modelo.getId();
    }

    public void setId(int id) {
        modelo.setId(id);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getApellido() {
        return modelo.getApellido();
    }

    public void setApellido(String apellido) {
        modelo.setApellido(apellido);
    }

    public void actualizarVista() {
        vista.imprimirDatosCliente(modelo.getId(), modelo.getNombre(), modelo.getApellido());
    }
}
