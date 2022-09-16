package Lab05.Actividad5;

public class TestAbstracto {

    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo(12.5, 23.7);
        System.out.println("Area del Rectangulo 1: " + rec1.area());

        Rectangulo rec2 = new Rectangulo(8.6, 33.1);
        System.out.println("Area del Rectangulo 1: " + rec2.area());

        if (rec1.mayorQue(rec2)) {
            System.out.println("El rectangulo de mayor area es el Rectangulo 1");
        } else {
            System.out.println("El rectangulo de mayor area es el Rectangulo 2");
        }
    }
}
