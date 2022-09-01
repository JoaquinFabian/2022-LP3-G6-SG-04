package Lab03.Actividades.Counter;

public class ContadorTest2 {
    public static void main(String[] args) {
        Contador o1, o2;
    
        System.out.println(Contador.acumulador());
        System.out.println(Contador.VALOR_INICIAL);
        o1 = new Contador(3);
        o2 = new Contador();
        o1.inc();
        o2.inc();
        System.out.println(o1.getValor());
        System.out.println(o2.getValor());
        System.out.println(Contador.acumulador);
        System.out.println(Contador.VALOR_INICIAL);
        }
}
