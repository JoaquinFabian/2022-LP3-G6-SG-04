package Lab03.EjerciciosTarea.Rectangle;

import java.util.*;

public class Manejador {

    /////////////// Atributos //////////////////
    static int base, altura;


    /////////////// Constructores //////////////

    public static void base(Rectangulo r1) {
        Manejador.base = (r1.getEsquina2()).getX() - (r1.getEsquina1()).getX();
    }

    public static void altura(Rectangulo r1) {
        Manejador.altura = (r1.getEsquina2()).getY() - (r1.getEsquina1()).getY();
    }

    /////////////// Métodos Area y Perimetro ////////////
    public static void area(Rectangulo r1) {
        Manejador.base(r1);
        Manejador.altura(r1);
        int area = (Manejador.base * Manejador.altura);
        System.out.println("El Area es: " + area);
    }

    public static void perimetro(Rectangulo r1) {
        Manejador.base(r1);
        Manejador.altura(r1);
        int perimetro = ((Manejador.base * 2) + (Manejador.altura * 2));
        System.out.println("El Perimetro es: " + perimetro);
    }


    //////////////// Métodos mover X & Y ///////////////////
    public static void moverX(Rectangulo r1) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia a desplazar en X: ");
        int movX = sc.nextInt();
        (r1.getEsquina1()).setX((r1.getEsquina1()).getX() + movX);
        (r1.getEsquina2()).setX((r1.getEsquina2()).getX() + movX);
        System.out.println("Nueva posicion: ");
        System.out.println(r1);
    }

    public static void moverY(Rectangulo r1) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia a desplazar en Y: ");
        int movY = sc.nextInt();
        (r1.getEsquina1()).setY((r1.getEsquina1()).getY() + movY);
        (r1.getEsquina2()).setY((r1.getEsquina2()).getY() + movY);
        System.out.println("Nueva posicion: ");
        System.out.println(r1);
    }

}
