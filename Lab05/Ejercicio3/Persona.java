package Lab05.Ejercicio3;

public class Persona {

    // -------------- atributos -------------------
    private int id;
    private String nombre;
    private String apellido;
    private double saldo;
    private char tipocli;

    // -------------- Constructor -------------------

    public Persona(int id, String nombre, String apellido, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        if(saldo >= 0 && saldo <= 6999 ){
            tipocli = 'C';
        }
        if(saldo >= 7000 && saldo <= 12999 ){
            tipocli = 'B';
        }
        if(saldo >= 13000){
            tipocli = 'E';
        }
        
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getTipocli() {
        return tipocli;
    }

    public void setTipocli(char tipocli) {
        this.tipocli = tipocli;
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s;
        s = "ID: " +this.id + "\n" +
        "Nombre: " + this.nombre + "\n" +
        "Apellido: " + this.apellido+ "\n" +
        "Saldo: " + this.saldo+ "\n" +
        "Tipo del cliente: " + this.tipocli + "\n";
        return s;
    }

}
