package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import adaptadores.ItemsAdapter;
import errores.MiExcepcion;

public class Carrito {

	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private ItemsAdapter listaItems;
	private Cliente cliente;
	private int itemsTotales;
	
	public Carrito(int id, LocalDate fecha, LocalTime hora, Cliente cliente) {
		this.id=id;
		this.fecha=fecha;
		this.hora=hora;
		listaItems=new ItemsAdapter();
		this.cliente=cliente;
		this.setItemsTotales();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public ItemsAdapter getListaItems() {
		return listaItems;
	}

	public void setListaItems(ItemsAdapter lista) {
		this.listaItems = lista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getItemsTotales() {
		return itemsTotales;
	}
	
	public void setItemsTotales() {
		itemsTotales=this.getListaItems().getItems().size();
	}
	public String toString() {
		String ret="";
		
		ret+=("Fecha: "+this.getFecha()+"   hora: "+this.getHora()+"\n");
		ret+=(this.getCliente().getNombre()+"  "+this.getCliente().getDni()+"\n");
		for(int i=0;i<this.getListaItems().getItems().size();i++) {
			ret+=(this.getListaItems().getItems().get(i)+"--->"+this.getListaItems().getItems().get(i).subTotal()+"\n");
		}
		ret+=("        subTotal= $"+this.getListaItems().Total());
		
		return ret;
	}

//	--------------------------------------------------------
	///METODOS PARA MANEJAR LOS ITEMS DEL CARRITO///////

//	private int IndiceProductoDLista(Producto p) {
//		int ret = (-10);
//		
//		for(int i=0;i<this.getLista().size();i++) {
//			if(this.getLista().get(i).getProducto().equals(p))
//				ret=i;
//		}
//		
//		if (ret==(-10))
//				ret=null;
//		
//		return ret;
//	}
	
}
