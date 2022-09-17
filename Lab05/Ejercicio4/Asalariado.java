package Lab05.Ejercicio4;

public class Asalariado {

    // -------------- atributos -------------------
    public String nombre;
    public long dni;
    public int diasVacaciones;
    public double saldo;

    // -------------- Constructor -------------------
    public Asalariado(String nombre, long dni, double saldo, int diasVacaciones){
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.saldo = saldo;
    }

    // -------------- gets y sets -------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni(){
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }
    
    // -------------- método toString -------------------

    @Override
    public String toString() {
        String s;
        s = "\n" +
        "--------------- Datos del empleado ---------------" + "\n"+
        "Nombre: " +this.nombre + "\n" +
        "DNI: " + this.dni + "\n" +
        "Saldo: " + this.saldo+ "\n" +
        "Dias de vacaciones: " + this.diasVacaciones+ "\n";
        return s;
    }
}
