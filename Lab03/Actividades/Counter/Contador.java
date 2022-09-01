/* Autor: Joaquin Fabian Ponze Caterino
Descripción: Clase contador conjunto a sus atributos y 
sus métodos que seran aplicados dentro del programa main.
*/
package Lab03.Actividades.Counter;

public class Contador{
    static int acumulador = 0;
    final static int VALOR_INICIAL = 10;
    private int valor;

    public static int acumulador() {
        return acumulador;
    }

    public Contador(int valor) {
        this.valor = valor;
        Contador.acumulador += valor;
    }

    public Contador(){
        new Contador(Contador.VALOR_INICIAL);
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
al ejercicio anterior: (El informe debe ser subido al aula virtual al término de la sesión).

a) ¿Se pueden realizar las siguientes modificaciones en el código de la clase Contador,
sin que cambie el funcionamiento de la clase? ¿Por qué?

    3.a.1. Cambiar en el constructor Contador:
    “acumulador += valor” por “this.acumulador += valor”
    No se podría ejecutar el constructor, debido a que solo mandamos el parámetro del valor,
    esto hace que el this redireccione la variable valor, mientras el acumulador actúa como 
    una variable que solo acumula todos los valores que se mandan.

    3.a.2. Cambiar en el constructor Contador:
    “acumulador += valor” por “Contador.acumulador += valor”
    Debido a que acumulador es una variable de clase, esta acción si se puede realizar pero
    no tendría mucho sentido, ya que se invoca como variable de clase y está ya la es.

    3.a.3. Cambiar en el método inc():
    “valor++” por “this.valor++”
    El "this" tiene que redireccionar un parámetro el cual hemos mandado dentro de la función, 
    pero dentro de este método no se manda parámetros, así que no es necesario colocarlo,
    pero aun asi no habria ningun problema dentro de ejecucion del programa.

b) ¿Qué valores imprime el programa ContadorTest? ¿Por qué?

Imprime los valores 0, 5, 11, 16 
el primer valor como lo es 0 indica el valor del acumulador vacío, luego de inicializar y ejecutar los objetos 
con el constructor, para el primer objeto se muestra por pantalla que su valor es 5, igualmente 
para el segundo objeto que en este caso su valor es 11, finalmente otra vez se tiene que imprimir el valor 
acumulado del propio "acumulador como variable" que nos daría la respuesta de 16, esto por que 
acumulo los valores respectivos de los dos objetos, esto se da porque "acumulador como variable" es una
variable de clase y esta no influye dentro de los procesos de objetos de lo que es el main.

c) Si cambiamos en la clase Contador la línea:
“static int acumulador = 0” por “private static int acumulador = 0”
¿aparece algún error? ¿por qué?

Si, ocurre un error dentro de la clase, esto se da por que al ser declarada static, por tanto, las funciones,
métodos y procesos que incluyen esta variable, optan como si fuera el "acumulador como variable" una
variable de clase, mientras si lo colocamos private, está cambiando de ámbito dentro del mismo programa,
por lo que abría un error de sintaxis del código debido una variable estática no puede ser ejecutada por un objeto
dentro del main y al volverla private forzamos este caso indebidamente y errónea.

mientras si cambiamos por un private static, deja de ser una variable la cual se puede utilizar dentro del main, 
ya que esta debe tener un objeto para ser ejecutada y al ser estática dentro de la clase, abría un problema dentro
del programa principal.

d) Qué sucede si no inicializamos el valor del campo acumulador?
No sucede nada, porque al asignarle a la variable que es de tipo int siempre se inicializa con el valor de 0.

e) Vamos a agregar una constante (VALOR_INICIAL) a la clase Contador y otro
constructor, tal como se muestra a continuación (las modificaciones están
enmarcadas):
Imagen de código modificado.

f) Fíjate en la instrucción “this(Contador.VALOR_INICIAL)”. ¿Qué hace está
instrucción?
esta dirección indica la nueva constante la cual es "VALOR_INICIAL", como es dada dentro del constructor, 
esta toma su valor y lo puede mandar al incremento, que estas variables dentro del incremento no están relacionadas 
directamente con la constante, pero como también está relacionado a una variable de clase y junto al constructor
los parámetros mandados pueden tomar su propio proceso del primer constructor, que, por ende, si al objeto lo le incrementamos
su valor de la constante "VALOR_INICIAL" este si varía como acumulador.

g) Escriba una clase ContadorTest2 que compruebe y evidencie el funcionamiento de
la clase modificada y de la respuesta al ejercicio anterior.

RESPUESTA POR PANTALLA:
0
10
4
11
15

h) ¿Qué sucede si cambiamos la instrucción “this(Contador.VALOR_INICIAL)” por
“new Contador(Contador.VALOR_INICIAL)”.

Dentro de la ejecución de este código si es posible realizar el "new Contador", esto para asignarle el valor al objeto
como nuevo contador, esto hace que su valor de principio o de la constante se reinicie, por ende, por pantalla nos daría
un nuevo valor con respecto a su incremento por lo que el resultado nos daría 1.

i) ¿Qué sucede si el primer constructor lo modificamos de la siguiente forma?
Nos da un error de sintaxis, porque este constructor depende de un objeto y parámetros como tal, mientras el otro constructor
bien es necesario el objeto, pero toma el valor como si fuese el de la constante "VALOR_INICIAL", por lo que el error 
evidente dentro del primer constructor modificado.

j) Realice las siguientes modificaciones en la clase Contador:
    3.j.1.Añada una variable de clase nContadores que contenga el número de
    contadores creados.

    3.j.2.Añada una variable de clase ultimoContador que almacene el valor inicial del
    último contador creado.

    3.j.3.Escriba una clase ContadorTest3 que compruebe y evidencie el
    funcionamiento de la clase con estas úlltimas modificaciones.

*/