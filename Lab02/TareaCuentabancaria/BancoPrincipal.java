/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: programa principal del banco
*/

package Lab02.TareaCuentabancaria;

import java.util.*;  

public class BancoPrincipal {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            /*-----------Creación de objetos por cada clase-------------*/

            CuentaBanco joaquin = new CuentaBanco();

            /*-----------Ingreso Datos de Joaquin---------------*/
            joaquin.ingresodatos();

            /*-----------Salida de datos de Joaquin-------------*/
            joaquin.mostrardatos();

            /*-----------Ejecutando Menu-------------*/
            joaquin.menuacciones();
        }
    } 
}
