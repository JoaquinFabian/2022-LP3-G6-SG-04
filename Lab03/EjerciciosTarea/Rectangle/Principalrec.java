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
            System.out.println("\n*** Rectangulo #" + (i + 1) + " ***");
            System.out.println("Base: " + lisRectangulos[i].toString());
            Manejador.area(lisRectangulos[i]);
            Manejador.perimetro(lisRectangulos[i]);
            Manejador.moverX(lisRectangulos[i]);
            Manejador.moverY(lisRectangulos[i]);
        }
    }
}

//////////// Pantalla de los 6 rectangulos ////////
/* 
*** Rectangulo #1 ***
Base: Rectangulo  =  Esquina1=[x=6, y=3], esquina2=[x=9, y=7], color=Verde
El Area es: 12
El Perimetro es: 14
Distancia a desplazar en X:  2
Nueva posicion: 
Rectangulo  =  Esquina1=[x=8, y=3], esquina2=[x=11, y=7], color=Verde
Distancia a desplazar en Y: 1
Nueva posicion: 
Rectangulo  =  Esquina1=[x=8, y=4], esquina2=[x=11, y=8], color=Verde

*** Rectangulo #2 ***
Base: Rectangulo  =  Esquina1=[x=11, y=8], esquina2=[x=8, y=4], color=Amarillo
El Area es: 12
El Perimetro es: -14
Distancia a desplazar en X: 2
Nueva posicion: 
Rectangulo  =  Esquina1=[x=13, y=8], esquina2=[x=10, y=4], color=Amarillo
Distancia a desplazar en Y: 5
Nueva posicion: 
Rectangulo  =  Esquina1=[x=13, y=13], esquina2=[x=10, y=9], color=Amarillo

*** Rectangulo #3 ***
Base: Rectangulo  =  Esquina1=[x=10, y=9], esquina2=[x=10, y=2], color=Rojo
El Area es: 0
El Perimetro es: -14
Distancia a desplazar en X: 3
Nueva posicion: 
Rectangulo  =  Esquina1=[x=13, y=9], esquina2=[x=13, y=2], color=Rojo
Distancia a desplazar en Y: 6
Nueva posicion: 
Rectangulo  =  Esquina1=[x=13, y=15], esquina2=[x=13, y=8], color=Rojo

*** Rectangulo #4 ***
Base: Rectangulo  =  Esquina1=[x=13, y=8], esquina2=[x=3, y=9], color=Verde
El Area es: -10
El Perimetro es: -18
Distancia a desplazar en X: 5
Nueva posicion: 
Rectangulo  =  Esquina1=[x=18, y=8], esquina2=[x=8, y=9], color=Verde
Distancia a desplazar en Y: 1
Nueva posicion: 
Rectangulo  =  Esquina1=[x=18, y=9], esquina2=[x=8, y=10], color=Verde

*** Rectangulo #5 ***
Base: Rectangulo  =  Esquina1=[x=8, y=10], esquina2=[x=8, y=4], color=Amarillo
El Area es: 0
El Perimetro es: -12
Distancia a desplazar en X: 7
Nueva posicion: 
Rectangulo  =  Esquina1=[x=15, y=10], esquina2=[x=15, y=4], color=Amarillo
Distancia a desplazar en Y: 3
Nueva posicion: 
Rectangulo  =  Esquina1=[x=15, y=13], esquina2=[x=15, y=7], color=Amarillo

*** Rectangulo #6 ***
Base: Rectangulo  =  Esquina1=[x=13, y=13], esquina2=[x=18, y=9], color=Rojo
El Area es: -20
El Perimetro es: 2
Distancia a desplazar en X: 8
Nueva posicion: 
Rectangulo  =  Esquina1=[x=21, y=13], esquina2=[x=26, y=9], color=Rojo
Distancia a desplazar en Y: 2
Nueva posicion: 
Rectangulo  =  Esquina1=[x=21, y=15], esquina2=[x=26, y=11], color=Rojo

*/

