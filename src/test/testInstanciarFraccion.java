package test;

import modelo.Fraccion;
import modelo.MisExcepciones;

import java.lang.Exception;

public class testInstanciarFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			int n = 2 , d = 0;
			System.out.println ( "-->Escenario 1: new Fraccion(" + n + "," + d + ")" );
			Fraccion f1 = new Fraccion ( n , d );
			System.out.println ( "Objeto Fraccion: " + f1 );
		}
		catch ( MisExcepciones e ){
			System.out.println ( "Excepcion: " + e.getMessage());
		}
		
		
		try {
		int n = 3 , d = 5;
		System.out.println ( "\n-->Escenario 2: new	Fraccion(" + n + "," + d + ")" );
		Fraccion f2 = new Fraccion ( n , d );
		System.out.println ( "Objeto Fraccion: " + f2 );
		}
		catch ( Exception e ){
		System.out.println ( "Excepcion: " + e.getMessage () );
		}
		
	}

}
