package herencia_persona;

import java.time.LocalDate;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
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

	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean equals(Persona persona) {
		return(this.dni==persona.getDni());
	}
	
	public int calcularEdad() {
		LocalDate aux= LocalDate.now();
		int edad=aux.getYear()-this.fechaNacimiento.getYear();
		
		if((aux.getMonthValue()<this.fechaNacimiento.getMonthValue()) || ((aux.getMonthValue()==this.fechaNacimiento.getMonthValue()) && (aux.getDayOfMonth()<this.fechaNacimiento.getDayOfMonth())))
				edad=edad-1;
		
		return edad;
	}
	
	public abstract String hablar(String oracion);
	
//	1990-4
//	1995-1
	

}
