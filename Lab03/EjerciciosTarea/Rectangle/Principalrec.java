package Lab03.EjerciciosTarea.Rectangle;

public class Principalrec {

    public static void main(String[] args) {

        Coordenada nro1 = new Coordenada(5, 8);
        Coordenada nro2 = new Coordenada(7, 10);

        Coordenada nro3 = new Coordenada(4, 9);
        Coordenada nro4 = new Coordenada(7, 14);

        Coordenada nro5 = new Coordenada(2, 6);
        Coordenada nro6 = new Coordenada(5, 9);

        Coordenada nro7 = new Coordenada(1, 3);
        Coordenada nro8 = new Coordenada(8, 14);

        Rectangulo[] lisRec = new Rectangulo[]{
                new Rectangulo(nro1, nro2),
                new Rectangulo(nro3, nro4),
                new Rectangulo(nro5, nro6),
                new Rectangulo(nro7, nro8)
        };

        Manejador[] lisMane = new Manejador[]{
                new Manejador (nro1, nro2),
                new Manejador (nro3, nro4),
                new Manejador (nro5, nro6),
                new Manejador (nro7, nro8)
        };

        for (int j = 0; j < lisMane.length; j++){
            for (int i = 0; i < lisRec.length; i++){

                System.out.println("\n ---- Rectangulo #" + (i+1) + "----");
                System.out.println(lisRec[i].toString());
                System.out.println(lisMane[j].calcularArea());
                System.out.println(lisMane[j].calcularPerimetro());
                System.out.println(lisRec[i].cambiocolor());
                System.out.println(lisRec[i].cambiocolor());

            }
        }
    }
}
