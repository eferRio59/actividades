package proyecto_cine;

public class MisExcepciones extends Exception{
	
	private int codigo;
	
	public MisExcepciones(int codigo) {
		super();
		this.codigo=codigo;
	}
	
	public String getMessage() {
		String mensaje="";
		switch(this.codigo) {
		
		case 111:
			mensaje="Error: Opcion invalida...reintente";
			break;
		//falta error 222 y 333(nombres dupliados al agregar una peli o genero a la lista)
		}
		return mensaje;
	}

}
