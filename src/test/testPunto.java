package test;

import geometria.Circulo;
import geometria.Punto;

public class testPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto(10,10);
		Punto p2 = new Punto(0,10);
		
		Circulo c1 = new Circulo(p1, 10);
		Circulo c2 = new Circulo(p1, 20);
		Circulo c3 = new Circulo(p2, 5);
//		
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals2(p2));
		
//		System.out.println("La distancia entre el punto "+p1+" y el punto "+p2+" es: "+p1.distancia(p2));
		
		System.out.println(c1.equals(c2));
		
		c1.mover(3, 3);
		c1.setRadio(4);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//falta agregar los metodos calculoArea, Perimetro
		//y distancia
		
	}

}
