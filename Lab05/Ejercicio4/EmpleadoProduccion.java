package Lab05.Ejercicio4;

public class EmpleadoProduccion extends Asalariado {

    // -------------- atributos -------------------
    private String turno;

    // -------------- Constructor -------------------
    public EmpleadoProduccion(String nombre, long dni, double saldo, int diasVacaciones, String turno) {
        super(nombre, dni, saldo, diasVacaciones);
        this.turno = turno;
    }

    // -------------- gets y sets -------------------

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }

    public void incrementosalarial() {
        this.saldo = saldo * 1.15;
    }

    // -------------- método toString -------------------

    @Override
    public String toString() {
        String s;
        s = "\n" +
        "--------------- Datos del empleado de Produccion ---------------" + "\n"+
        "Nombre: " + this.nombre + "\n" +
        "DNI: " + this.dni + "\n" +
        "Saldo: " + this.saldo + "\n" +
        "Dias de vacaciones: " + this.diasVacaciones + "\n" +
        "Truno: " + this.turno+ "\n";
        return s;
    }
}
