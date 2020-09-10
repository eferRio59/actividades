package c6;

public class Exxcepcion extends Exception {
	
	private int codigo;
	
	public Exxcepcion(int codigo) {
		this.codigo=codigo;
	}
	
	public String getMEssage(int codigo) {
		String retorno="";
		
		switch(codigo) {
		case 1:
			retorno="error!!";
			break;
		case 2:
			retorno="Error: vendedor y comprador son iguales";
			break;
		case 3:
			retorno="Error: dominio no admitido";
			break;
		case 4:
			retorno="Error: CUIL invalido";
			break;
		}
		
		return retorno;
	}

}
