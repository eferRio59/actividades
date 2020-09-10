package c6;

public class Rodado {
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;

	public Rodado(int idRodado, String dominio, int modelo, String marca) {
		this.idRodado = idRodado;
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getIdRodado() {
		return idRodado;
	}

	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) throws Exxcepcion {
		if(validardominio(dominio))
			this.dominio = dominio;
		else throw new Exxcepcion(3);
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//AB 123 CD
	private static boolean validardominio(String dominio) {
		String patron=("^([A-Za-z]{2}(\\s-\\s|\\s|-)[0-9]{3}(\\\\s-\\\\s|\\\\s|-)[A-Za-z]{2})");
		
		return (dominio.matches(patron));
	}
	
	

}
