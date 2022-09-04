/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: clase perro, atributos, conjunto a sus métodos
*/

package Lab02.EjemploPerro;

import java.util.*;

public class Perro {

    /*-----------------Variables----------------------*/

    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso;
    Scanner sc = new Scanner(System.in);

    /*-----------------Constructores----------------------*/

    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public Perro() {
        this.raza = "chusco";
        this.color = "gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    /*-----------------Gets - Sets ----------------------*/

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
     * No se coloca el atributo peso, ya que es publico y get y set
     * son para atributos de modo private
     */
    /*-----------------Gets - Sets ----------------------*/

    /*---------------------Métodos----------------------*/

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void dormir() {
        System.out.println("zzz zzzz");
    }

    public void comer() {
        System.out.println("pka pka");
    }

    public void increEdad(int anios) {
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }

    private void cambiarPeso(int anios) {
        this.peso = this.peso + (anios * 1.5);
    }

    /*---------------------Métodos----------------------*/
    /* Método especial para llamar a todos los atributos del objeto y mostrarlo */
    public String tostring() {
        return "Perro(" + "raza= " + raza + ", color= " + color + ", temp= " + temp + " grados " +
                ", edad= " + edad + " anios" + ", peso=" + peso + "kg" + ')';
    }

    /*-----------Métodos de ingreso y salida----------------------*/

    public void ingreso() {

        System.out.println("Ingresa la raza del canino:");
        raza = sc.next();

        System.out.println("Ingresa el color del canino:");
        color = sc.next();

        System.out.println("Ingresa la edad del canino:");
        edad = sc.nextInt();

        System.out.println("Ingresa el peso del canino:");
        peso = sc.nextDouble();

        System.out.println("Ingresa la temperatura del canino:");
        temp = sc.nextDouble();

        System.out.println("-----------------------------------");

    }

    public void salida() {
        System.out.println("La raza del canino es:" + getRaza());
        System.out.println("El color del canino es:" + getColor());
        System.out.println("La edad del canino es:" + getEdad());
        System.out.println("El peso del canino es:" + peso);
        System.out.println("La temperatura del canino es:" + getTemp());
    }
}
