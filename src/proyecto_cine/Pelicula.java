package proyecto_cine;

import proyecto_cine.Genero;

public class Pelicula {
	
	private static int ID=1;
	private int IdPelicula;
	private String nombre;
	private Genero genero;
	

	/**
	* @param ID
	* @param IdPelicula
	* @param nombre
	* @param genero
	*/
	
	public Pelicula(String nombre, Genero genero) {
		this.IdPelicula=ID;
		this.nombre=nombre;
		this.genero= genero;
		ID++;
	}
//	//PUEDE FALLAR
//	public Pelicula(String nombre, String nombreGenero) {
//		super();
//		this.genero = new Genero(nombreGenero);
//	}
	public void setIdPelicula(int id) {
		this.IdPelicula=id;
		ID=this.getIdPelicula()+1;
	}
	public String toString() {
		return("#"+this.getIdPelicula()+"  "+this.getNombre()+this.genero.getNombre()	+")");
	}
	
	public boolean equals(Pelicula pelicula) {
		return(this.toString()==pelicula.toString());
	}
	
	public int getIdPelicula() {
		return this.IdPelicula;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Genero getGenero() {
		return (this.genero);
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	

}
