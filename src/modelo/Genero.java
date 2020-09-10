package modelo;

public class Genero {

	static long ID=1;
	private long id;
	private String nombre;
	
	public Genero(String nombre) {
		this.nombre=nombre;
		this.id=ID;
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return(this.id);
	}
	
	public String toString() {
		return("("+this.nombre+")");
	}
	
	public boolean equals(Genero genero) {
		return((this.getId()==genero.getId())&&(this.getNombre()==genero.getNombre()));
	}
	
	
}
