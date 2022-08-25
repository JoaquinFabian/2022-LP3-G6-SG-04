import java.util.*;

public class PrincipalPerro {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            /*-----------Creación de objetos por cada clase-------------*/

            Perro Fido = new Perro("chihuahua", "marron");
            Perro Pelusa = new Perro("pequines", "blanco");
            Diagnostico D1 = new Diagnostico();


            /*-----------Ingreso Datos de Fido---------------*/
            System.out.println(Fido.ingreso());
            Fido.increEdad(2);

            
            /*-----------Ingreso Datos de Pelusa-------------*/
            System.out.println(Pelusa.ingreso());
            Pelusa.increEdad(5);


            /*-----------Salida de datos de Fido y Pelusa-------------*/
            Fido.salida();
            System.out.println(D1.aptoVacunaA(Fido));
            Pelusa.salida();
            System.out.println(D1.aptoVacunaA(Pelusa));
        }
    }
}


