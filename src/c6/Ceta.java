package c6;

import java.time.LocalDate;

public class Ceta {
	
	private int idCeta;
	private LocalDate fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;

	public Ceta(int idCeta, LocalDate fecha, Contribuyente vendedor, Contribuyente comprador,double valorDeTransferencia, boolean firmaComprador) throws Exxcepcion {
		this.idCeta = idCeta;
		this.fecha = fecha;
		this.setVendedor(vendedor, comprador);
		this.comprador = comprador;
		this.valorDeTransferencia = valorDeTransferencia;
		this.firmaComprador = firmaComprador;
	}

	public int getIdCeta() {
		return idCeta;
	}

	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Contribuyente getVendedor() {
		return vendedor;
	}

	public void setVendedor(Contribuyente vendedor) throws Exxcepcion {
		if(!validarcontribuyente(this.comprador, vendedor))
			this.vendedor = vendedor;
		else throw new Exxcepcion(2);
	}
	public void setVendedor(Contribuyente vendedor,Contribuyente comprador) throws Exxcepcion {
		if(!validarcontribuyente(vendedor, comprador))
			this.vendedor=vendedor;
		else throw new Exxcepcion(2);
	}

	public Contribuyente getComprador() {
		return comprador;
	}

	public void setComprador(Contribuyente comprador) throws Exxcepcion {
		if(!validarcontribuyente(this.vendedor, comprador))
			this.comprador = comprador;
		else throw new Exxcepcion(2);
	}
	public void setcomprador(Contribuyente comprador,Contribuyente vendedor) throws Exxcepcion {
		if(!validarcontribuyente(comprador, vendedor))
			this.comprador=comprador;
		else throw new Exxcepcion(2);
	}

	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}

	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}

	public boolean isFirmaComprador() {
		return firmaComprador;
	}

	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	
	public static boolean validarcontribuyente(Contribuyente a, Contribuyente b) {
		return(a.equals(b));
	}

	
	

}
