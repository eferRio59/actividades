package herencia_persona;

import java.time.LocalDate;

import interfaces.IPorPresentismo;

public class Operario extends Empleado implements IPorPresentismo{
	
	private float valorHora;
	
	public Operario(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float valorHora) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.valorHora=valorHora;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public int diasAusentes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
