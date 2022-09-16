package Lab05.Actividad5;


public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double largo, double ancho){
        super("Rectangulo");
        this.base = largo;
        this.altura = ancho;
    }
    
    public double area(){   //esta funcion ya determinanda en la clase figurageometrica
        return this.base * this.altura;  // su método se implementa dentro de la clase hija
    }
}
