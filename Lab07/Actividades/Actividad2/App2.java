package Lab07.Actividades.Actividad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    static Scanner sc = new Scanner(System.in);

    public static int cociente(int numerador, int denomidador) {
        return numerador / denomidador;
    }

    public static void main(String[] args){
        boolean fl = true;
        do {
            try {
                System.out.print("Introducir un numerador entero: ");
                int num = sc.nextInt();
                System.out.print("Introducir un denomidador entero: ");
                int dem = sc.nextInt();

                int res = cociente(num, dem);
                System.out.printf("\nResultado: %d / %d = %d\n", num, dem, res);
                fl = false;

            } catch (ArithmeticException arithmeticE) {
                System.out.printf("\nException: %s\n", arithmeticE);
                sc.nextLine();
                System.out.print("Cero no es un denominador valido. Intentar nuevamente\n");
            } catch (InputMismatchException inputMismatchE) {
                System.out.printf("\nException: %s\n", inputMismatchE);
                sc.nextLine();
                System.out.print("Se debe ingresar un valor entero\n");
            }
        } while (fl);
    }
}
