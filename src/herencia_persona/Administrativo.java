package herencia_persona;

import java.time.LocalDate;

import interfaces.IPorPresentismo;

public class Administrativo extends Empleado implements IPorPresentismo{
	
	private float sueldoMensual;
	
	public Administrativo(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento, legajo);
		this.sueldoMensual=sueldoMensual;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
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
