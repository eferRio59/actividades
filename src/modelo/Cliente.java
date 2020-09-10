package modelo;

public class Cliente {

	private int id;
	private String nombre;
	private long dni;
	private String direccion;
	
	public Cliente(int id, String nombre, long dni, String direccion) {
		this.id=id;
		this.nombre=nombre;
		this.dni=dni;
		this.direccion=direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return("#"+this.getId()+" "+this.nombre+"  DNI:"+this.getDni());
	}
	
	public boolean equals(Cliente cliente) {
		return((this.getId()==cliente.getId())&&(this.getDni()==cliente.getDni())&&(this.getNombre())==cliente.getNombre());
	}
	
	
}
