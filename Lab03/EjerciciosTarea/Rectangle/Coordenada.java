package Lab03.EjerciciosTarea.Rectangle;

public class Coordenada {

    /////////////// Atributos //////////////////

    private int x;
    private int y;


    ////////////// Constructores ////////////////
    public Coordenada() {
        this(0, 0);
    }
    
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Coordenada(Coordenada c) {

    }

    ///////////// Gets y Sets ////////////////////

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    ////////////// Metodo toStrign ///////////////////

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
}
