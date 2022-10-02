package Lab06.Ejercicio2;

public class PruebaEcologica {

    public static void main(String[] args) {

        ImpactoEcologico[] ObjetosImpacto = new ImpactoEcologico[3];

        ObjetosImpacto[0] = new Auto("Automovil", 200, 50, 26.4979);
        ObjetosImpacto[1] = new Edificio("Edificio", 30, 70, 35);
        ObjetosImpacto[2] = new Bicicleta("Biclicleta", 0, 20, 100);

        System.out.println("Objetos junto a su impacto Ambiental procesados de forma Polimorfica: \n");

        for(ImpactoEcologico ObjetosActuales : ObjetosImpacto) 
        {
            System.out.printf( ObjetosActuales.toString());
        }
    }    
}

/* SALIDA DE PANTALLA:
Objetos junto a su impacto Ambiental procesados de forma Polimorfica: 


--------------- Datos Ecologicos del Automovil ---------------
Categoria Contaminante: Automovil
Emision de Carbono del Automovil: 200.0
Aceleracion minima: 50.0
Gasolina depositada: 26.4979
Impacto Ecologico: 566

--------------- Datos Ecologicos del Edificio ---------------
Categoria Contaminante: Edificio
Cantidad de Residuos Solidos: 30.0
Consumo energetico: 70.0
Consumo de agua: 35.0
Impacto Ecologico: 560.0

--------------- Datos Ecologicos de la Biclicleta ---------------
Categoria Contaminante: Biclicleta
Gases Desprendidos: 0.0
Consumo energetico: 20.0
Consumo de agua: 100.0
Impacto Ecologico: 1.0000040

*/