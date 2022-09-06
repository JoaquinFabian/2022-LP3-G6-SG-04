package Lab04.ActividadArreglo;

import java.util.*;

public class Arreglo {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        // Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];

        // Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna;

        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;

        // Menu
        do {
            // Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Sumar la media");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion :");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println(
                                "La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        // Validamos la columna
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna <= matriz.length));
                        System.out.println("La suma de los valores de la columna es: " + columna + " es: "
                                + SumarColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    int diagonal = 0;
                    if (rellenado) {
                        // Validamos la columna
                        do {
                            System.out.println("-------------Diagonal Principal------------");
                        } while (!(diagonal >= 0 && diagonal < matriz.length));
                        System.out.println("La suma de los valores diagonal principal1 es: "
                                + SumarDiagonalPrincipal(matriz, diagonal));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    int diagonal1 = 0;
                    if (rellenado) {
                        do {
                            System.out.println("-------------Diagonal Inversa------------");
                        } while (!(diagonal1 >= 0 && diagonal1 < matriz.length));
                        System.out.println("La suma de los valores diagonal inversa es: "
                                + SumarDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        System.out.println("La media de la matriz es: " + SumarMedia(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 4");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    // Método para rellenar la matriz segun su posicion
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    // Método para sumar la columna asignada
    public static int SumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[j][columna];

        }
        return suma;
    }

    // Método para encontrar la media de la matriz
    public static float SumarMedia(int[][] matriz) {
        int suma = 0;
        float media = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[j][y];  
            }
        }
        media = (suma/16);
        return media;
    }

    // Método para sumar la fila que indique el usuario
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // Método para sumar la diagonal principal de la matriz
    public static int SumarDiagonalPrincipal(int[][] matriz, int diagonalprincipal) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[diagonalprincipal][j];
            diagonalprincipal++;
        }
        return suma;
    }

    // Método para sumar la diagonal inversa de la matriz
    public static int SumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz[i].length - (i+1)];
        }
        return suma;
    }
}

/* PANTALLA
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
1
Escribe un numero en la posicion 0 0
1
Escribe un numero en la posicion 0 1
2
Escribe un numero en la posicion 0 2
3
Escribe un numero en la posicion 0 3
4
Escribe un numero en la posicion 1 0
5
Escribe un numero en la posicion 1 1
6
Escribe un numero en la posicion 1 2
7
Escribe un numero en la posicion 1 3
8
Escribe un numero en la posicion 2 0
9
Escribe un numero en la posicion 2 1
10
Escribe un numero en la posicion 2 2
11
Escribe un numero en la posicion 2 3
12
Escribe un numero en la posicion 3 0
13
Escribe un numero en la posicion 3 1
14
Escribe un numero en la posicion 3 2
15
Escribe un numero en la posicion 3 3
16
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
2
Elige una fila
2
La suma de los valores de la fila 2 es: 42
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
3
Elige una columna
3
La suma de los valores de la columna es: 3 es: 40
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
4
-------------Diagonal Principal------------
La suma de los valores diagonal principal1 es: 34
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
5
-------------Diagonal Inversa------------
La suma de los valores diagonal inversa es: 34
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
6
La media de la matriz es: 8.0
Menu
1. Rellenar Matriz
2. Sumar fila
3. Sumar columna
4. Sumar diagonal principal
5. Sumar diagonal inversa
6. Sumar la media
7. Salir
Elije una opcion :
7
FIN */ 