
/*Autor: Joaquin Fabian Ponze Cateriano
Descripcion: clase Cuenta banco, atributos, conjunto a sus métodos
*/

package Lab02.TareaCuentabancaria;

import java.util.*;

public class CuentaBanco {

    /*-----------------Variables----------------------*/

    private String titular;
    private double cantidad;

    Scanner sc = new Scanner(System.in);

    /*-----------------Constructores----------------------*/

    public CuentaBanco() {
        this.titular = "";
        this.cantidad = 0;
    }

    /*-----------------Gets - Sets ----------------------*/

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /*---------------------Métodos----------------------*/

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
            System.out.println("Se ingreso correctamente el dinero");
        } else
            System.out.println("Ingreso un numero negativo o invalido");
    }

    public void retirar(double cantidad) {
        this.cantidad = this.cantidad - cantidad;
        if (cantidad <= 0) {
            cantidad = 0;
            System.out.println("Se redujo su saldo a 0");
            System.out.println("El retiro se dio con exito");
        }
        System.out.println("El retiro se dio con exito");
    }

    /*--------------Metodo de menu interno----------------------*/

    public void menuinterno(int opc) {
        double cantidad1;

        switch (opc) {
            case 1:
                System.out.println("Ingrese la cantidad que quiere depositar");
                cantidad1 = sc.nextDouble();
                ingresar(cantidad1);
                System.out.println("La cantidad nueva en su cuenta es: " + this.cantidad);
                break;
            case 2:
                System.out.println("Ingrese la cantidad que quiere retirar");
                cantidad1 = sc.nextDouble();
                retirar(cantidad1);
                System.out.println("La cantidad nueva en su cuenta es: " + this.cantidad);
                break;
            case 3:
                System.out.println("Su saldo es: " + this.cantidad);
                break;
            case 4:
                System.out.println("Cerrando menu");
                break;
        }
    }

    /*--------------ingresar y mostrar-----------------*/

    public void ingresodatos() {
        double cantidad2;
        
        
        
        System.out.println("Ingrese su nombre:");
        titular = sc.next();

        System.out.println("Desea ingresar una cantidad a su nueva cuenta (Si o No)");
        String rp = sc.next();
        if (rp.equals("Si" ) || rp.equals("si")) {
            System.out.println("Cual es la cantidad que desea ingresar: ");
            cantidad2 = sc.nextDouble();
            ingresar(cantidad2);
        }
        System.out.println("----Ingreso de datos exitoso----");

    }

    public void mostrardatos() {
        System.out.println("Propietario de la cuenta:" + getTitular());
        System.out.println("Salario de la cuenta:" + getCantidad());
    }

    /*--------------Menu de acciones------------------*/

    public void menuacciones() {
        System.out.println("Menu principal de usuario:");
        System.out.println("--------------------------");
        System.out.println("Escoja la accion a realizar:");
        System.out.println("1.- Ingresar dinero");
        System.out.println("2.- Retirar dinero");
        System.out.println("3.- Mostrar saldo actual");
        System.out.println("4.- Cerrar menu");

       
        System.out.println("Que opcion desea escoger:");
        int rp1 = sc.nextInt();
        if (rp1 > 0 && rp1 < 5) {
            menuinterno(rp1);
        }
    }
}
