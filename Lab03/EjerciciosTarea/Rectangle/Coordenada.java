package Lab03.EjerciciosTarea.Rectangle;

public class Coordenada {

    /////////////// Atributos //////////////////

    private int x;
    private int y;

    /////////////// Constructores //////////////

    public Coordenada() {
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
    }

    ///////////// Gets y Sets ////////////////////

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
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
        String s = String.format("Coordenada X: %s\t Coordenada Y:",
                this.x, this.y);
        return s;
    }

}
