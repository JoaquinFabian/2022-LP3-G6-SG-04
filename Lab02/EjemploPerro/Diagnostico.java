
/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: clase Diagnostico y su método para saber el 
estado del perro
*/
public class Diagnostico {

    public String aptoVacunaA (Perro perro){
        if ( perro.getTemp() >= 37.00 && perro.getTemp() <= 40.00){
            if ( perro.peso >= 5.00){
                if ( perro.getEdad() >= 1){
                return "DIAGNOSTICO: El Perro esta SANO";
                }
            } 
        }
    return "DIAGNOSTICO: El Perro esta ENFERMO";
    }
}
