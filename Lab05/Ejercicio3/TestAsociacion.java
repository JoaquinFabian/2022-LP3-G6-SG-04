package Lab05.Ejercicio3;


public class TestAsociacion {
    public static void main(String[] args) {

        //------ Creacion de objeto bcp ---------
        Banco bcp = new Banco("BCP");

        //------ Personas del bcp ---------
        Persona Fabian = new Persona(82397, "Fabian", "Ponze", 18000.0);
        Persona Dante = new Persona(21484, "Dante", "Ponze",10000.0);
        Persona Guerhalt = new Persona(25425, "Guerhalt", "Torres",3200);
        Persona Fernando = new Persona(73528, "Fernando", "Luigui",1250);
        Persona Mario = new Persona(938173, "Mario", "Santillana",7000);

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
        System.out.println(bcp);
    }
}

/* PANTALLA:

Se encontro la persona Dante en la posicion 1 de la lista
Se encontro la persona Dante y se elimino de la lista
Se encontro la persona Fernando en la posicion 3 de la lista
Se encontro la persona Fernando y se elimino de la lista
Se encontro la persona Fabian en la posicion 0 de la lista
Se encontro la persona Mario en la posicion 4 de la lista

--------------- Banco de Datos ---------------
Banco: BCP

ID: 82397
Nombre: Fabian
Apellido: Ponze
Saldo: 18000.0
Tipo del cliente: E

ID: 25425
Nombre: Guerhalt
Apellido: Torres
Saldo: 3200.0
Tipo del cliente: C

ID: 938173
Nombre: Mario
Apellido: Santillana
Saldo: 7000.0
Tipo del cliente: B

*/
