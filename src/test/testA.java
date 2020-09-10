package test;

//import frame.Barra_Menu;
import frame.Ventana_principal;

public class testA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario = null;
		String contraseña = null;
		
		//Ventana_principal ventana_2 = new Ventana_principal(contraseña, usuario, ventana_2);
		Ventana_principal ventana = new Ventana_principal( contraseña , usuario);
		//Barra_Menu barra = new Barra_Menu();
		
		//barra.setVisible(true);
		//ventana.add(barra);
		ventana.setVisible(true);
//desde esquina superior izquierda
		//                X Y  ANCHO ALTO
		ventana.setSize(1000, 1000);
		ventana.setResizable(true);
		
	}

}
