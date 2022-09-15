package Lab05.Actividad4;

public class EmpleadoProduccion extends Asalariado {

    // -------------- atributos -------------------
    private String turno;

    // -------------- Constructor -------------------
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno){
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }

    // -------------- gets y sets -------------------

    public String getTurno(){
        return this.turno;
    }

    public void setTurno(String nuevo_turno){
        this.turno = nuevo_turno;
    }

    
}
