package modelo;

import java.util.Scanner;

public class MisExcepciones extends Exception{
	
	private int codigo;
	
	public MisExcepciones(int n) {
		super();
		this.codigo=n;
	}
	
	public String getMessage() {
		int n=this.codigo;
		String mensaje="";
		
		switch(n) {
		case 111:
			mensaje="Error. no puede dividir por 0";
			break;
		case 222:
			mensaje="Error. Denominador no puede ser 0";
			break;
		case 333:
			mensaje="Error. Radicando negativo";
		}
		
		return mensaje;
		

		
	}
	
	

}
