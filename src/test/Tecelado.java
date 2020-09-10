package test;

import java.time.LocalDate;

import modelo.BiArray;
import modelo.Num;
import modelo.Uarray;

public class Tecelado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uarray array = new Uarray(new int[] {5,1,7,6,8,4,2,9,3});
//		
//		double[][] matriz=new double[][] {{2,3,5,1},{7,2,4,3},{(-1),5,0,8}};
//		BiArray vecArray=new BiArray(matriz);
//		
//		
//		double[][] vectord= new double[][] {{1,1},{7,2},{0,(-5)},{4,0}};
//		//BiArray vecArr=new BiArray(vecArray.multiplicar(vectord));
//		Num numero= new Num(6);
		
//		System.out.println(numero.combinacionesEn(3));
		//System.out.println(numero.factorial());

//		Uarray arab = new Uarray(array.ascOrden());    //esto muestra que el metodo de ordenamiento ascendente si funciona
//		System.out.println(arab);
		 
		LocalDate fecha=LocalDate.now();
		
		System.out.println(fecha.getMonthValue());
	}

}
