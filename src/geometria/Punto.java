package geometria;

public class Punto
{
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x=x;
	}

	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y=y;
	}

	public boolean equals(Punto punto) {
		return (this.x==punto.getX() && this.y==punto.getY());
	}

	public String toString() {
		return "("+this.x+" , "+this.y+")";
	}

	public double distancia(Punto punto) {
		double distancia;
		
		if(this.x==punto.getX()) {
			distancia=(this.y-punto.getY());
		}else if(this.y==punto.getY()) {
			distancia=(this.y)-(punto.getX());
		}else {
			distancia= Math.hypot((this.getX()-punto.getX()), (this.getY()-punto.getY()));
		}
		if(distancia<0)
			distancia*=(-1);
		
		return distancia;
	}

	public void mover(double desplazamientoX, double desplazamientoY) {
		this.x=this.getX()+desplazamientoX;
		this.y=this.getY()+desplazamientoY;
	}
}
