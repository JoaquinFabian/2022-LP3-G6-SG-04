package Lab05.Actividad1;

public class Persona {

    // -------------- atributos -------------------
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    // -------------- Constructor -------------------

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // determine el numero de cuenta a traves del id 
        this.cuenta = new Cuenta(id); // se da la relacion de composicion
        // esto significa que es una relacion fuerte, en el caso de explicacion
        // la cuenta se crea cuando se crea el objeto de la persona y se le asigna su
        // numero
    }

    // -------------- gets y sets -------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s %10s", this.nombre, "|", this.apellido, "|", this.id);
        return s;
    }

}
