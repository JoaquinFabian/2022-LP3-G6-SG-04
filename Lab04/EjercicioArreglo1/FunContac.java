package Lab04.EjercicioArreglo1;

import java.util.*;

public class FunContac {

    /////////////// Creamos una lista llamada listaContactos //////////////////

    List<Contacto> listaContactos = new ArrayList<>();

    /////////////// Método para invocar al menu //////////////////
    static public void Menu(List<Contacto> listaContactos) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean salir = false;
        boolean lleno = false;

        do {
            System.out.println("********* Menu *********");
            System.out.println("1. Anadir contacto nuevo");
            System.out.println("2. Buscar contacto dentro del directorio");
            System.out.println("3. Modificar contacto del directorio");
            System.out.println("4. Eliminar contacto permanente");
            System.out.println("5. Mostrar contactos del directorio");
            System.out.println("6. Salir del menu principal");
            System.out.println("Elija una opcion del menu:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    AñadirContacto(listaContactos);
                    System.out.println("\n");
                    lleno = true;
                    break;

                case 2:
                    if (lleno) {
                        System.out.println("\n");
                        BuscarContacto(listaContactos);
                        System.out.println("\n");
                    } else {
                        System.out.println("Debes ingresar un Contacto primero");
                    }
                    break;

                case 3:
                    if (lleno) {
                        System.out.println("\n");
                        ModificarContacto(listaContactos);
                        System.out.println("\n");
                    } else {
                        System.out.println("Debes ingresar un Contacto primero");
                    }
                    break;

                case 4:
                    if (lleno) {
                        System.out.println("\n");
                        EliminarContacto(listaContactos);
                        System.out.println("\n");
                    } else {
                        System.out.println("Debes ingresar un Contacto primero");
                    }
                    break;

                case 5:
                    if (lleno) {
                        System.out.println("\n");
                        System.out.println("**************** Lista de Contactos ****************");
                        System.out.println("\n");
                        MostarContacto(listaContactos);
                    } else {
                        System.out.println("Debes ingresar un Contacto primero");
                    }
                    break;

                case 6:
                    salir = true;
                    break;
            }
        } while (!salir);
        System.out.println("Final del menu");
    }

    /////////////// Método para añadir contactos //////////////////
    static public void AñadirContacto(List<Contacto> listaContactos) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String telefono;
        String direccion;

        System.out.println("\n*** Ingrese el nombre del contacto:");
        nombre = sc.next();
        System.out.println("\n*** Ingrese el telefono del contacto:");
        telefono = sc.next();
        System.out.println("\n*** Ingrese la direccion del contacto:");
        direccion = sc.next();

        Contacto nContacto = new Contacto(nombre, telefono, direccion);
        listaContactos.add(nContacto);
    }

    /////////////// Método para buscar contactos //////////////////
    public static void BuscarContacto(List<Contacto> listaContactos) {
        Scanner sc = new Scanner(System.in);
        int size = listaContactos.size();
        String nombre;

        System.out.println("Que contacto desea encontrar: (puede ingresar nombre para buscar el contacto)");
        nombre = sc.next();

        for (int i = 0; i < size; i++) {
            if ((listaContactos.get(i)).getNombre() == nombre){
                System.out.println(listaContactos.get(i));
                System.out.println("Se encontro su contacto dentro del directorio");
                System.out.println("En la posicion " + listaContactos.size());
            }
            else{
                System.out.println("No encontro su contacto dentro del directorio");
            }
        }
    }

    /////////////// Método para modificar contactos //////////////////
    public static void ModificarContacto(List<Contacto> listaContactos) {
        int size = listaContactos.size();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========================");
        System.out.println("Cantidad de contactos: " + listaContactos.size());
        int contact = 0;
        while (contact < 1 || contact > size) {
            System.out.print("Contacto a modificar: ");
            contact = sc.nextInt();
        }
        System.out.println("=========================");
        System.out.println("Contacto Escogido a Modificar");
        System.out.println("Contacto: " + contact + " | " + listaContactos.get(contact - 1));

        String st;
        System.out.println("=========================");
        System.out.print("Ingresar nuevo nombre: ");
        st = sc.nextLine();
        st = sc.nextLine();
        (listaContactos.get(contact - 1)).setNombre(st);

        System.out.print("Ingresar nuevo Telefono: ");
        st = sc.nextLine();
        (listaContactos.get(contact - 1)).setTelefono(st);

        System.out.print("Ingresar nueva Direccion: ");
        st = sc.nextLine();
        (listaContactos.get(contact - 1)).setDireccion(st);

    }

    /////////////// Método para eliminar contactos //////////////////
    public static void EliminarContacto(List<Contacto> listaContactos) {
        int size = listaContactos.size();
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Cantidad de contactos: " + listaContactos.size());
        int contact = 0;
        while (contact < 1 || contact > size) {
            System.out.print("Contacto a Eliminar: ");
            contact = sc.nextInt();
        }

        System.out.println("=========================");
        System.out.println("Contacto " + contact + " Borrado");
        listaContactos.remove(contact - 1);
    }

    /////////////// Método para mostrar contactos //////////////////
    static public void MostarContacto(List<Contacto> listaContactos) {
        int size = listaContactos.size();
        for (int i = 0; i < size; i++) {
            System.out.println("*********** Datos del contacto Numero " + i + " ***********");
            System.out.println("El nombre del contacto Numero " + i + ": " + listaContactos.get(i).getNombre());
            System.out.println("El Telefono del contacto Numero " + i + ": " + listaContactos.get(i).getTelefono());
            System.out.println("La direccion del contacto Numero " + i + ": " + listaContactos.get(i).getDireccion());
            System.out.println("***************************************************");
            System.out.println("\n");
        }
    }
    ////////////////////////////////////////////////////////////////

}
