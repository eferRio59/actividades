package modelo;

public class Num {
	
	private int numero;
	
	public Num(int numero) {
		this.numero=numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
		}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean equals(Num numero) {
		return (this.numero==numero.getNumero());
	}

	//1-
	public int sumar(int numero){
		return(this.numero+numero);
	}
	
	//2-
	public int multiplicar(int numero) {
		return (this.numero*numero);
	}
	
	//3-
	public boolean esPar() {
		return (this.numero%2==0);
	}
	
	//4-NECESITA ARREGLO
	public boolean esPrimo() {
		boolean retorno=true;
		
		for(int i=2;i<this.numero;i++) {
			if (this.numero%i==0) {
				retorno=false;
			}
		}
		
		return retorno;
	}
	
	//5-
	public String ValueStr() {
		return (String.valueOf(this.numero));
	}
	
	//6-
	public double enDouble() {
		return (Double.parseDouble(this.ValueStr()));
	}
	
	//7-
	public double potencia(int exponente) {
		return (Math.pow(this.numero, exponente));
	}
	
	//8-
	public String base2() {
		String retorno="";
		int aux=this.numero;
		
		while(aux>1) {
			retorno=(aux%2)+retorno;
			aux/=2;
		}
		retorno=aux+retorno;
		
		return retorno;
	}
	
	//9-
	public int factorial() {
		int aux=1;
		
		if(this.numero>1){
			for(int i=2;i<=this.numero;i++) {
				aux*=i;
			}
		}
		
		return aux;
	}
	
	//10-
	public int combinacionesEn(int ka) {
		int retorno=0;
		//retorno=(float)(Integer.divideUnsigned(this.factorial(this.limite(k)), auxFactorial(k) ));
		if(this.numero>ka) {
			//int n=this.factorial();
			//int k=factorial1(ka);
			//int nk=factorial1(this.numero-ka);
			retorno=(this.factorial()/(factorial1(ka)*factorial1(this.numero-ka)));
		}
		
		return retorno;
	}
	
	
	
	//METODOS AUXILIARES	
	private static int factorial1(int n) {
		int aux=1;

		if(n>1){
			for(int i=2;i<=n;i++) {
				aux*=i;
			}
		}
		
		return aux;
	}

}