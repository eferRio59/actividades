package c6;

import b6.Funciones;

public class Contribuyente {
	
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;

	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sex, String cuil) throws Exxcepcion {
		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.setSexo(sex);
		this.setCuil(cuil, sex, dni);;
	}

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws Exxcepcion {
		if(validarSexo(sexo))
			this.sexo = sexo;
		else 
			throw new Exxcepcion(1);
	}

	public String getCuil() {
		return cuil;
	}

	private void setCuil(String cuil, char sexo, long dni) throws Exxcepcion {
		if(validarCuil(cuil, sexo, dni))
			this.cuil = cuil;
		else throw new Exxcepcion(4);
	}
	
	public boolean equals(Contribuyente contribuyente) {
		return(this.cuil==contribuyente.getCuil());
	}
	
	private static boolean validarSexo(char c) {
		String patron=("^[mMfF]");
		
		return(String.valueOf(c).matches(patron));
	}
	
	private static boolean validarCuil(String cuil, char sexo, long dni) {
		int sumador=0;
		int x=2; 
		int y = -345;
		int z = -10;
		
		if(String.valueOf(sexo).matches(("^[FfMm]")))
		{

			if(sexo=='m'||sexo=='M')
				y=0;
			 if(sexo=='F'||sexo=='F')
				y=7;

			String aux=String.valueOf(x)+String.valueOf(y)+String.valueOf(dni);

			char[] xydni=aux.toCharArray();

			int[] paramultiplicar= new int[] {5,4,3,2,7,6,5,4,3,2};

			for(int i=0;i<paramultiplicar.length;i++) {
				sumador+=(paramultiplicar[i]*numeroDeLetra(xydni[i]));
			}
			int r=sumador%11;

			switch(r) {
			case 0:
				z=0;
				break;
			case 1:
				y=3;
				if(sexo=='m' || sexo=='M')
					z=9;
				else
					z=4;
				break;
			default:
				z=11-(sumador%11);
				break;
			}

		}
		
		return ((String.valueOf(x)+String.valueOf(y)+String.valueOf(dni)+String.valueOf(z)).contentEquals(cuil));
		}
	
	private static int numeroDeLetra(char c) {
		int ret=0;
		switch (c) {
		case '1':
			ret=1;
			break;
		case '2':
			ret=2;
			break;
		case '3':
			ret=3;
			break;
		case '4':
			ret=4;
			break;
		case '5':
			ret=5;
			break;
		case '6':
			ret=6;
			break;
		case '7':
			ret=7;
			break;
		case '8':
			ret=8;
			break;
		case '9':
			ret=9;
			break;
		case '0':
			ret=0;
			break;	
		}
		
		return ret;
	}

}
