/* Autor: Joaquin Fabian Ponze Caterino
Descripción: Clase contador conjunto a sus atributos y 
sus métodos que seran aplicados dentro del programa main.
*/
package Lab03.Actividades.Counter;

public class Contador{
    static int acumulador = 0;
    private int valor;

    public static int acumulador() {
        return acumulador;
    }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
    }

    public void inc() {
        valor++;
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}

/* ----------------------------------ACTIVIDADES-----------------------------------------*/
/* Elabore un informe en el que evidencie y responda las siguientes preguntas en relación
al ejericicio anterior: (El informe debe ser subido al aula virtual al término de la sesión).

a) ¿Se pueden realizar las siguientes modificaciones en el código de la clase Contador,
sin que cambie el funcionamiento de la clase? ¿Por qué?

    3.a.1. Cambiar en el constructor Contador:
    “acumulador += valor” por “this.acumulador += valor”
    No se podria ejecutar el constructor, debido a que solo mandamos el parametro del valor,
    esto hace que el this redireccione la variable valor, mientras el acumulador actua como 
    una variable que solo acumula todos los valores que se mandan.

    


*/