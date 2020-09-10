package herencia_persona;

import java.time.LocalDate;

public abstract class Empleado extends Persona{
	
	 protected long legajo;
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo=legajo;
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public String hablar(String oracion) {
		return oracion;
	}
	
	//------------------Metodo de  E M P L E D A D O
	public abstract float calcularSueldo();
	
//	public float calcularSueldo(int diasAusentes) {
//		int diasTrabajados= (diasDelMesCorriente() - diasAusentes);
//		
//		//float pagaDiaria= this.sueldoMensual - diasDelMesCorriente();
//		
//		return (pagaDiaria*diasTrabajados);
//	}
//	
	
	private static int diasDelMesCorriente() {
		int anio=LocalDate.now().getYear();
		int mes =LocalDate.now().getMonthValue();
		int ret;
		switch(mes) {
		case 1:
			ret=31;
			break;
		case 2:
			if(anio%4==0 && (anio%100 != 0 || anio%400==0))
				ret=29;
			else
				ret=28;
			break;
		case 3:
			ret=31;
			break;
		case 4:
			ret=30;
			break;
		case 5:
			ret=31;
			break;
		case 6:
			ret=30;
			break;
		case 7:
			ret=31;
			break;
		case 8:
			ret=31;
			break;
		case 9:
			ret=30;
			break;
		case 10:
			ret=31;
			break;
		case 11:
			ret=30;
			break;
		case 12:
			ret=31;
			break;
		default:
			ret=(Integer) null;
		}
		return ret;
	}
	

}
