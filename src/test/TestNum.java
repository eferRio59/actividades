package test;

import junit.framework.TestCase;
import modelo.Num;

public class TestNum extends TestCase{
	
	private Num numero;
	
	public void escenario() {
		numero= new Num(15);
	}
	public void escenarioB() {
		numero= new Num(6);
	}
	
	public void testsumar() {
		escenario();
		assertTrue(this.numero.sumar(4)==19);
	}
	
	public void testmultiplicar() {
		escenario();
		assertTrue(this.numero.multiplicar(2)==30);
	}
	
	public void testesPar() {
		escenario();
		assertTrue(!this.numero.esPar());
	}
	
	public void testesPrimo() {
		escenario();
		assertTrue(!(this.numero.esPrimo()));
	}
	
	public void testvalueStr() {
		escenario();
		assertTrue(this.numero.ValueStr().equals("15"));
	}
	
	public void testenDouble() {
		escenario();
		assertTrue(this.numero.enDouble()==15);
	}
	
	public void testpotencia() {
		escenarioB();
		assertTrue(this.numero.potencia(2)==36);
	}
	
	public void testbase2() {
		escenario();
		assertTrue(this.numero.base2().equals("1111"));
	}
	
	public void testfactorial() {
		escenarioB();
		assertTrue(this.numero.factorial()==720);
	}
	
	public void testconmbinacionesEn() {
		escenarioB();
		assertTrue(this.numero.combinacionesEn(3)==20);
	}
}
