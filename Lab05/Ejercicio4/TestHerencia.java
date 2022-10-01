package Lab05.Ejercicio4;

public class TestHerencia {

    public static void main (String [] args){
        Asalariado emplead1 = new Asalariado("Manuel Cortina", 76139218, 6000, 28);
        EmpleadoProduccion emplead2 = new EmpleadoProduccion("Juan Mota", 55273892, 4000, 30, "noche");
        EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Antonio Camino", 75829931, 1200, 35, "Arequipa");

        Asalariado obj1 = new EmpleadoDistribucion("Antonio Camino", 75829931, 1200, 35, "Arequipa");

        System.out.println(emplead1);

        emplead2.incrementosalarial();
        emplead3.incrementosalarial();

        System.out.println(emplead2);
        System.out.println(emplead3);

    }
    
}

/* SALIDA DE PANTALLA

--------------- Datos del empleado ---------------
Nombre: Manuel Cortina
DNI: 76139218
Saldo: 6000.0
Dias de vacaciones: 28


--------------- Datos del empleado de Produccion ---------------
Nombre: Juan Mota
DNI: 55273892
Saldo: 4600.0
Dias de vacaciones: 30
Truno: noche


--------------- Datos del empleado de Distribucion ---------------
Nombre: Antonio Camino
DNI: 75829931
Saldo: 1380.0
Dias de vacaciones: 35
Region: Arequipa

*/