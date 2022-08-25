package Lab02.TareaMédica;

import java.util.*;

public class PerfilMedico {


    /*-----------------Variables----------------------*/

    private String primernombre;
    private String apellido;
    private String genero;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;
    private int aniosper;
    private double fcm;
    private double imc;

    /*-----------------Constructores----------------------*/

    public PerfilMedico() {
        this.primernombre = "";
        this.apellido = "";
        this.genero = "";
        this.dia = 0;
        this.mes = 0;
        this.anio= 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    /*-----------------Gets - Sets ----------------------*/

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDia() {
        return dia;
    }

    public void setGenero(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAniosper() {
        return aniosper;
    }

    public void setAniosper(int aniosper) {
        this.aniosper = aniosper;
    }

    /*---------------------Métodos----------------------*/

    public void calculoedad(int dia, int mes, int anio) {
        aniosper = 2022 - anio;
        System.out.println("Los años de la persona:" + aniosper);
    }

    public void frecardiaca(int aniosper) {
        fcm = (208 - (0.7 * aniosper));
        System.out.println("La frecuencia cardiaca de la persona es:" + fcm);
    }

    public void indicedemasa(double peso, double altura) {
        imc = (peso / altura);
        System.out.println("La frecuencia cardiaca de la persona es:" + imc);
    }


    /*--------------ingresar y mostrar-----------------*/

    public void ingresodatos() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        primernombre = sc.next();

        System.out.println("Ingrese su apellido:");
        apellido = sc.next();

        System.out.println("Ingrese su fecha de nacimiento en el siguiente orden:");
        System.out.println("(DIA / MES / AÑO)");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();

        System.out.println("Ingrese su altura:");
        altura = sc.nextDouble();

        System.out.println("Ingrese su peso:");
        peso = sc.nextDouble();

        calculoedad(dia, mes, anio);
        frecardiaca(aniosper);
        indicedemasa(peso, altura);

        System.out.println("----Ingreso de datos exitoso----");

    }

    public void mostrardatos() {
        System.out.println("Nombre de la persona: " + getPrimernombre());
        System.out.println("Apellido de la persona: " + getApellido());
        System.out.println("La fecha de nacimiento de la persona es: " + getDia()+ "/" + getMes()+ "/" + getAnio());
        System.out.println("La edad de la persona: " + aniosper);
        System.out.println("La altura de la persona es: " + getAltura());
        System.out.println("El peso de la persona es: " + getPeso());
        System.out.println("La frecuencia cardiaca de la persona es: " + fcm);
        System.out.println("El IMC de la persona es: " + imc);
    }


}
