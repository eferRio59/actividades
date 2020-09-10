package herencia_persona;

import java.time.LocalDate;

public class Cliente extends Persona{
	private String cuit;
	private boolean estadoCredito;
	
	public Cliente(String persona, String apellido, long dni, LocalDate fechaNacimiento, String cuit, boolean limiteCredito) {
		super(persona, apellido, dni, fechaNacimiento);
		this.cuit=cuit;
		this.estadoCredito=limiteCredito;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public boolean getEstadoCredito() {
		return estadoCredito;
	}

	public void setEstadoCredito(boolean limiteCredito) {
		this.estadoCredito = limiteCredito;
	}
	
	public boolean equals(Cliente cliente) {
		return(this.cuit==cliente.getCuit());
	}
	
	public String hablar(String oracion) {
		return oracion;
	}
	
	//------------------Metodo de C L I E N T E
	
	
	
}
