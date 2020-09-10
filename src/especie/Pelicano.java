package especie;

import tipo.Ave;

public class Pelicano extends Ave{
	
	private String nombre;
	
	public Pelicano(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

}
