/* Autor: Joaquin Fabian Ponze Caterino
Descripción: Creamos los objetos con el tipo Bicycle
mostramos por pantalla los nombres del dueño de la bicicleta
conjunto creamos una variable llamada mostOld, la cual almacena
el método mostUsed, que aquí mandamos una comparación de los objetos
a y b, también por medio del método toString, el cual es un método 
explicito se puede imprimir lo datos ingresados, siempre y cuando 
por medio de la comparación de un resultado de cual objeto imprimir.
*/

package Lab03.Actividades.Bicleta;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle a, b;
        a = new Bicycle("Adam Smith", 1);
        b = new Bicycle("Ben Jones", 5);
        System.out.println(b.getOwnerName());
        System.out.println(a.getOwnerName());
        a.distanceTraveled(1400);
        b.distanceTraveled(1100);
        Bicycle mostOld = Bicycle.mostUsed(a,b);
        System.out.println(mostOld);
    }
}

/* SALIDA DE PANTALLA:
Ben Jones
Adam Smith
Bicycle : Ada10000       Owner: Adam Smith      Distance in meters : 1401.0
*/