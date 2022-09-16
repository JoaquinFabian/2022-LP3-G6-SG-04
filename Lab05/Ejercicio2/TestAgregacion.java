package Lab05.Ejercicio2;

public class TestAgregacion {
    public static void main(String[] args) {

        // creacion de objetos:
        Automovil R8 = new Automovil("V7M-238", 4, "Audi", "R-8-2022");
        Motor C8 = new Motor(12384, 1000);

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil \n");
        R8.setMotor(C8); //relacion de agregacion 

        // Mostrar //
        System.out.println(R8);

        // creacion de objetos
        Automovil GLB = new Automovil("RMY-674", 4, "Mercedes-Benz", "GLB-2022");

        // El objeto automovil que hace todos los parametros //
        System.out.println("DATOS DEL OBJETO Automovil \n");
        
        // Mostrar //
        System.out.println(GLB);
    } 
}

/* PANTALLA:
DATOS DEL OBJETO Automovil 

Automovil con motor
Placa: V7M-238
Numero de puertas: 4
Marca del auto: Audi
Modelo del auto: R-8-2022
Numero de motor: 12384
R.V.P: 1000

DATOS DEL OBJETO Automovil 

Automovil sin motor
Placa: RMY-674
Numero de puertas: 4
Marca del auto: Mercedes-Benz
Modelo del auto: GLB-2022

*/