package Lab06.Ejercicio1;

public class Triangulo extends FiguraBidimensional {

    private double altura;
    private double base;

    public Triangulo(String tipoFiguraBi, String tipoCuerpoBi, double altura, double base) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setAltura(altura);
        setBase(base);
    }

    // ----------------gets y sets ----------------------

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double areatotal() {
        return (double) (getAltura() * getBase()) / 2;
    }

    public double volumentotal() {
        return 0;
    }

    // ------------- Metodo ToString -------------
    @Override
    public String toString() {
        String s;
        s = "\n" +
                "--------------- Datos del " + this.tipoFiguraBi + " ---------------" + "\n" +
                "Tipo de Cuerpo: " + this.tipoCuerpoBi + "\n" +
                "Tipo de Figura: " + this.tipoFiguraBi + "\n" +
                "Area: " + this.areatotal() + "\n";
        return s;
    }
}
