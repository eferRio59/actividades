package adaptadores;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import errores.MiExcepcion;
import modelo.Carrito;
import modelo.Cliente;

public class CarritoAdapter extends ArrayList<Carrito>{
	
	private List<Carrito> registroCarritos;
	private static int IDcarrito=1;
	
	public CarritoAdapter() {
		super();
		registroCarritos=new ArrayList<Carrito>();
	}
	
	
//	///////////METODOS DE CARRITOS//////////////////////////////
	public List<Carrito> getRegistroCarritos() {
		return registroCarritos;
	}

	public void setRegistroCarritos(List<Carrito> registroCarritos) {
		this.registroCarritos = registroCarritos;
	}


	//11
	public boolean addCarrito(LocalDate fecha, LocalTime hora, Cliente cliente) {
		return(this.registroCarritos.add(new Carrito(IDcarrito, fecha, hora, cliente)));
	}

	//12
	public Carrito getCarrito(int id) {
		Carrito c=null;
		
		for(int i=0;i<this.registroCarritos.size();i++) {
			if(this.registroCarritos.get(i).getId()==id)
				c=this.registroCarritos.get(i);
		}
		
		return c;
	}
	
	//13
	public boolean dltCarrito(int id) throws MiExcepcion {
		boolean ret=this.buscarCarrito(id);
		
		if(ret)
			this.registroCarritos.remove(id-1);
		else
			throw new MiExcepcion(7);
		
		return ret;
	}
	
	//METODOS AUXILIARES para manejarCARRITOS
	
	private boolean buscarCarrito(int id) {
		boolean ret=false;
		
		for(int i=0;i<this.registroCarritos.size();i++) {
			if(id==this.registroCarritos.get(i).getId())
				ret=true;
		}
		
		return ret;
	}
	
//	
//	----------------------------------------------------------
//	----------------------------------------------------------
	/////////////METODOS PARA CALCULAR TOTALES////////////////

	//14
	public float calcularTotal(Cliente cliente) {
		float total=0;
		
//		for(int i=0;i<this.registroCarritos.size();i++) {
//			if(this.registroCarritos.get(i).getCliente().equals(cliente))
//				total+=(this.registroCarritos.get(i).Total());
//		}
		total=(this.totalListilla(this.filtroCliente(cliente)));
		
		return total;
	}
	
	//15
	public float calcularTotal(long dni) {
		float total=0;
		
//		for(int i=0;i<this.registroCarritos.size();i++) {
//			if(this.registroCarritos.get(i).getCliente().getDni()==dni)
//				total+=(this.registroCarritos.get(i).Total());
//		}
		total=(this.totalListilla(this.filtroDNI(dni)));
		
		return total;
	}
	
	//NO COMPRENDO EL ALCANCE(or equals?)
	//16
	public float calcularTotal(LocalDate desde, LocalDate hasta) {
		float total=0;
//		for(int i=0;i<this.registroCarritos.size();i++) {
//			if(this.validarFecha(this.registroCarritos.get(i).getFecha(),desde,hasta))
//				total+=(this.registroCarritos.get(i).Total());
//		}
//	
		total=(this.totalListilla(this.filtrofechaS(desde, hasta)));
		
		return total;
	}
	
	//17
	public float calcularTotal(LocalDate fecha) {
		float total=0;
		
//		for(int i=0;i<this.registroCarritos.size();i++) {
//			if(this.registroCarritos.get(i).getFecha()==fecha)
//				total+=(this.registroCarritos.get(i).Total());
//		}
		total=(this.totalListilla(this.filtrofechaS(fecha, fecha)));
		
		return total;
	}
	
	//18
	public float calcularTotal(int mes, int anio) throws MiExcepcion {
		
		if(mes>12||mes<=0)
			throw new MiExcepcion(8);
		
		float total=0;
		LocalDate desde= LocalDate.of(anio, mes-1, 1);
		LocalDate hasta= LocalDate.of(anio, mes, 1).minusDays(1);
		
//		for(int i=0;i<this.registroCarritos.size();i++) {
//			if(this.validarFecha(this.registroCarritos.get(i).getFecha(),desde,hasta))
//				total+=(this.registroCarritos.get(i).Total());
//		}
		total=(this.totalListilla(this.filtrofechaS(desde, hasta)));
		
		return total;
	}
	

	
	//METODO AUXILIAR
	private boolean validarFecha(LocalDate fecha, LocalDate desde, LocalDate hasta) {
		return ((fecha.isAfter(desde)||fecha.isEqual(desde)) && (fecha.isBefore(hasta)||fecha.isEqual(hasta)));
	}
	
	private List<Carrito> filtroCliente(Cliente cliente){
		List<Carrito> listilla=new ArrayList<Carrito>();
		
		for(int i=0;i<this.registroCarritos.size();i++) {
			if(this.registroCarritos.get(i).getCliente().equals(cliente))
				listilla.add(this.registroCarritos.get(i));
		}
		
		return listilla;
	}
	
	private List<Carrito> filtroDNI(long dni){
		List<Carrito> listilla=new ArrayList<Carrito>();
		
		for(int i=0;i<this.registroCarritos.size();i++) {
			if(this.registroCarritos.get(i).getCliente().getDni()==(dni))
				listilla.add(this.registroCarritos.get(i));
		}
		
		return listilla;
	}
	
	private List<Carrito> filtrofechaS(LocalDate desde, LocalDate hasta) {
		List<Carrito> listilla=new ArrayList<Carrito>();
		
		for(int i=0;i<this.registroCarritos.size();i++) {
			if(this.validarFecha(this.registroCarritos.get(i).getFecha(), desde, hasta))
				listilla.add(this.registroCarritos.get(i));
		}
		
		return listilla;
	}
	
	public List<Carrito> filtroFechaCliente(LocalDate desde, LocalDate hasta, Cliente cliente){
		List<Carrito> prelist=this.filtroCliente(cliente);
		List<Carrito> listilla = new ArrayList<Carrito>();
		
		for(int i=0;i<prelist.size();i++) {
			if(this.validarFecha(prelist.get(i).getFecha(), desde, hasta))
				listilla.add(prelist.get(i));
		}
		
		return listilla;
	}
	 
	public float totalListilla(List<Carrito> listilla) {
		float total=0;
		
		for(int i=0;i<listilla.size();i++) {
			total+=(listilla.get(i).getListaItems().Total());
		}
		
		return total;
	}
}
