package modelo;

public class Pelicula {
	
	private static long ID=1;
	private long id;
	private String nombre;
	private Genero genero;
	
	public Pelicula (String nombre){
		this.id=ID;
		this.nombre=nombre;
		
		ID++;
	}
	public Pelicula (String nombre,Genero genero){
		this.id=ID;
		this.nombre=nombre;
		this.genero=genero;
		ID++;
	}
	
	public long getId() {
		return(this.id);
	}
	public void setId(long id) {
		this.id=id;
	}

	public String getNombre() {
		return(this.nombre);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Genero getGenero() {
		return(this.genero);
	}
	public void setGenero(Genero genero) {
		this.genero=genero;
	}
	
	public String toString() {
		return("#"+this.id+" "+this.nombre+"  "+this.genero.toString());
	}
	
	public boolean equals(Pelicula pelicula) {
		return((this.id==pelicula.getId())&&(this.nombre==pelicula.getNombre())&&(this.getGenero().equals(pelicula.getGenero())));
	}
	
	//METODOS A IMPLEMENTAR
}
