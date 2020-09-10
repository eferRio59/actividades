package test;

import modelo.Fraccion;

public class testRaizCuadradaFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Fraccion f4 = new Fraccion (- 3 , 5 );
			System . out . println ( "-->Escenario 1:	Raiz cuadrada de " + f4 );
			System . out . println ( "La raiz cuadrada de" +
			f4 + "=" + f4 . raizCuadrada ());
			}
			catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage () );
			}
			try {
			Fraccion f4 = new Fraccion ( 9 , 25 );
			System . out . println ( "\n-->Escenario 2: Raiz cuadrada	de" + f4 );
			System . out . println ( "La raiz cuadrada de" +
			f4 + "=" + f4 . raizCuadrada ());
			}
			catch ( Exception e ){
			System . out . println ( "Excepcion: " + e . getMessage () );
			}
		
	}

}
