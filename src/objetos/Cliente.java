package objetos;

public class Cliente {

//ATRIBUTOS
	private int cliente_cod;
	private String apellido;
	private String nombre;
	private String telefono;
//-----------------------------------------------------
//CONSTRUCTOR
	public Cliente(int cliente_cod, String apellido, String nombre, String telefono) {
		this.cliente_cod = cliente_cod;
		this.nombre      = nombre;
		this.apellido    = apellido;
		this.telefono    = telefono;
	};
//------------------------------------------------------
//GETS y SETTER------------------------------------------
	public int getCliente_cod() {
		return cliente_cod;
	}
	public void setCliente_cod(int Cliente_COD) {
		this.cliente_cod = Cliente_COD;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void set(String Apellido) {
		this.apellido = Apellido ;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String Nombre) {
		this.nombre = Nombre ;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String Telefono) {
		this.telefono = Telefono ;
	}
//----------------------------------------------------
	
	
}
