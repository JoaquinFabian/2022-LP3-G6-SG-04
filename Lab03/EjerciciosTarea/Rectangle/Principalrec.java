package Lab03.EjerciciosTarea.Rectangle;

public class Principalrec {
    public static void main(String[] args) {
        Coordenada coor1 = new Coordenada(6, 3);
        Coordenada coor2 = new Coordenada(9, 7);
        Coordenada coor3 = new Coordenada(8, 4);
        Coordenada coor4 = new Coordenada(10, 2);
        Coordenada coor5 = new Coordenada(3, 9);

        Rectangulo[] lisRectangulos = new Rectangulo[] {
                new Rectangulo(coor1, coor2),
                new Rectangulo(coor2, coor3),
                new Rectangulo(coor3, coor4),
                new Rectangulo(coor4, coor5),
                new Rectangulo(coor5, coor1),
                new Rectangulo(coor2, coor4)
        };

        for (int i = 0; i < lisRectangulos.length; i++) {
            System.out.println("\n*** Rectángulo #" + (i + 1) + " ***");
            System.out.println("Base: " + lisRectangulos[i].toString());
            Manejador.area(lisRectangulos[i]);
            Manejador.perimetro(lisRectangulos[i]);
            Manejador.moverX(lisRectangulos[i]);
            Manejador.moverY(lisRectangulos[i]);
        }
    }
}
