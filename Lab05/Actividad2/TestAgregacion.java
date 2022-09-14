package Lab05.Actividad2;

public class TestAgregacion {

    public static void main(String[] args) {

        // creacion de objetos:
        Automovil R8 = new Automovil("V7M-238", 4, "Audi", "R-8-2022");
        Motor C8 = new Motor(12384, 1000);

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil");
        System.out.println("\n");
        R8.setMotor(C8); //relacion de agregacion 

        // Mostrar el funcionamiento //
        System.out.println("La marca del auto es: " + R8.getMarca());
        System.out.println("El modelo del auto es: " + R8.getModelo());
        System.out.println("El numero de puertas que tiene el autos es: " + R8.getNumPuertas());
        System.out.println("La placa establecida para el auto es: " + R8.getPlaca());

        // Mostrar el numero del motor y las revoluciones, esto es posible por por la relacion de agregacion
        System.out.println("El numero de motor dentro del auto es: " + R8.getMotor().getNumMotor());
        System.out.println("El numero de motor dentro del auto es: " + R8.getMotor().getRevPorMin());
    } 
}

/* PANTALLA: 
La marca del auto es: Audi
El modelo del auto es: R-8-2022
El numero de puertas que tiene el autos es: 4
La placa establecida para el auto es: V7M-238
El numero de motor dentro del auto es: 12384
El numero de motor dentro del auto es: 1000

*/


