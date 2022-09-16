package Lab05.Ejercicio1;


public class Cuenta {
	private int numero;
	private double saldo;
	

	
	public Cuenta (int numero,double saldo) {
		this.numero=numero;
		this.saldo=saldo;
	}
	
	public Cuenta(int numero) {
		this(numero,50);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	

	public void retirar(int cantidad) {
		this.saldo -= cantidad;	
		System.out.println("Despues del retiro :");
	}
	
	public void depositar(int cantidad) {
		this.saldo  += cantidad;	
		System.out.println("Despues del deposito :");
	}

	@Override
	public String toString() {
		return "\nNo. Cuenta : " + this.numero + "\tSaldo:" + this.saldo ;
	}
	
	
}
