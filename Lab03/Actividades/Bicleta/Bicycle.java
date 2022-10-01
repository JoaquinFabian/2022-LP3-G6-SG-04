/* Autor: Joaquin Fabian Ponze Caterino
Descripción: Clase Bicycle conjunto a sus atributos y 
sus métodos que seran aplicados dentro del programa main.
*/
package Lab03.Actividades.Bicleta;

public class Bicycle {
    static int count;
    private String ownerName;
    private float distance;
    private String idBicy;

    public Bicycle(String ownerName, int distance) {
        this.ownerName = ownerName;
        this.distance = distance;
        counter();
        String tempId = String.valueOf(10000 * count);
        this.idBicy = ownerName.substring(0, 2) + tempId.substring(1);
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public float getDistance() {
        return this.distance;
    }

    public void distanceTraveled(int meters) {
        this.distance += meters;
    }

    public static void counter() {
        count++;
    }

    public static Bicycle mostUsed(Bicycle x, Bicycle y) {
        if (x.distance > y.distance){
            return x;}
        return y;
    }
@Override

    public String toString() {
        String s = String.format("Bicycle : %s\t Owner: %s\t Distance in meters : %s\t", this.idBicy, this.ownerName,
                this.distance);
        return s;
    }
}


/* ----------------------------------ACTIVIDADES-----------------------------------------*/
/* Dadas las siguientes clases identifique cuales son variables de clase, variables de
instancia, métodos de instancia y métodos de clase. Posteriormente implemente y
compruebe la funcionalidad de las mismas. 

Variables de clase:
* static int count;

Variables de instancia:
* private String ownerName;
* private float distance;
* private String idBicy;


Métodos de clase:
* public static Bicycle mostUsed(Bicycle x, Bicycle y);
* public static void counter();

Métodos de instancia:
* public Bicycle(String ownerName, int distance): //constructor
* public String getOwnerName();
* public float getDistance();
* public void distanceTraveled(int meters);
* public String toString();
*/