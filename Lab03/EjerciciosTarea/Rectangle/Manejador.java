package Lab03.EjerciciosTarea.Rectangle;
import java.util.*;

public class Manejador {

    private double altura;
    private double largo;
    Scanner sc = new Scanner(System.in);

    int moverx;
    int movery;

    ///////////// Constructor ////////////////////

    public Manejador(Coordenada esquina1, Coordenada esquina2) {
        altura = esquina2.getY() - esquina1.getY();
        largo = esquina1.getX() - esquina2.getX();
    }

    ///////////// Gets y Sets ////////////////////

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return largo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    ///////////// Área y permietro ////////////////////

    public double calcularArea() {
        return largo * altura;
    }

    public double calcularPerimetro() {
        return (2 * largo) + (2 * altura);
    }

    ///////////// Metodos mover ////////////////////

    public void moverejeX(Coordenada esquina1, Coordenada esquina2, Coordenada esquina3, Coordenada esquina4){
       

        System.out.println("Cuantas posiciones quiere mover el rectangulo en el eje X");
        moverx = sc.nextInt();
        esquina1.setX(esquina1.getX() + moverx);
        esquina2.setX(esquina2.getX() + moverx); 
        esquina3.setX(esquina3.getX() + moverx); 
        esquina4.setX(esquina4.getX() + moverx); 

    }

    public void moverejeY(Coordenada esquina1, Coordenada esquina2, Coordenada esquina3, Coordenada esquina4){
        

        System.out.println("Cuantas posiciones quiere mover el rectangulo en el eje Y");
        movery = sc.nextInt();
        esquina1.setY(esquina1.getY() + moverx);
        esquina2.setY(esquina2.getY() + moverx); 
        esquina3.setY(esquina3.getY() + moverx); 
        esquina4.setY(esquina4.getY() + moverx); 

    }
}
