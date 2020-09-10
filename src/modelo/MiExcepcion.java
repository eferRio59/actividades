package modelo;

public class MiExcepcion extends Exception{
	
	private int codigo;
	
	public MiExcepcion(int codigo) {
		super();
		this.codigo=codigo;
	}
	
	public String getMessage() {
		String mensaje="";
		switch(this.codigo) {
		case 1:
			mensaje="los tamaños de las matrizes no es igual";
			break;
		case 2:
			mensaje="";
			break;
		}
		
		return mensaje;
	}
	

}
