package adaptadores;

import java.util.ArrayList;
import java.util.List;

import errores.MiExcepcion;
import modelo.Cliente;

public class ClienteAdapter extends ArrayList<Cliente>{

	private List<Cliente> listaClientes;
	private static int IDcli=1;
	
	
	public ClienteAdapter() {
		super();
		this.listaClientes=new ArrayList<Cliente>();
	}

	//8
	public boolean addCliente(String nombre, long dni, String direccion) throws MiExcepcion {
		boolean ret=this.buscarcliente(dni);

		if(ret)
			throw new MiExcepcion(5);
		else {
			this.listaClientes.add(new Cliente(IDcli, nombre, dni, direccion));
			IDcli++;
			ret=true;
		}
		return ret;
	}

	//9
	public Cliente getCliente(int id) {
		Cliente c=null;

		for(int i=0;i<listaClientes.size();i++) {
			if(listaClientes.get(i).getId()==id)
				c=listaClientes.get(i);
		} 

		return c;
	}

	//10
	public boolean dltCliente(int id) throws MiExcepcion {
		boolean ret=this.buscarCliente(id);

		if(ret)
			this.listaClientes.remove(id-1);
		else
			throw new MiExcepcion(6);

		return ret;
	}
	public int size() {
		return (IDcli-1);
	}

	//METODOS AUXILIARES-cliente
	public boolean buscarcliente(long dni) {
		boolean ret=false;

		for(int i=0;i<this.listaClientes.size();i++) {
			if(dni==this.listaClientes.get(i).getDni())
				ret=true;
		}
		return ret;
	}

	public boolean buscarCliente(int id) {
		boolean ret=false;

		for(int i=0;i<this.listaClientes.size();i++) {
			if(id==listaClientes.get(i).getId())
				ret=true;
		}

		return ret;
	}

	 
}
