package Lab06.EjercicioRefuerzo;
import java.util.*;

public class Elevador {

    // -------------- atributos -------------------

    Scanner sc = new Scanner(System.in);

    private int subir;
    private int bajar;
    private double pesomax = 750;
    private Persona persona;

    // -------------- Constructor -------------------

    public Elevador() {
    }

    // -------------- gets y sets -------------------

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getSubir() {
        return subir;
    }

    public void setSubir(int subir) {
        this.subir = subir;
    }

    public int getBajar() {
        return bajar;
    }

    public void setBajar(int bajar) {
        this.bajar = bajar;
    }

    public double getPesomax() {
        return pesomax;
    }

    public void setPesomax(double pesomax) {
        this.pesomax = pesomax;
    }

    // -------------- Metodos de clase -------------------

    public void Bajarpisos(Edificio edificio) {
        if( edificio.getElevador().getPersona().Pesocompleto < pesomax ){

            System.out.println("Cuantos pisos desea bajar");
            bajar = sc.nextInt();

            if(bajar >= 1 && bajar <= edificio.getNumPisos()){
                edificio.setPisoActual(edificio.PisoActual - bajar);
                System.out.println("Llego a su destino en el piso: " + edificio.getPisoActual());
            }
        }
        if(edificio.getElevador().getPersona().Pesocompleto > pesomax){
            System.out.println("El peso de las persona excede el peso limite de " + pesomax);
        }
        if(bajar < 0 || bajar > edificio.getNumPisos()){
            System.out.println("El Numero de pisos para bajar es invalido");
            System.out.println("El piso actual es: " + edificio.getPisoActual());
        }
        
    }

    public void Subirpisos(Edificio edificio) {
        if( edificio.getElevador().getPersona().Pesocompleto < pesomax ){

            System.out.println("Cuantos pisos desea subir");
            subir = sc.nextInt();

            if(subir >= 1 && subir <= edificio.getNumPisos()){
                edificio.setPisoActual(edificio.PisoActual + subir);
                System.out.println("Llego a su destino en el piso: " + edificio.getPisoActual());
            }
        }
        if(edificio.getElevador().getPersona().Pesocompleto > pesomax){
            System.out.println("El peso de las persona excede el peso limite de " + pesomax);
        }
        if(subir < 0 || subir > edificio.getNumPisos()){
            System.out.println("El Numero de pisos para subir es invalido");
            System.out.println("El piso actual es: " + edificio.getPisoActual());
        }
    }

    public void MenuElevador(Edificio edificio, Persona[] lisPersonas) {

        
        int opcion;
        boolean salir = false;

        do {
            System.out.println(edificio.toString());
            System.out.println(edificio.getElevador().toString());
            System.out.println("Peso Actual dentro del elevador: " + edificio.getElevador().getPersona().getPesocompleto());
            System.out.println("Personas dentro del elevador: " + edificio.getElevador().getPersona().mostrarpersonas(lisPersonas) + "\n");
            System.out.println("********* Menu de elevador *********");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Salir");
            System.out.println("Escoja una opcion del menu: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Subirpisos(edificio);
                    break;

                case 2:
                    Bajarpisos(edificio);
                    break;

                case 3:
                    salir = true;
                    break;
            }

        } while (!salir);
        System.out.println("Final del menu del ascensor");
    }


    // -------------- método String -------------------
    @Override
    public String toString() {
        String s;
        s = 
            "peso maximo dentro del elevador: " + this.pesomax;
        return s;
    }
}
