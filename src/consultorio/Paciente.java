package consultorio;

public class Paciente {

	private String nombre;
	private String apellido;
	private float peso;
	private float estatura;
	
	public Paciente(String nombre, String apellido, float peso, float estatura) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.peso=peso;
		this.estatura=estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	public String getNombreCompleto() {
		String aux;
		aux=(nombre+" "+apellido);
		return aux;
	}
	
	public String toString() {
		return(this.getNombreCompleto()+"  Peso:"+this.peso+"Kg.  Altura:"+this.estatura+"mts.");
	}
	
	public boolean equals(Paciente paciente) {
		return(this.toString().equals(paciente.toString()));
	}
	
}
