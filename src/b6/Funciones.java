package b6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Pattern;

public class Funciones {

	public static boolean esBisiesto(LocalDate fecha) {
		boolean ret=false;

		if(fecha.getYear()%4==0 && (fecha.getYear()%100!=0 || fecha.getYear()%400==0))
			ret=true;

		return ret;
	}

	public static boolean esFechaValida(LocalDate fecha) {
		boolean ret=false;

		if(LocalDate.now().isEqual(fecha) || LocalDate.now().isAfter(fecha))
			if(fecha.getMonthValue()<=12 && fecha.getMonthValue()>0)
				if(fecha.getDayOfMonth()>=diasDelMes(fecha) && fecha.getDayOfMonth()>0)
					ret=true;

		return ret;
	}

	public static String traerfechaCorta(LocalDate fecha) {
		return(fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear());
	}

	public static String traerHoraCorta(LocalTime hora) {
		return(hora.getHour()+":"+hora.getMinute());
	}

	public static boolean esDiahabil(LocalDate fecha) {
		boolean ret=false;

		if(fecha.getDayOfWeek().getValue()>=1 && fecha.getDayOfWeek().getValue()<=5)
			ret=true;

		return ret;
	}

	public static String traerDiaDeLaSemana(LocalDate fecha) {
		String ret="fecha invalida";
		int aux=fecha.getDayOfWeek().getValue();

		switch(aux) {
		case 1:
			ret="LUNES";
			break;
		case 2:
			ret="MARTES";
			break;
		case 3:
			ret="MIERCOLES";
			break;
		case 4:
			ret="JUEVES";
			break;
		case 5:
			ret="VIERNES";
			break;
		case 6:
			ret="SABADO";
			break;
		case 7:
			ret="DOMINGO";
			break;
		}

		return ret;
	}

	public static String traerMesEnLetras(LocalDate fecha) {
		String ret;
		int aux=fecha.getDayOfWeek().getValue();

		switch(aux) {
		case 1:
			ret="ENERO";
			break;
		case 2:
			ret="FEBRERO";
			break;
		case 3:
			ret="MARZO";
			break;
		case 4:
			ret="ABRIL";
			break;
		case 5:
			ret="MAYO";
			break;
		case 6:
			ret="JUNIO";
			break;
		case 7:
			ret="JULIO";
			break;
		case 8:
			ret="AGOSTO";
			break;
		case 9:
			ret="SEPTIEMBRE";
			break;
		case 10:
			ret="OCTUBRE";
			break;
		case 11:
			ret="NOBIEMRE";
			break;
		case 12:
			ret="DICIEMBRE";
			break;
		default:
			ret="fecha invalida";
			break;
		}
		return ret;
	}

	public static String traerFechaLarga(LocalDate fecha) {
		return (traerDiaDeLaSemana(fecha)+" "+fecha.getDayOfMonth()+" de "+traerMesEnLetras(fecha)+" del "+fecha.getDayOfYear());
	}

	private static int diasDelMes(LocalDate fecha) {
		int anio=fecha.getYear();
		int mes =fecha.getMonthValue();
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
	
	public static double aproximar2Decimal(double valor) {
		String aux=String.valueOf(valor);
		String patron= ("(\\d*.\\d[5-9]\\d*)");
		int auxN; 
		double ret=valor;
		
		if(aux.matches(patron)) {
			ret+=(0.01);
			ret*=100;
			auxN=(int)ret;
			ret=(double)auxN/100;
		}
		return (ret);
	}

	public static boolean esNumero(char letra) {
		String patron=("[0-9]");
		String c=String.valueOf(letra);
		
		return (c.matches(patron));
	}
	
	public static boolean esLetra(char letra) {
		String patron=("[A-Za-z]");
		String c=String.valueOf(letra);
		
		return (c.matches(patron));
	}
	
	public static boolean esCadenaNumeros(String cadena) {
		String patron=("^([0-9]+)");
		
		return(cadena.matches(patron));
	}
	
	public static boolean esCadenaLetras(String cadena) {
		String patron=("^([A-Za-z]+)");
		
		return(cadena.matches(patron));
	}
	
	public static int numeroDeLetra(char c) {
		int ret=0;
		switch (c) {
		case '1':
			ret=1;
			break;
		case '2':
			ret=2;
			break;
		case '3':
			ret=3;
			break;
		case '4':
			ret=4;
			break;
		case '5':
			ret=5;
			break;
		case '6':
			ret=6;
			break;
		case '7':
			ret=7;
			break;
		case '8':
			ret=8;
			break;
		case '9':
			ret=9;
			break;
		case '0':
			ret=0;
			break;	
		}
		
		return ret;
	}

	
}
