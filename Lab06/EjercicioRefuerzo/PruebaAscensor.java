package Lab06.EjercicioRefuerzo;

public class PruebaAscensor {

    public static void main(String[] args) {


        Persona[] lisPersonas = new Persona[5];
        lisPersonas[0] = new Persona("John",68.7);
        lisPersonas[1] = new Persona("Jane",84.3);
        lisPersonas[2] = new Persona("Joana",62.8);
        lisPersonas[3] = new Persona("Mario",77.6);
        lisPersonas[4] = new Persona("Pedro",93.1);

        
        Edificio E1 = new Edificio(7);
        Elevador elevador1 = new Elevador();

        E1.setElevador(elevador1);

        for (int i = 0; i < lisPersonas.length; i++) {
            elevador1.setPersona(lisPersonas[i]);
        }
        E1.getElevador().getPersona().Pesototal(lisPersonas);
        E1.getElevador().MenuElevador(E1,lisPersonas);
    
    }
    
}
