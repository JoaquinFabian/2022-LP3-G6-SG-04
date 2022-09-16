package Lab05.Ejercicio3;

import java.util.*;



public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private char Clientetipo;
	private Banco banco;

	
	public Persona(int id, String nombre,String apellido,char Clientetipo) {//Se crea el objeto

		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.Clientetipo=Clientetipo;
		if(Clientetipo=='C')
			this.banco = new Banco("bcp");
		if(Clientetipo=='B')
            this.banco = new Banco("bcp");
		if(Clientetipo=='E')
            this.banco = new Banco("bcp");
	}
	
	public Persona(int id, String nombre,String apellido) {
		this(id,nombre,apellido,'C');
	} 

	public Persona(int id){
		this(id, "", "", 'C');
	}

	public char getTipoCliente() {
		return Clientetipo;
	}

	public void setTipoCliente(char Clientetipo) {
		this.Clientetipo = Clientetipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente :	" + this.id + "\nTipo:	" + this.Clientetipo + "\nNombres :	 " + this.nombre+" " + this.apellido+"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return id == other.id;
	}



	


}
