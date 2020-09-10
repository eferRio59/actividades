package proyecto_cine;

public class Genero {
	
	private static int ID=1;
	private int Idgenero;
	private String nombre;
	
	public Genero(String nombre) {
		this.Idgenero=ID;
		this.nombre=nombre;
		ID++;
	}
	
	public void setId(int id) {
		this.Idgenero=id;
		ID=this.getID()+1;
	}
	public int getID() {
		return (this.Idgenero);
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString() {
		return ("#"+this.getID()+"  "+this.getNombre());
	}
	
	
	
//	static void setNombre(int ID, String nombre) {
//		
//	}
//	
	
	

}
