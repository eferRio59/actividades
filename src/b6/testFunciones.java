package b6;
import b6.Funciones;
import c6.Exxcepcion;
public class testFunciones {

	public static void main(String[] args) throws Exxcepcion {
		// TODO Auto-generated method stub
		double aux=14579.27255;
		
		char n='3';
		char c='S';
		String numeros="2932j1441";
		String letras="qwer9ty";
		
//		System.out.println(String.valueOf(aux));
//		System.out.println((int)aux);
//		
//		System.out.println("-------------------");
//		
//		System.out.println(Funciones.aproximar2Decimal(aux));
//		System.out.println("-------------------");
//
//		System.out.println(n+" ¿es letra? "+Funciones.esLetra(n));
//		System.out.println(c+" ¿Es letra? "+Funciones.esLetra(c));
//		System.out.println("-------------------");
//		System.out.println(c+" ¿Es numero? "+Funciones.esNumero(c));		
//		System.out.println(n+" ¿Es numero? "+Funciones.esNumero(n));		
//
//		System.out.println("------------------------");
//		
//		System.out.println("True-->"+Funciones.esCadenaLetras(letras));
//		System.out.println("False-->"+Funciones.esCadenaLetras(numeros));
//
//
//		System.out.println("True-->"+Funciones.esCadenaNumeros(numeros));
//		System.out.println("False-->"+Funciones.esCadenaNumeros(letras));
//		
//		System.out.println(validarSexo('f')&&validarSexo('F'));
//		System.out.println(validarSexo('M')&&validarSexo('m'));
//		
//		System.out.println("perro"=="perrro");
		
	}
	
	public static boolean validarSexo(char c) {
		String patron=("^[mMfF]");
		
		return(String.valueOf(c).matches(patron));
	}



}
