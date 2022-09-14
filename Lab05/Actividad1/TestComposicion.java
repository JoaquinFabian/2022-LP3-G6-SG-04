package Lab05.Actividad1;
import java.util.*;

public class TestComposicion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creacion de objetos:
        Persona Joaquin = new Persona(445678, "Joaquin", "Ponze");
        Cuenta cuenta1 = new Cuenta(447586, 300.0);

        // El objeto Joaquin que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Joaquin");
        System.out.println("\n");
        System.out.println("El nombre del principal de la cuenta es: " + Joaquin.getNombre());
        System.out.println("El Apellido del principal de la cuenta es: " + Joaquin.getApellido());
        System.out.println("El ID de la cuenta o numero de cuenta es: " + Joaquin.getId());
        System.out.println("El ID validado de la cuenta es: " + Joaquin.getCuenta().getNumero());
        System.out.println("El saldo inicial de la cuenta es: " + Joaquin.getCuenta().getSaldo());

        // Agregamos valor al saldo//
        System.out.println("El saldo de la cuenta es 0, ingrese un saldo: ");
        double saldo = sc.nextDouble();
        Joaquin.getCuenta().setSaldo(saldo);
        System.out.println("El nuevo saldo de la cuenta es: " + Joaquin.getCuenta().getSaldo());

        // ---------------------------------------------------------------------------------//
        // Creamos un objeto cuenta para ver como funciona el constructor//
        System.out.println("\n");
        System.out.println("DATOS DEL OBJETO cuenta1");
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getSaldo());
        System.out.println("El nombre del principal de la cuenta es: " + cuenta1.getNumero());
    }

}

/* Muestra de pantalla 
DATOS DEL OBJETO Joaquin

El nombre del principal de la cuenta es: Joaquin
El Apellido del principal de la cuenta es: Ponze
El ID de la cuenta o numero de cuenta es: 445678
El ID validado de la cuenta es: 445678
El saldo inicial de la cuenta es: 0.0
El saldo de la cuenta es 0, ingrese un saldo: 
8000
El nuevo saldo de la cuenta es: 8000.0

DATOS DEL OBJETO cuenta1
El nombre del principal de la cuenta es: 300.0
El nombre del principal de la cuenta es: 447586

*/ 
