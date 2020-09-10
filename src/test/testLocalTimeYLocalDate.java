package test;

import java.time.LocalDate;

public class testLocalTimeYLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=2004;
		
		//Se crea una fecha 
		LocalDate fecha1 = LocalDate.of(100, 13, 19);
		
		LocalDate fecha2 = LocalDate.now();
		
		System.out.println("el año "+aux+" es bisiesto? "+esBisiesto(aux));
		
		System.out.println("Hoy es el dia "+fecha1.getDayOfMonth());
		
		
		

	}
//-----------------------------------------------
	
	
	static boolean esBisiesto(int anio) {
		if(!(anio%4==0 && anio%100==0 && anio%400==0)) {
			return false;
		}
		return true;
	}
	
	

}
