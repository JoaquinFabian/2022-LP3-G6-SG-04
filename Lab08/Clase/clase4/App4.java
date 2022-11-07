package Lab08.Clase.clase4;

///// PRUEBA DE Eventos de Raton /////
// Prueba de MarcoRastreadorBoton
import javax.swing.JFrame;
public class App4{
 public static void main(String[] args)
 {
 MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
 marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 marcoRastreadorRaton.setSize(700, 300);
 marcoRastreadorRaton.setVisible(true);
 }
} // fin de la clase Rastreador Raton