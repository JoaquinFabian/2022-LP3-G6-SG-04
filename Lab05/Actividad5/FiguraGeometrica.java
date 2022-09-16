package Lab05.Actividad5;


public abstract class FiguraGeometrica { //una clase abstracta debe tener como minimo un
    private String nombre;               //un método abstracto dentro de esta

    public FiguraGeometrica(String nombreFigura){
        this.nombre = nombreFigura;
    }

    abstract public double area(); //metodo abstracto que ejecutan la clase hija Rectangu

    final public boolean mayorQue(FiguraGeometrica otra){ //el valor "final" hace que el metodo o atributo
        return this.area() > otra.area();                 // no se pueda heredar, por lo que lo hace                    
    }                                                     // estático

    final public String toString(){
        return this.nombre + " con area " + this.area();
    }
    
}
