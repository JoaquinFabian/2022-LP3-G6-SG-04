package Lab05.Actividad4;

public class Asalariado {

    // -------------- atributos -------------------
    private String nombre;
    private long dni;
    private int diasVacaciones;

    // -------------- Constructor -------------------
    public Asalariado(String nombre, long dni, int diasVacaciones){
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
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

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }
    
}
