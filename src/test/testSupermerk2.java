package test;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalTime;

import adaptadores.CarritoAdapter;
import adaptadores.ClienteAdapter;
import errores.MiExcepcion;
import modelo.Carrito;
import modelo.Cliente;
import modelo.Producto;
import modelo.Supermerk2;

public class testSupermerk2 {
	
	public static void main(String[] args) throws MiExcepcion {
		
		//creo el supermercado
		Supermerk2 chino= new Supermerk2();
		
		chino.listaClientes.addCliente("Aldana", 39418831, "Tita Merello 1200");
		chino.listaClientes.addCliente("Edgar", 30529942, "Carlos Voss 1234");
		chino.listaClientes.addCliente("Fernando", 30629942, "Carlos Voss 1234");
		chino.listaClientes.addCliente("Jhon", 12345678, "Carlos Voss 1234");

		
		//PRODUCTOS
		chino.getGondola().addProducto("fideo", 25);
		chino.getGondola().addProducto("Durazno", 40);
		chino.getGondola().addProducto("galletitas", 25);	
		chino.getGondola().addProducto("milanesa", 120);
		chino.getGondola().addProducto("Gaseosa", 30);
		
//		chino.getGondola().dltProducto(3);
		//creo productos aleatorios
//		Producto s= new Producto("Arveja",100);
//		Producto t=new Producto("Fideo", 20);
		
////		algunos clientes
//		Cliente c= new Cliente("Aldana", 39418831, "tita Merello 1120");
//		clientes.addCliente("Edgar", 39418831, "Puerto Madero");

		System.out.println(chino.getListaClientes().size() +" Clientes\n");
		System.out.println(chino.getGondola().getProducto(1));
		System.out.println(chino.getGondola().getProducto(2));
		System.out.println(chino.getGondola().getProducto(3));
		System.out.println(chino.getGondola().getProducto(4));
		System.out.println(chino.getGondola().getProducto(5));
		
//		chino.getListaClientes().dltCliente(1);

		chino.getRegistroCarritos().addCarrito(LocalDate.now(), LocalTime.now(), chino.getListaClientes().getCliente(1));
		chino.getRegistroCarritos().getCarrito(1).getListaItems().addItem(chino.getGondola().getProducto(2), 3);
		chino.getRegistroCarritos().getCarrito(1).getListaItems().addItem(chino.getGondola().getProducto(5), 5);

		System.out.println(chino.getRegistroCarritos().getCarrito(1));
		
//		System.out.println(chino.getListaClientes().getCliente(1));
//		System.out.println(chino.getListaClientes().getCliente(2));
//		System.out.println(chino.getListaClientes().buscarCliente(3));
//		System.out.println(chino.getListaClientes().getCliente(4));
//		
		
//		chino.gondola.addProducto("Manzana", 13);
//		chino.gondola.addProducto("Fideo", 25);
//	
//		System.out.println(chino.getGondola().getProducto(0));
	}

}
