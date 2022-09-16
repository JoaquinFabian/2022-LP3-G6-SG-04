package Lab05.Ejercicio3;


public class TestAsociacion {
    public static void main(String[] args) {

        //------ Creacion de objeto bcp ---------
        Banco bcp = new Banco("BCP");

        //------ Personas del bcp ---------
        Persona Fabian = new Persona(10000, "Fabian", "Ponze",'B');
        Persona Dante = new Persona(20000, "Dante", "Ponze",'C');
        Persona Guerhalt = new Persona(30000, "Guerhalt", "Torres",'E');
        Persona Fernando = new Persona(20000, "Fernando", "Luigui",'B');
        Persona Mario = new Persona(10000, "Mario", "Santillana",'C');

        //------ métodos dentro del bcp ---------
        bcp.agregarCliente(Fabian);
        bcp.agregarCliente(Dante);
        bcp.agregarCliente(Guerhalt);
        bcp.agregarCliente(Fernando);
        bcp.agregarCliente(Mario);

        //bcp.darBajaCliente(Mario);
        //bcp.darBajaCliente(Fernando);

        //bcp.buscarCliente(Fabian);
        //bcp.buscarCliente(Mario);

        //------ imprimir datos del bcp ---------
        System.out.println(bcp);
    }
}

