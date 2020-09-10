package adaptadores;

import java.util.ArrayList;
import java.util.List;

import errores.MiExcepcion;
import modelo.Producto;

public class ProductoAdapter {

	private List<Producto> gondola;
	private static int IDprod=0;
	
	public ProductoAdapter() {
		this.gondola=new ArrayList<Producto>();
	}

	///////////////////METODOS PRODUCTOS/////////////////////

	//1
	public boolean addProducto(String nombre,float precio) throws MiExcepcion {
		boolean ret=this.buscarProducto(nombre);

		if(ret)
			throw new MiExcepcion(3);
		else {
			this.gondola.add(new Producto(IDprod+1, nombre, precio));
			IDprod++;
			ret=true;
		}

		return ret;
	}

	//2
	public Producto getProducto(int id) {
		Producto p=null;

		for(int i=0;i<gondola.size();i++) {
			if(this.gondola.get(i).getId()==id)
				p=this.gondola.get(i);
		}

		return p;
	}

	//
	public boolean updProducto(int id, String nombre, float precio) throws MiExcepcion {
		boolean ret=this.buscarProducto(id);

		if(ret) {
			this.gondola.get(id-1).setNombre(nombre);
			this.gondola.get(id-1).setPrecio(precio);
		}

		return ret;
	}

	//3
	public boolean dltProducto(int id) throws MiExcepcion {
		boolean ret=this.buscarProducto(id);

		if(ret)
			this.gondola.remove(id-1);
		else {
			throw new MiExcepcion(4);
		}
		return ret;
	}
	
//	public int size() {
//		return (IDprod-1);
//	}
	//METODOS AXILIARES-Producto
	private boolean buscarProducto(String nombre) {
		boolean ret=false;

		for(int i=0;i<this.gondola.size();i++) {
			if(nombre.toUpperCase()==this.gondola.get(i).getNombre().toUpperCase())
				ret=true;
		}
		return ret;
	}

	private boolean buscarProducto(int id) {
		boolean ret=false;

		for(int i=0;i<this.gondola.size();i++) {
			if(id==this.gondola.get(i).getId())
				ret=true;
		}

		return ret;
	}
}
