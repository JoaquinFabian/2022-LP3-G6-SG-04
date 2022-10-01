package Lab04.EjercicioArreglo2;

import java.util.*;


public class Creaditoprincipal {

    public static void main(String[] args) {

        ArrayList<Personacredito> Evaluacion = new ArrayList<Personacredito>();
        crear(Evaluacion);
        percentMale(Evaluacion);
        percentFemale(Evaluacion);

    }

    public static void crear(ArrayList<Personacredito> Evaluacion) {
        for (int i = 0; i < 8; i++) {
            Personacredito n = new Personacredito();
            Evaluacion.add(n);
            (Evaluacion.get(i)).setSexo(rnumber(1, 2));
            (Evaluacion.get(i)).setTrabajo(rnumber(1, 2));
            if ((Evaluacion.get(i)).getTrabajo() == 2)
                (Evaluacion.get(i)).setSueldo(0);
            (Evaluacion.get(i)).setSueldo(rnumber(950, 3000));
        }
    }

    public static int rnumber(int min, int max) {
        int r_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(r_int);
        return r_int;
    }

    public static void percentMale(ArrayList<Personacredito> Evaluacion) {
        int cht = 0;
        int ch = 0;
        int chts = 0;
        for (int i = 0; i < Evaluacion.size(); i++) {
            if ((Evaluacion.get(i)).getSexo() == 1) {
                if ((Evaluacion.get(i)).getTrabajo() == 1) {
                    chts += (Evaluacion.get(i)).getSueldo();
                    cht++;
                }
                ch++;
            }
        }

        float mper = (ch * 100) / Evaluacion.size();
        float mtper = (cht * 100) / ch;
        float mtsper = (chts / cht);
        System.out.println("================================");
        System.out.println("Porcentaje de Hombres: " + mper + "%");
        System.out.println("Porcentaje de Hombres que trabajan: " + mtper + "%");
        System.out.println("Promedio Sueldo Hombres: " + mtsper);
    }

    public static void percentFemale(ArrayList<Personacredito> Evaluacion) {
        int cht = 0;
        int ch = 0;
        int chts = 0;
        for (int i = 0; i < Evaluacion.size(); i++) {
            if ((Evaluacion.get(i)).getSexo() == 2) {
                if ((Evaluacion.get(i)).getTrabajo() == 1) {
                    chts += (Evaluacion.get(i)).getSueldo();
                    cht++;
                }
                ch++;
            }
        }

        float mper = (ch * 100) / Evaluacion.size();
        float mtper = (cht * 100) / ch;
        float mtsper = (chts / cht);
        System.out.println("================================");
        System.out.println("Porcentaje de Mujeres: " + mper + "%");
        System.out.println("Porcentaje de Mujeres que trabajan: " + mtper + "%");
        System.out.println("Promedio Sueldo Mujeres: " + mtsper);
    }
}