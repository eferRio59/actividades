package errores;

public class MiExcepcion extends Exception{
	
	private int codigo;
	
	public MiExcepcion(int codigo) {
		super();
		this.codigo=codigo;
	}
	
	public String getMessage() {
		String mensaje="";
		switch(codigo) {
		case 1: 
				mensaje="Error: no puede ser precio negativo";
			break;
		case 2:
				mensaje="Error: no existe el item";
			break;
		case 3:
				mensaje="Error: el producto ya existe";
			break;
		case 4:
				mensaje="Error: el producto no existe";
			break;
		case 5:
				mensaje="Error: el cliente ya existe";
			break;
		case 6:
				mensaje="Error: el cliente no existe";
			break;
		case 7:
				mensaje="Error: el carrito no existe";
			break;
		case 8:
				mensaje="Error: mes invalido";
			break;
		}
		
		return mensaje;
	}

}
