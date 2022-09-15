package Lab05.Actividad4;

public class EmpleadoDistribucion extends Asalariado  {
    
    // -------------- atributos -------------------
    private String region;

     // -------------- Constructor -------------------
     public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region){
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }

    // -------------- gets y sets -------------------

    public String getRegion(){
        return this.region;
    }

    public void setRegion(String nuevo_region){
        this.region = nuevo_region;
    }
}
