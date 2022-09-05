package Lab03.EjerciciosTarea.Fechaestablecida;

public class PrincipalFecha {

    
    public static void main(String[] args) {
        Fecha hoy = new Fecha(2, 1, 2022);
        Fecha otro = new Fecha(1, 1, 2022);
        System.out.println(Fecha.mayorQue(hoy, otro));

    }

}
