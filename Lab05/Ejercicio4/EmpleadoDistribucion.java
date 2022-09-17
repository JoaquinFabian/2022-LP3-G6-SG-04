package Lab05.Ejercicio4;


public class EmpleadoDistribucion extends Asalariado  {
    
    // -------------- atributos -------------------
    private String region;

     // -------------- Constructor -------------------
     public EmpleadoDistribucion(String nombre, long dni, double saldo, int diasVacaciones, String region){
        super(nombre, dni, saldo, diasVacaciones);
        this.region = region;
    }

    // -------------- gets y sets -------------------

    public String getRegion(){
        return this.region;
    }

    public void setRegion(String nuevo_region){
        this.region = nuevo_region;
    }

    // -------------- métodos -------------------

    public void incrementosalarial(double saldo){
        this.saldo = saldo * 1.15;
    }

        // -------------- método toString -------------------

        @Override
        public String toString() {
            String s;
            s = "\n" +
            "--------------- Datos del empleado de Distribucion ---------------" + "\n"+
            "Nombre: " +this.nombre + "\n" +
            "DNI: " + this.dni + "\n" +
            "Saldo: " + this.saldo+ "\n" +
            "Dias de vacaciones: " + this.diasVacaciones+ "\n"+
            "Region: " + this.region+ "\n";
            return s;
        }

}
