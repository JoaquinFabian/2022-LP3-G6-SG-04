package Lab03.EjerciciosTarea.Rectangle;

public class Rectangulo {

    /////////////// Atributos //////////////////

    private Coordenada esquina1;
    private Coordenada esquina2;
    private Coordenada esquina3;
    private Coordenada esquina4;
    private String Color = " ";

    /////////////// Constructores //////////////

    public Rectangulo(){

    }

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        esquina4.setX(esquina1.getX());
        esquina4.setY(esquina2.getY());
        esquina3.setX(esquina2.getX());
        esquina3.setY(esquina1.getY());

    }

    public Rectangulo(Coordenada esquina1) {
        esquina1.setX(0);
        esquina1.setY(0);

    }

    ///////////// Gets y Sets ////////////////////

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    public void setEsquina3(Coordenada esquina3) {
        this.esquina3 = esquina3;
    }

    public void setEsquina4(Coordenada esquina4) {
        this.esquina4 = esquina4;
    }

    ///////////// Metodo ////////////////////

    public String cambiocolor(){
        for (int i = 0; i < 3 ; i++){
            if (i == 0){
                Color = "Verde";
            }
            if (i == 1){
                Color = "Amarillo";
            }
            if (i == 2){
                Color = "Rojo";
            }
        }
        return Color;
    }


    ////////////// Metodo toStrign ///////////////////
    @Override

    public String toString() {
        String s = String.format("Primera esquina: %s\t Segunda esquina: %s\t Tercera esquina: %s\t Cuarta esquina: ",
                this.esquina1, this.esquina2, this.esquina3, this.esquina4);
        return s;
    }


}
