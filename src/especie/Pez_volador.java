package especie;

import caracteristicas.Ivolar;
import tipo.Pez;

public class Pez_volador extends Pez implements Ivolar{
	
	private String nombre;
	
	public Pez_volador(String nombre) {
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
		return "estoy volando";
	}
	
}
