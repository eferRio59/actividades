package objetos;

public class Producto {
	
//ATRIBUTOS
	private int producto_cod;
	private String nombre;
	private float coste_neto;
	private float precio_unit;
	private int stock;
	private String descripcion;
	
	
//---------------------------------------
//CONSTRUCTOR
	public Producto( int codigo, String nombre, float neto, float unitario, int stock, String descripcion) {
		this.producto_cod  = codigo;
		this.nombre        = nombre;
		this.coste_neto    = neto;
		this.precio_unit   = unitario;
		this.stock         = stock;
		this.descripcion   = descripcion;
	}
//-------------------------------------------
//-------------------------------------------
//GETS y SETTERS-----------------------------
	public int getProducto_cod() {
		return producto_cod;
	}
	public void setProducto_cod(int codigo) {
		this.producto_cod = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre= nombre;
	}
	
	public float getCoste_neto() {
		return coste_neto;
	}
	public void setCoste_neto(float neto) {
	this.coste_neto= neto;
	}
	
	public float getPrecio_unit() {
		return precio_unit;
	}
	public void setPrecio_unit(float unitario) {
	this.precio_unit= unitario;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock( int stock ) {
	this.stock = stock;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion( String descripcion) {
	this.descripcion = descripcion;
	}
//------------------------------------------------------
//------------------------------------------------------
//METODOS
	
}
