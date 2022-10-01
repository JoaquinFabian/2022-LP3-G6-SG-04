package Lab06.Ejercicio1;

public class Circulo extends FiguraBidimensional {

    private double radio;

    // -------------Constructor----------------------

    public Circulo(String tipoFiguraBi, String tipoCuerpoBi, double radio) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setRadio(radio);
    }
    
    // ----------------gets y sets ----------------------

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double areatotal() {
        return 3.1416 * (getRadio()* getRadio());
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
