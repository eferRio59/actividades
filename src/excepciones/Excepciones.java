package excepciones;

public class Excepciones extends Exception{
	
	private int codigo_de_error;
	
	
	public Excepciones(int cod) {
		super();
		this.codigo_de_error=cod;
	}
	
	public String getMessage() {
		String mensaje="";
		
		switch(this.codigo_de_error) {
		
		case 1:
				mensaje="pelicula ya existe";
			break;
		case 2:
				mensaje="no existe la pelicula";
			break;
		}
		
		return mensaje;
	}

}
