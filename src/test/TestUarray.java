package test;

import junit.framework.TestCase;
import modelo.Uarray;

public class TestUarray extends TestCase{
	
	private Uarray uarray;
	private int[] vector;
	
	
	//ESCENARIOS POSIBLES
	public void escenario1() {
		uarray=new Uarray(new int[]{1,2,3,4,5,11,6,7,8,9,10});
	}
	
	public void escenario2() {
		uarray=new Uarray(new int[]{5,1,7,6,8,4,2,9,3});
//		vector=new int[]{1,2,3,4,5,6};
	}
	
	public void escenario3() {
		uarray=new Uarray(new int[]{1,2,3,5,5,8,8,8,6});
	}
	
	public void escenario4() {
		uarray=new Uarray(new int[]{2,2,2,2,2});
	}
	 
	
	//TEST DE METODOS
	public void testpromedio() {
		escenario4();
		assertTrue(uarray.promedio()==2);
	}
	
	
	//si funciona... pero no aca ¿como se comparan vectores??
	public void testascOrden() {
		escenario2();
		assertTrue(Uarray.comparar(uarray.ascOrden(), (new int[] {1,2,3,4,5,6,7,8,9})));
	}
	
	public void testdescOrden() {
		escenario1();
		Uarray vector=new Uarray(uarray.descOrden());
		assertTrue(vector.equals(new int[] {11,10,9,8,7,6,5,4,3,2,1}));
	}
	
	public void testfrecuencia() {
		escenario4();
		assertTrue(uarray.frecuencia(3)==0);
	}
	
	public void testmoda() {
		escenario3();
		assertTrue(uarray.moda()==8);
	}
	

}
