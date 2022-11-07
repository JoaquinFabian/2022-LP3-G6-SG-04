package Lab07.Actividades.Actividad1;

import java.util.Scanner;

public class App {

    public static int cociente(int numerador, int denomidador) {
        return numerador / denomidador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir un numerador entero: ");
        int num = sc.nextInt();

        System.out.print("Introducir un denomidador entero: ");
        int dem = sc.nextInt();

        int res = cociente(num, dem);
        System.out.printf("\nResultado: %d / %d = %d\n", num, dem, res);
    }
}