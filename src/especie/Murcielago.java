package especie;

import caracteristicas.Ivolar;
import tipo.Mamifero;

public class Murcielago extends Mamifero implements Ivolar{
	
	private String nombre;
	
	public Murcielago(String nombre) {
//		super();
		this.nombre=nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "estoy volando";
	}
	
}
