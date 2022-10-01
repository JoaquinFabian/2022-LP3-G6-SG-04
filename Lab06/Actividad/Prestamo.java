package Lab06.Actividad;

public class Prestamo implements Porpagar {

    double numeroDeCuotas;
    double montoDeCuota;

    // -------------Constructor----------------------

    public Prestamo(double numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    // ----------------gets y sets ----------------------

    public double getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(double numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }
    
    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }    

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double obtenerMontoPago() {
        return getNumeroDeCuotas() * getMontoDeCuota();
    }

    @Override
    public String toString() {
        String s;
        s = "\n" +
                "--------------- Datos del Prestamo ---------------" + "\n" +
                "Numero de cuotas: " + this.numeroDeCuotas+ "\n" +
                "Monto por couta (Unidad): " + this.montoDeCuota + "\n" +
                "Pago vencido: " + this.obtenerMontoPago() + "\n";
        return s;
    }

}
