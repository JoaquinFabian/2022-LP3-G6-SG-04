package Lab05.Actividad3;

import Lab05.Actividad1.*;

public class Banco {

    // -------------- atributos -------------------

    private String nombre;
    private Persona clientes[];

    // -------------- Constructor -------------------
    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numcli) {
        this.nombre = nombre;
        this.clientes = new Persona[numcli];
    }

    // -------------- gets y sets -------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    // -------------- Métodos ---------------------

    // -------------- Método para agregar cliente ---------------------
    public void agregarCliente(Persona persona) {
        if (buscarCliente(persona)) {
            System.out.println("La persona ya esta registrada como cliente...");
        } else {
            int i;
            for (i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] == null) {
                    break;
                }
            }
            if (i >= this.clientes.length)
                System.out.println("No hay capacidad para m�s clientes...");
            else
                this.clientes[i] = persona;
        }

    }

    // ----- Método para eliminar un cliente de la lista ---------------
    public void darBajaCliente(Persona persona) {
        if (buscarCliente(persona)) {
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null) {
                    if (this.clientes[i].equals(persona)) {
                        this.clientes[i] = null;
                        System.out.println("Se encontro la persona " + persona + " y se elimino de la lista");
                    }
                }
            }
        }
    }

    // ------ Método para buscar una persona dentro de la lista---------
    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                if (this.clientes[i].equals(persona)) {
                    System.out.println("Se encontro la persona " + persona + " en la posicion " + i + " de la lista");
                    return true;
                }
            }
        }
        return false;
    }

    // -------------- Métodos ToString ---------------------
    @Override

    public String toString() {
        String s;
        s = "Banco: " + this.nombre + "\n";
        for (Persona persona : this.clientes) {
            if (persona != null) {
                s = persona + "\n";
            }
        }
        return s;
    }

}
