package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import proyecto_cine.*;


public class testPelicula {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);//teclado
		int auxm1=0;//in:Jmenu  out:PedirOpcionA ----- valores del 1 al 3(peliculas,generos,salir)
		int auxm2=0;
		boolean flagMain= true;	
		boolean flagSub1= true;
		boolean flagSub2= false;
		Incaa catalogo = new Incaa();

		try {
			while(flagMain) {
				while(flagSub1) {
					Jmenu(auxm1);
					auxm1=pedirOpcionA(teclado);
					if(auxm1==1 || auxm1==2) {
						flagSub1=false;
						flagSub2=true;
					}else if(auxm1==3) {              //si es igual a 3 sale de la ejecucion
						System.out.println("ADIOS!!");
						flagSub1=false;
						flagMain=false;
					}
				}
				while(flagSub2) {
					Jmenu(auxm1);
					auxm2=pedirOpcionB(teclado);
					boolean ppp=pensar(auxm1, auxm2, catalogo, teclado);
					if(!ppp) {
						flagSub2=false;
						auxm1=0;
						auxm2=0;
						flagSub1=true;
					}
				}
			}
		}
		catch(MisExcepciones e) {
			System.out.println(e.getMessage());
			teclado.next();
		}

	}
		
//		catalogo.getCatalogo();
//		
//	}
	
	
	static void Jmenu(int aux) {
		
		if(aux==0) {
			System.out.println("=|=|=|=|=|=|=|=___I.N.C.A.A___=|=|=|=|=|=|=|= \n                                             (3-SALIR) \n");
			System.out.println("         1- PELICULAS.\n\n\n\n"); 
			System.out.println("         2- GENEROS. \n\n\n\n");
		
		}else if(aux==1) {
			System.out.println("=|=|=|=|=|=|=|=___I.N.C.A.A___=|=|=|=|=|=|=|= \n                                             (5-SALIR) \n");
			System.out.println("         - PELICULAS:");
			System.out.println("                      1-Listar.");
			System.out.println("                      2-Agregar.");
			System.out.println("                      3-Eliminar.");
			System.out.println("                      4-Modificar.");
			System.out.println("          Generos");
		}else if(aux==2) {
			System.out.println("=|=|=|=|=|=|=|=___I.N.C.A.A___=|=|=|=|=|=|=|= \n                                             (5-SALIR) \n");
			System.out.println("         Peliculas \n\n\n\n_");
			System.out.println("         - GENEROS:");
			System.out.println("                      1-Listar");
			System.out.println("                      2-Agregar");
			System.out.println("                      3-Eliminar");
			System.out.println("                      4-Modificar");
		}
	}
		
	static int pedirOpcionA(Scanner teclado) throws MisExcepciones {
		int x= teclado.nextInt();
		if (!(x==1 || x==2 || x==3)){
			throw new MisExcepciones(111);
		}
		return x;
	}
	
	static int pedirOpcionB(Scanner teclado) throws MisExcepciones {
		int x= teclado.nextInt();
		if (!(x==1 || x==2 || x==3 || x==4 || x==5)){
			throw new MisExcepciones(111);
		}
		return x;
	}
	
	static int pedirInt(Scanner teclado) {
		int numero=teclado.nextInt();
		
		return numero;
	}
	static String pedirString(Scanner teclado) {
		String palabra=teclado.next();
		
		return palabra;
		
	}
	
	static String pedirStringN(Scanner teclado) {
		String palabra="";
		System.out.println("Nombre: ");
		palabra=teclado.next();	
		
		return palabra;
	}
	
	static Genero pedirGenero(Scanner teclado,Incaa catalogo) {
		
		Genero genero=null;
		int aux;
		System.out.println("Genero: ");
		catalogo.getCatalogoGeneros();
		System.out.println("elija uno...	#");
		aux=pedirInt(teclado);
		genero=catalogo.getGenero(aux);
		
		return genero;		
		}
	static int pedirIDgenero(Scanner teclado, Incaa catalogo) {
		int aux;
		System.out.println("Genero: ");
		catalogo.getCatalogoGeneros();
		System.out.println("elija uno...	#");
		aux=pedirInt(teclado);
		
		return aux;
	}
	static int pedirIDpelicula(Scanner teclado, Incaa catalogo) {
		int aux;
		System.out.println("Peliculas: ");
		catalogo.getCatalogoPeliculas();
		System.out.println("elija una...  #");
		aux=pedirInt(teclado);
		
		return aux;
	}

	static boolean pensar(int auxm1, int auxm2, Incaa catalogo, Scanner teclado) throws MisExcepciones, InterruptedException {

		boolean retorno=false;
		
		switch(auxm1) {

		case 1:
			switch(auxm2) {

			case 1:
				catalogo.getCatalogoPeliculas();
				try
				{ Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				try
				{ Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				retorno=true;
				break;
				
			case 2:
				String palabra4=pedirStringN(teclado);
				Genero genero=pedirGenero(teclado, catalogo);
				catalogo.addPelicula(palabra4,genero);
				retorno=true;
				break;

			case 3: 
				int n3=pedirIDpelicula(teclado, catalogo);
				catalogo.borrarPelicula(n3);
				catalogo.acomodarIdsPelis();
				retorno=true;
				break;

			case 4:
				int n2=pedirInt(teclado);
				String palabra3=pedirString(teclado);
				catalogo.setPelicula(n2, palabra3);
				retorno=true;
				break;

			case 5: 
				retorno=false;
				break;
			}
			break;

		case 2:
			switch(auxm2) {

			case 1:
				catalogo.getCatalogoGeneros();
				try
				{ Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				try
				{ Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				retorno=true;
				break;

			case 2:
				String palabra=pedirStringN(teclado);
				catalogo.addGenero(palabra);
				retorno=true;
				break;

			case 3: 
				int n2=pedirIDgenero(teclado, catalogo);
				
				catalogo.borrarGenero(n2);
				catalogo.acomodarIdsgenero();
				retorno=true;
				break;
			case 4:
				int n=pedirInt(teclado);
				String palabra2=pedirStringN(teclado);
				catalogo.setGenero(n, palabra2);
				retorno=true;
				break;
			case 5:
				retorno=false;
				break;
			}
		}
		return retorno;
	}

}
