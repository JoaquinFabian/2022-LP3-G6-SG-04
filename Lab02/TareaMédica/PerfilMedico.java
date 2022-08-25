package Lab02.TareaMédica;

public class PerfilMedico {


    /*-----------------Variables----------------------*/

    private String primernombre;
    private String apellido;
    private String genero;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    /*-----------------Constructores----------------------*/

    public PerfilMedico() {
        this.primernombre = "";
        this.apellido = "";
        this.genero = "";
        this.dia = 0;
        this.mes = 0;
        this.anio= 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    /*-----------------Gets - Sets ----------------------*/

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

}
