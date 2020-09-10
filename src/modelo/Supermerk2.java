package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import adaptadores.CarritoAdapter;
import adaptadores.ClienteAdapter;
import adaptadores.ProductoAdapter;
import errores.MiExcepcion;

public class Supermerk2 {
	
	public ProductoAdapter gondola;
	public ClienteAdapter listaClientes;
	public CarritoAdapter registroCarritos;
	
	public Supermerk2() {
		gondola=new ProductoAdapter();
		listaClientes= new ClienteAdapter();
		registroCarritos= new CarritoAdapter();
	} 
	
	
	public ProductoAdapter getGondola() {
		return this.gondola;
	}

	public ClienteAdapter getListaClientes() {
		return listaClientes;
	}

	public CarritoAdapter getRegistroCarritos() {
		return registroCarritos;
	}


	//	-----------------------------------------------------------
	//19
	public float calcularTotal(LocalDate desde, LocalDate hasta, Cliente cliente) throws MiExcepcion {
		float total=0;
		
		if(( this.listaClientes).buscarCliente(cliente.getId()))
			total=(this.registroCarritos.totalListilla(this.registroCarritos.filtroFechaCliente(desde, hasta, cliente)));
		else
			throw new MiExcepcion(6); 
		
		return total;
	}
	
	//20
	public float calcularTotal(LocalDate fecha, Cliente cliente) throws MiExcepcion{
		float total=0;
		
		if(this.listaClientes.buscarCliente(cliente.getId()))
			total=(this.registroCarritos.totalListilla(this.registroCarritos.filtroFechaCliente(fecha, fecha, cliente)));
		else
			throw new MiExcepcion(6);
		
		return total;
	}
	
	//21
	public float calcularTotal(int mes, int anio, Cliente cliente) throws MiExcepcion {

		if(mes>12||mes<=0)
			throw new MiExcepcion(8);

		float total=0;
		LocalDate desde= LocalDate.of(anio, mes-1, 1);
		LocalDate hasta= LocalDate.of(anio, mes, 1).minusDays(1);

		if(this.listaClientes.buscarCliente(cliente.getId()))
			total=(this.registroCarritos.totalListilla(this.registroCarritos.filtroFechaCliente(desde, hasta, cliente)));
		else
			throw new MiExcepcion(6);
		
		return total;
	}
	
	//22
	public float calcularTotal(int mes, int anio, int idCliente) throws MiExcepcion{
		float total=0;
		LocalDate desde= LocalDate.of(anio, mes-1, 1);
		LocalDate hasta= LocalDate.of(anio, mes, 1).minusDays(1);
		
		if(this.listaClientes.buscarCliente(idCliente))
			total=(this.registroCarritos.totalListilla(this.registroCarritos.filtroFechaCliente(desde, hasta, (this.listaClientes.getCliente(idCliente)))));
		else
			throw new MiExcepcion(6);
		
		return total;
	}
	
}
