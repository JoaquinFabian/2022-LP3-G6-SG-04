package Lab03.EjerciciosTarea.Rectangle;

public class Rectangulo {

    /////////////// Atributos //////////////////
    
    private final static Coordenada Origen = new Coordenada(0, 0);
    private static String prevColor = "Rojo";
    private String color;
    private Coordenada esquina1;
    private Coordenada esquina2;

    ////////////// Constructores ////////////////
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
        switch (prevColor) {
            case "Rojo":
                this.color = "Verde";
                prevColor = "Verde";
                break;
            case "Verde":
                this.color = "Amarillo";
                prevColor = "Amarillo";
                break;
            case "Amarillo":
                this.color = "Rojo";
                prevColor = "Rojo";
                break;
        }
    }

    public Rectangulo(Coordenada c2) {
        this(Origen, c2);
    }

    ///////////// Gets y Sets ////////////////////

    public static Coordenada getOrigen() {
        return Origen;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    ////////////// Metodo toStrign ///////////////////
    @Override
    public String toString() {
        return "Rectangulo  =  Esquina1=" + esquina1 + ", esquina2=" + esquina2 + ", color=" + color;
    }

    
}