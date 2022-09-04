/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: programa principal de perfil medico
*/
package Lab02.TareaMédica;

import java.util.*;

public class Perfilprincipal {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        /*-----------Creación de objetos por cada clase-------------*/

        PerfilMedico  joaquin = new PerfilMedico ();

        /*-----------Ingreso Datos de Joaquin---------------*/
        joaquin.ingresodatos();

        /*-----------Salida de datos de Joaquin-------------*/
        joaquin.mostrardatos();

    }
}
