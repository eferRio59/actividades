package modelo;

import catalogo.Incaa;
import excepciones.Excepciones;

public class Boludeo {

	public static void main(String[] args) throws Excepciones {
		// TODO Auto-generated method stub
	Incaa catalogo=new Incaa();
	
	
	catalogo.addPeli("Titanic");
	catalogo.addPeli("Viernes 13");
	catalogo.addPeli("Robocop");
	
	System.out.println(catalogo.getPeli(1));
	
	System.out.println(catalogo.getPeli("s 13"));
	
	System.out.println(catalogo.dltPeli(1));
	
	
	}

}
