package Lab06.Actividad;

public class Factura implements Porpagar {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;


    //-------------Constructor----------------------

    public Factura(String Pieza, String descripcion, int cuenta, double precio)
    {
        numeroPieza = Pieza;
        descripcionPieza = descripcion;
        setCantidad(cuenta);
        setPrecioPorArticulo(precio);
    }

    //----------------gets y sets ----------------------

    public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

    public String getDescripcionPieza() {
		return descripcionPieza;
	}

	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

    public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}

	public void setPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}


    //------------- Método de implementacion de la interfaz -------------

    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
	public String toString() {
		String s;
		s = "\n" +
				"--------------- Factura ---------------" + "\n" +
				"Numero de piezas: " + this.numeroPieza +" "+ "("+this.descripcionPieza+")" + "\n" +
				"Cantidad: " + this.cantidad+ "\n" +
				"Precio por articulo: " + this.precioPorArticulo + "\n"+ 
                "Pago vencido: " + this.obtenerMontoPago() + "\n";
		return s;
	}

}
