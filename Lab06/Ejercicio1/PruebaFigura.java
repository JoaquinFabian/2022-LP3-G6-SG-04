package Lab06.Ejercicio1;

public class PruebaFigura {
    
    public static void main(String[] args) {
    
        Figura[] FigurasGeometricas = new Figura[6];
        int countBi = 0;
        int countTri = 0;

        FigurasGeometricas[0] = new Circulo( "Circulo", "Figura Bidimensional", 5);
        FigurasGeometricas[1] = new Cuadrado("Cuadrado", "Figura Bidimensional", 9);
        FigurasGeometricas[2] = new Triangulo("Triangulo", "Figura Bidimensional", 8, 9);
        FigurasGeometricas[3] = new Esfera("Esfera", "Figura Tridimensional", 12);
        FigurasGeometricas[4] = new Cubo("Cubo", "Figura Tridimensional", 25);
        FigurasGeometricas[5] = new Tetraedro("Tetraedro", "Figura Tridimensional", 18);

        System.out.println("Figuras Geometricas procesadas de forma Polimorfica: \n");

        for(Figura FigurasActuales : FigurasGeometricas) 
        {
            System.out.printf( FigurasActuales.toString());

            if(FigurasActuales instanceof FiguraBidimensional){
                countBi++;
            }

            if(FigurasActuales instanceof FiguraTridimiensional){
                countTri++;
            }
        }
        System.out.println("\nEn el arreglo de Figuras Geometricas hay: "+ countBi +" Figuras Geometricas Bidimensionales");
        System.out.println("En el arreglo de Figuras Geometricas hay: "+ countTri +" Figuras Geometricas Tridimensionales");
    }
}

/* SALIDA DE PANTALLA:

Figuras Geometricas procesadas de forma Polimorfica: 


--------------- Datos del Circulo ---------------
Tipo de Cuerpo: Figura Bidimensional
Tipo de Figura: Circulo
Area: 78.53999999999999

--------------- Datos del Cuadrado ---------------
Tipo de Cuerpo: Figura Bidimensional
Tipo de Figura: Cuadrado
Area: 81.0

--------------- Datos del Triangulo ---------------
Tipo de Cuerpo: Figura Bidimensional
Tipo de Figura: Triangulo
Area: 36.0

--------------- Datos de la Esfera ---------------
Tipo de Cuerpo: Figura Tridimensional
Tipo de Figura: Esfera
Area: 1809.5616
Volumen: 452.3904

--------------- Datos del Cubo ---------------
Tipo de Cuerpo: Figura Tridimensional
Tipo de Figura: Cubo
Area: 3750.0
Volumen: 15625.0

--------------- Datos del Tetraedro ---------------
Tipo de Cuerpo: Figura Tridimensional
Tipo de Figura: Tetraedro
Area: 561.1844616523163
Volumen: 687.3077913133243

En el arreglo de Figuras Geometricas hay: 3 Figuras Geometricas Bidimensionales
En el arreglo de Figuras Geometricas hay: 3 Figuras Geometricas Tridimensionales

*/