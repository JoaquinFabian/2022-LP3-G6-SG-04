package Lab05.Ejercicio1;

public class TestComposicion {
	public static void main(String[] args) {

		Cuenta c1 = new Cuenta(1000);
		Persona p1 = new Persona(100,"Joaquin", "Ponze");
		System.out.println(p1);
		c1.depositar(100);
		System.out.println(c1);
		
		Cuenta c2 = new Cuenta(8000);
		Persona p2 = new Persona(101,"Guerhalt", "Torres",'E');
		System.out.println(p2); 
		c2.depositar(500);
		System.out.println(c2);
		c2.retirar(100);
		System.out.println(c2);
		
		Cuenta c3 =new Cuenta(5000);
		Persona p3 = new Persona(102,"Ligui", "Cardenas",'B');
		System.out.println(p3);
		c1.depositar(800);
		System.out.println(c3);
	}
}

/* PANTALLA:
---------------------------------------
Cliente : 100
Tipo:   C
Nombres :  Joaquin Ponze
No. Cuenta : 1000    Saldo:50.0
Despues del deposito :
No. Cuenta : 1000    Saldo:150.0

------------------------------------

Cliente : 101
Tipo:   E
Nombres :   Guerhalt Torres
No. Cuenta : 8000       Saldo:50.0
Despues del deposito :
No. Cuenta : 8000       Saldo:550.0
Despues del retiro :
No. Cuenta : 8000       Saldo:450.0

---------------------------------------
Cliente :       102
Tipo:   B
Nombres :        Ligui Cardenas
No. Cuenta : 5000       Saldo:50.0
Despues del deposito :
No. Cuenta : 5000       Saldo:50.0

*/