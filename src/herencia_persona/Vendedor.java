package herencia_persona;

import java.time.LocalDate;

import interfaces.IPorComision;
import interfaces.IPorPresentismo;

public class Vendedor extends Empleado implements IPorComision{
	
	private AdmClientes lista;
	private float comisionPorcentual;
	
	public Vendedor(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float comisionPorcentual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.comisionPorcentual=comisionPorcentual;
	}

	public AdmClientes getLista() {
		return lista;
	}

	public void setLista(AdmClientes lista) {
		this.lista = lista;
	}

	public float getComisionPorcentual() {
		return comisionPorcentual;
	}

	public void setComisionPorcentual(float comisionPorcentual) {
		this.comisionPorcentual = comisionPorcentual;
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
	
	private int contarVentas() {
		int contador=0;

		for(Cliente c: this.lista.getBdCliente()) {
			if(c.getEstadoCredito()==false)
				contador+=1;
		}
		
		return contador;
	}
	
	

}
