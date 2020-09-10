package geometria;

public class Circulo
{
	private Punto origen;
	private double radio;
	
	public Circulo(Punto punto, double radio) {
		this.origen= punto;
		this.radio= radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto punto) {
		this.origen = punto;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(radio);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
	
	public void setRadio(Punto punto) {
		this.radio= this.origen.distancia(punto);
	}
	
	public void mover(double despX, double despY) {
		Punto nuevoOrigen = new Punto((this.origen.getX()+despX), (this.origen.getY()+despY));
		this.origen= nuevoOrigen;
	}
	
	public boolean equals(Circulo circulo) {
//		int aux=0;
		return ((this.radio==circulo.getRadio())&&(this.origen.equals(circulo.getOrigen())));
		}

	public double perimetro() {
		return(2*Math.PI*this.radio);
	}
	
	public double area() {
		return(Math.PI*(Math.pow(this.radio,2)));
	}
	
	public double calcularDistancia(Circulo circulo) {
		return(this.origen.distancia(circulo.getOrigen()) - this.radio-circulo.getRadio());
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Circulo other = (Circulo) obj;
//		if (punto == null) {
//			if (other.punto != null)
//				return false;
//		} else if (!punto.equals(other.punto))
//			return false;
//		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
//			return false;
//		return true;
//	}
	
	public String toString() {
		String retorno;
		
		retorno=( "   Circulo con centro en "+this.origen+" y radio de: "+this.getRadio());
		
		return retorno;
	}
	
	
}
