package Lab06.Ejercicio1;

public class Cubo extends FiguraTridimiensional {

    private double lado;

    // -------------Constructor----------------------

    public Cubo(String tipoFiguraTri, String tipoCuerpoTri, double lado) {
        super(tipoFiguraTri, tipoCuerpoTri);
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
        return 6 *(getLado()* getLado());
    }

    public double volumentotal() {
        return (getLado()* getLado()* getLado());
    }

    // ------------- Metodo ToString -------------
    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Datos del " + this.tipoFiguraTri+" ---------------" + "\n" +
				"Tipo de Cuerpo: " + this.tipoCuerpoTri + "\n" +
				"Tipo de Figura: " + this.tipoFiguraTri + "\n" +
				"Area: " + this.areatotal() + "\n"+
                "Volumen: " + this.volumentotal() + "\n";
		return s;
	}

}
