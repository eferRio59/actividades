package herencia_persona;

import java.time.LocalDate;

import interfaces.IPorComision;

public class Cobrador extends Empleado implements IPorComision{
	
	private AdmClientes lista;
	private float comision;
	
	public Cobrador(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float comision) {
		super(nombre, apellido, dni,fechaNacimiento, legajo);
		this.comision=comision;
		this.lista=new AdmClientes();
	}

	public AdmClientes getLista() {
		return lista;
	}

	public void setLista(AdmClientes lista) {
		this.lista = lista;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}

	@Override
	public float calcularComision() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int contarCobranzas() {
		int contador=0;
		
		for(Cliente c : this.lista.getBdCliente()) {
			if(c.getEstadoCredito()==true)
				contador+=1;
		}
		return contador;
	}
	

}
