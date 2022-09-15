package Lab05.Actividad3;

import Lab05.Actividad1.Persona;

public class TestAsociacion {
    public static void main(String[] args) {

        //------ Creacion de objeto bcp ---------
        Banco bcp = new Banco("BCP");

        //------ Personas del bcp ---------
        Persona Fabian = new Persona(82397, "Fabian", "Ponze");
        Persona Dante = new Persona(21484, "Dante", "Ponze");
        Persona Guerhalt = new Persona(25425, "Guerhalt", "Torres");
        Persona Fernando = new Persona(73528, "Fernando", "Luigui");
        Persona Mario = new Persona(938173, "Mario", "Santillana");

        //------ métodos dentro del bcp ---------
        bcp.agregarCliente(Fabian);
        bcp.agregarCliente(Dante);
        bcp.agregarCliente(Guerhalt);
        bcp.agregarCliente(Fernando);
        bcp.agregarCliente(Mario);

        bcp.darBajaCliente(Dante);
        bcp.darBajaCliente(Fernando);

        bcp.buscarCliente(Fabian);
        bcp.buscarCliente(Mario);

        //------ imprimir datos del bcp ---------
        bcp.toString();


        //------ Creacion de objeto bbva ---------
        Banco bbva = new Banco("BBVA",30);

        //------ Personas del bbva ------------
        Persona Eduardo = new Persona(738249, "Eduardo", "Manchego");
        Persona Victor = new Persona(327845, "Victor", "Hu");
        Persona Rodrigo = new Persona(823704, "Rodrigo", "Mendoza");
        Persona Sebastian = new Persona(00042, "Sebastian", "Ponze");
        Persona Geampier = new Persona(892474, "Geampier", "Chavez");

        //------ métodos dentro del bbva ---------
        bbva.agregarCliente(Eduardo);
        bbva.agregarCliente(Victor);
        bbva.agregarCliente(Rodrigo);
        bbva.agregarCliente(Sebastian);
        bbva.agregarCliente(Geampier);

        bbva.darBajaCliente(Victor);
        bbva.darBajaCliente(Sebastian);

        bbva.buscarCliente(Eduardo);
        bbva.buscarCliente(Geampier);

        //------ imprimir datos del bbva --------
        bbva.toString();
    }
}
