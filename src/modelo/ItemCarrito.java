package modelo;

public class ItemCarrito {
	
	private int id;
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(int id, Producto producto, int cantidad) {
		this.id=id;
		this.producto=producto;
		this.setCantidad(cantidad);
	}
	
	public int getId() {
		return(this.id);
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public Producto getProducto() {
		return(this.producto);
	}
	public void setProducto(Producto p) {
		this.producto=p;
	}
	
	public int getCantidad() {
		return(this.cantidad);
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	public void addCantidad(int cantidad) {
		this.cantidad+=cantidad;
	}
	
	//6
	public float subTotal() {
		return((this.getCantidad())*(this.getProducto().getPrecio()));
	}
	
	public String toString() {
		return("#"+this.getId()+" "+this.producto.getNombre()+" $"+this.producto.getPrecio()+" * "+this.getCantidad());
	}
	
	public boolean equals(ItemCarrito item) {
		return((this.getId()==item.getId())&&(this.getProducto().equals(item.producto))&&(this.getCantidad()==item.getCantidad()));
	}
	
	
}
