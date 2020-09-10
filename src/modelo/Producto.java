package modelo;

import errores.MiExcepcion;

public class Producto {

	private int id;
	private String nombre;
	private float precio;
	
	public Producto(int id, String nombre, float precio) throws MiExcepcion {
		this.id=id;
		this.nombre=nombre;
		this.setPrecio(precio);
	}
	
	public Producto(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
		this.precio=0 ;
	}
	 
	public String getNombre() {
		return(this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getId(){
		return(this.id);
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public float getPrecio() {
		return(this.precio);
	}
	
	//el precio no puede ser menor 0
	public void setPrecio(float precio) throws MiExcepcion {
		if(precio<0)
			throw new MiExcepcion(1);
		else
			this.precio=precio;
	}
	
	public String toString() {
		return("#"+this.getId()+" "+this.getNombre()+" $"+this.precio);
	}
	
	public boolean equals(Producto producto) {
		return((this.getId()==producto.getId())&&(this.getNombre()==producto.getNombre())&&(this.getPrecio()==producto.getPrecio()));
	}
	
	
}
