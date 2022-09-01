/* Autor: Joaquin Fabian Ponze Caterino
Descripción: Programa main donde creamos 2 objetos c1 y c2
donde se incrementa el valor de nuestro objeto mediante se ejecute 
el proceso inc.
*/
package Lab03.Actividades.Counter;
public class ContadorTest {
    public static void main(String[] args) {
    Contador c1, c2;

    System.out.println(Contador.acumulador());
    c1 = new Contador(3);
    c2 = new Contador(10);
    c1.inc();
    c1.inc();
    c2.inc();
    System.out.println(c1.getValor());
    System.out.println(c2.getValor());
    System.out.println(Contador.acumulador);
    }
}

/* SALIDA DE PANTALLA:
0 -----> acumulador vacio 
5 -----> incremento de c1 por completo con los 2 inc()
11 ----> incremento de c2 por su unico inc()
16 ----> acumulador lleno conjunto a todos los valores ingresados
*/