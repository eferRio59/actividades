package test;

import java.time.LocalDate;

import herencia_persona.Cliente;
import herencia_persona.Empleado;
import herencia_persona.Persona;

public class testPErsona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p= new Cliente("Edgar", "Rios", 39418831, LocalDate.of(1996, 2, 29), "41524", false);
	
		System.out.println(p.hablar("cuaaaaaal fue!"));
		
		Persona pc= new Cliente("Edgar", "Rios", 39418831, LocalDate.of(1995, 12, 3), "41524", true);
		
		System.out.println(pc.hablar("cuaaaaal fue!"));
		
		System.out.println(Bisiesto(1600));

	}
	public static boolean Bisiesto(int anio) {
		boolean flag=false;
		
//		if(anio%4==0 && (anio%100!=0 || anio%400==0))
		if(anio%4==0 && (anio%100!=0 || anio%400==0))

			flag=true;
		
		return flag;
	}

}
