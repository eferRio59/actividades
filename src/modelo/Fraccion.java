package modelo;

public class Fraccion {
//	
//	private int numerador;
//	private int denominador;
//	
//	public Fraccion(int numerador, int denominador) throws Exception {
//		this.numerador= numerador;
//		this.denominador= denominador;
//	}
//
//	/**
//	 * @return the numerador
//	 */
//	public int getNumerador() {
//		return numerador;
//	}
//
//	/**
//	 * @param numerador the numerador to set
//	 */
//	public void setNumerador(int numerador) {
//		this.numerador = numerador;
//	}
//
//	/**
//	 * @return the denominador
//	 */
//	public int getDenominador() {
//		return denominador;
//	}
//
//	/**
//	 * @param denominador the denominador to set
//	 */
//	//INCORRECTO
////	public void setDenominador(int denominador) {
////		this.denominador = denominador;
////	}
////	
//	//CORRECTO
//	public void setDenominador (int denominador) throws Exception {
//		if (denominador == 0) {
//			throw new Exception("Error: Objeto fraccion invalido, el denominador NO puede ser cero");
//		}
//		this.denominador=denominador;
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		return " ( " + numerador + " / " + denominador + " ) ";
//	}
//	
//	public double convertirAReal() {
//		return (convertirADouble(numerador)/convertirADouble(denominador));
//	}
//	
//	public Fraccion dividir(Fraccion fraccion) throws Exception {
//		if(fraccion.convertirAReal() == 0) {
//			throw new Exception("Error: Division por 0");
//		}
//		
//		return new Fraccion(numerador*fraccion.getDenominador(), denominador*fraccion.getNumerador());
//	}
//	
//	
//	public double raizCuadrada() throws Exception{
//		
//		if(numerador*denominador<0) throw new Exception("Error: el radicando es negativo. ");
//		
//		return Math.pow(this.convertirAReal(), 0.5);
//	}
//	
//	
//	
//	
//	public static double convertirADouble(int n) { 
//		return ((double) n); //<------NO ENTIENDO
//	}
	//-------------------------------------------------
	
	private int numerador , denominador;
	
	public Fraccion ( int numerador , int denominador ) throws MisExcepciones {
	this . numerador = numerador; //en el constructor sólo se asigna por el this.atributo
	this . setDenominador ( denominador ); //o por this.setAtributo, NO sedebe implementar funcionalidad en el constructor
	}
	
	
	public int getNumerador () {
	return numerador;
	}
	
	
	public void setNumerador ( int numerador ) {
	this . numerador = numerador;
	}
	
	
	public int getDenominador () {
	return denominador;
	}
	
	
	public void setDenominador ( int denominador ) throws MisExcepciones {
	if ( denominador == 0 ) throw new MisExcepciones(222);
	this . denominador = denominador;
	}
	
	
	public String toString (){
	return "(" + numerador + "/" + denominador + ")" ;
	}
	
	
	public Fraccion dividir ( Fraccion f ) throws Exception{
	if ( f . convertirAReal ()== 0 ) throw new MisExcepciones(111);
	return new Fraccion ( numerador * f . getDenominador (),denominador * f . getNumerador ());
	}
	
	
	public double convertirAReal () {
	return (convertirADouble ( numerador ) / convertirADouble ( denominador ));
	}
	
	
	public double raizCuadrada () throws Exception{
	if ( numerador * denominador < 0 ) throw new MisExcepciones(333);
	return Math . pow ( this . convertirAReal (), 0.5 );
	}
	
	public static double convertirADouble(int ene) {
		return((double)ene);
		
	}
}
