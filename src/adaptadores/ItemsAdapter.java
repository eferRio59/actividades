package adaptadores;

import java.util.ArrayList;
import java.util.List;

import errores.MiExcepcion;
import modelo.ItemCarrito;
import modelo.Producto;

public class ItemsAdapter {

	private List<ItemCarrito> items;
	private int id;
	
	
	public ItemsAdapter() {
		this.items=new ArrayList<ItemCarrito>();
		this.id=0;
	}
	
	//METODOS////////////
	public List<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(List<ItemCarrito> items) {
		this.items = items;
	}


	//4
	public boolean addItem( Producto p, int cantidad) {
		boolean ret=(buscarProducto(p));

		if(!ret) {
			this.id+=1;
			this.getItems().add(new ItemCarrito(this.id, p, cantidad));

		}
		else
			this.agregarCantidadItem(p, cantidad);

		return ret;
	}

	//5
	public boolean dltItem(Producto producto, int cantidad) throws MiExcepcion {
		boolean ret=(this.buscarProducto(producto));
		
		if(ret) {
			this.restarOborrarItem(producto, cantidad);
		} else
			throw new MiExcepcion(2);
		
		return ret;
	}
	
	//7
	public float Total() {
		float totall=0;
		
		for(int i=0;i<items.size();i++) {
			totall=(totall+items.get(i).subTotal());
		}
		
		return totall;
	}
	
	 
	public boolean buscarProducto(Producto producto) {
		boolean ret=false;
		
		for(int i=0;i<items.size();i++) {
			if(producto.equals(this.items.get(i).getProducto()));
				ret=true;
		}
		
		return ret;
	}
	
	public ItemCarrito getItemCarrito(int id) {
		ItemCarrito ic=null;
		
		for(int i=0;i<this.getItems().size();i++) {
			if(id==this.getItems().get(i).getId())
				ic=this.getItems().get(i);
		}
		
		return ic;
	}
	

	private boolean agregarCantidadItem(Producto producto, int cantidad) {
		boolean ret=false;
		
		for(int i=0;i<this.getItems().size();i++) {
			if(producto.getNombre().equals(this.getItems().get(i).getProducto().getNombre()))
				this.getItems().get(i).addCantidad(cantidad);
				ret=true;
		}
		
		return ret;
	}
	
	public boolean restarOborrarItem(Producto producto, int cantidad) {
		boolean ret=false;
		int menos;
		for(int i=0;i<this.getItems().size();i++) {
			if(producto.getNombre().equals(this.getItems().get(i).getProducto().getNombre())) {
				if(cantidad>=this.getItems().get(i).getCantidad())
					this.getItems().remove(i);
				else {
					menos=(cantidad*(-1));
					this.getItems().get(i).addCantidad(menos);
				}
				ret=true;
			}
		}
		
		return ret;
	}
	
	
	
}
