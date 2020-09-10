package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date  = LocalDate.of(1995, Month.FEBRUARY, 3);

		LocalDate date1 = date.plusYears(24);	
		
		LocalDate date2 = LocalDate.now();
		
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+":"+time.getMinute());
		
		System.out.println(traerFechaLarga(date));

		char c='k' ;
		
//		System.out.println(esNumero(c));
//		System.out.println(esLetra(c));                      <------REVISAR
	}

	//Metodos
	
	public static boolean esBisiesto(int anio) {
		
		if( !(anio%4==0) || ( anio%100==0 && !(anio%400==0) ) )
			return false;
		else
			return true;
		}
	public static boolean esBisiesto(double anio) {
		LocalDate aux = LocalDate.of((int) anio, 1, 1);
			return aux.isLeapYear();
	}
	public static boolean esFechaValida(LocalDate fecha) {
		
		if( 	  (fecha.getMonthValue()==1 
				|| fecha.getMonthValue()==3 
				|| fecha.getMonthValue()==5
				|| fecha.getMonthValue()==7 
				|| fecha.getMonthValue()==8 
				|| fecha.getMonthValue()==10 
				|| fecha.getMonthValue()==12)
				&& fecha.getDayOfMonth()>=1 && fecha.getDayOfMonth()<=31){
			return true;
		}
		if( 	  (fecha.getMonthValue()==4 
				|| fecha.getMonthValue()==6 
				|| fecha.getMonthValue()==9 
				|| fecha.getMonthValue()==11)
				&& fecha.getDayOfMonth()>=1 && fecha.getDayOfMonth()<=30) {
			return true;
		}
		if(		   fecha.isLeapYear() && fecha.getMonthValue()==2 
				&& fecha.getDayOfMonth()>=1 && fecha.getDayOfMonth()<=29) {
			return true;
		}
		else 
			return false;
	}
	
	
	public static String traerfechaCorta(LocalDate fecha) {
		return (fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear());
	}
	 
	public static String traerHoraCorta(LocalTime time) {
		return (time.getHour()+":"+time.getMinute());
	}
	
	public static boolean esDiaHabil(LocalDate date) {
		String sabado= " SATURDAY ";
		String domingo= " SUNDAY ";
		if(toStringDIA(date).equals(sabado) || toStringDIA(date).equals(domingo))
			return false;
		else
			return true;
	}
	
	public static String toStringDIA(LocalDate date) {
		return (" "+date.getDayOfWeek()+" ");
	}
//	public static String toStringMES(LocalDate date) {
//		return (" "+date.get)
//	}
	
	public static String traerDiaSemana(LocalDate date) {
		String auxiliar = null;
		switch(toStringDIA(date)) {
		
		case (" SATURDAY "):
			auxiliar="SABADO";
			break;
		case (" SUNDAY "):
			auxiliar="DOMINGO";
			break;
		case (" MONDAY "):
			auxiliar="LUNES";
			break;
		case (" TUESDAY "):
			auxiliar="MARTES";
			break;
		case (" WEDNESDAY "):
			auxiliar="MIERCOLES";
			break;
		case (" THURSDAY "):
			auxiliar="JUEVES";
			break;
		case (" FRIDAY "):
			auxiliar="VIERNES";
			break;
		}
		return auxiliar;
	}
	
	public static String traerMesEnLetras(LocalDate date) {
		String auxiliar= null;
		
		switch(date.getMonthValue()) {
		case 1:
			auxiliar="ENERO";
			break;
		case 2:
			auxiliar="FEBRERO";
			break;
		case 3:
			auxiliar="MARZO";
			break;
		case 4:
			auxiliar="ABRIL";
			break;
		case 5:
			auxiliar="MAYO";
			break;
		case 6:
			auxiliar="JUNIO";
			break;
		case 7:
			auxiliar="JULIO";
			break;
		case 8:
			auxiliar="AGOSTO";
			break;
		case 9:
			auxiliar="SEPTIEMBRE";
			break;
		case 10:
			auxiliar="OCTUBRE";
			break;
		case 11:
			auxiliar="NOVIEMBRE";
			break;
		case 12:
			auxiliar="DICIEMBRE";
			break;
		}
		
		return auxiliar;
	}
	
	public static String traerFechaLarga(LocalDate date) {
		return (traerDiaSemana(date)+" "+date.getDayOfMonth()+" de "+traerMesEnLetras(date)+" del "+date.getYear());
	}
	
	public static int traerCantidadDiasMes(int anio, int mes) {
		switch(mes) {
		case 1: 
			return 31;
		case 2:
			if(!(anio%4==0) || (anio%100==0 && !(anio%400==0))) {
				return 28;
			}
			else
				return 29;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return (Integer) null;
		}
	}
	
	
	//REVISAR--------------------------------*****-*-*-*---*-*-*-
//	public static boolean esNumero(char c) {
//		if((int)c>=0 || (int)c<0) {
//			return true;
//		}else
//			return false;
//	}
//	
//	public static boolean esLetra(char c) {
//		if(!((int)c>=0 && (int)c<0)) {
//			return false;
//		}else
//			return true;
//	}
//	
//	if(esBisiesto(fecha.getYear()))
	
}
