package Lab01;

/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: programa principal modificado
para entregar un premio, siempre y cuando se 
se adivine el número
*/

import java.util.Scanner;

public class Principal {

    static String elegir(int vida) {
        String gift = "";
        switch (vida) {
            case 1:
                gift = "Ganaste un pasaje al caribe";
                break;
            case 2:
                gift = "Ganaste una visita al museo más cercano a tu casa";
                break;
            case 3:
                gift = "Ganaste una entrada al cine";
                break;
        }
        return gift;
    }

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                vida++;
                System.out.println("Vida:" + vida + "\t¿Cual es el número secreto?");
                rp = sc.nextInt();
                if (rp == 1234)
                    fl = true;
            }while(vida < 3 && !fl);
        }
        if(fl==true)
        {
            System.out.println("Adivinaste!!!!");
            System.out.println("Ganaste un auto 0 Kilometros");
            System.out.println(elegir(vida));
        }
        else 
        System.out.println("ups, perdiste...");
    }
}
/*
 * Salida por Pantalla:
 * Vida:1 ¿Cual es el número secreto?
 * 1234
 * Adivinaste!!!!
 * Ganaste un pasaje al caribe
 */