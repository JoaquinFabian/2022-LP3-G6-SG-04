package Lab06.Ejercicio1;

public class Cuadrado extends FiguraBidimensional {

    private double lado;

    // -------------Constructor----------------------

    public Cuadrado(String tipoFiguraBi, String tipoCuerpoBi, double lado) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setLado(lado);
    }
    
    // ----------------gets y sets ----------------------

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double areatotal() {
        return (getLado()* getLado());
    }

    public double volumentotal() {
        return 0;
    }

    // ------------- Metodo ToString -------------
    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Datos del " + this.tipoFiguraBi +" ---------------" + "\n" +
				"Tipo de Cuerpo: " + this.tipoCuerpoBi + "\n" +
				"Tipo de Figura: " + this.tipoFiguraBi + "\n" +
				"Area: " + this.areatotal() + "\n";
		return s;
	}

}
