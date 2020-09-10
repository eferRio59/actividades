package herencia_persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdmClientes {
	
	private List<Cliente> bdCliente;
	
	public AdmClientes() {
		this.bdCliente = new ArrayList<Cliente>();
	}
	
	public List<Cliente> getBdCliente() {
		return bdCliente;
	}
	
	public void setBdCliente(List<Cliente> bdCliente) {
		this.bdCliente = bdCliente;
	}

	public boolean addCliente(String persona, String apellido, long dni, LocalDate fechaNacimiento, String cuit, float limiteCredito) {
		
		
		
		
		return true;
	}

	
//	metodos auxiliares{
	
	
	private Cliente getClientePordni(long dni) {
		Cliente cliente=null;
		
		for(Cliente c : this.bdCliente) {
			if(dni==c.getDni())
				cliente=c;
		}
		
		return cliente;
	}
	
}
