package modelo;

public class BiArray {
	
	private double[][] matriz;
	
	public BiArray(double[][] matriz) {
		this.matriz=matriz;
	}
	
	public double[][] getMatriz(){
		return this.matriz;
	}
	
	public void setMatriz(double[][] matriz) {
		this.matriz=matriz;
	}
	
	public boolean equals(BiArray matriz) {
		boolean retorno=true;
		int aux=0;
		
		if((this.getMatriz().length==matriz.getMatriz().length) && (this.getMatriz()[0].length==matriz.getMatriz()[0].length)) {
			retorno=true;
			for(int j=0;j<this.getMatriz().length;j++) {
				for(int i=0;i<this.getMatriz()[0].length;i++) {
					if(this.getPosicion(j,i)==matriz.getMatriz()[j][i])
						aux=1;
				}
			}
		}
		if (aux==1)
			retorno=false;
		
		return retorno;		
	}
	
	public String toString() {
		String retorno="{";
		
		for(int i=0;i<this.getMatriz().length;i++) {
			retorno+="{";
			for(int j=0;j<this.getMatriz()[0].length;j++) {
				double n=this.getPosicion(i, j);
				if(n>=0)
					retorno+=this.getPosicion(i,j);
				else
					retorno+=("("+n+")");
				if(j<this.getMatriz()[0].length-1)
					retorno+=",";
			}
			retorno+="}";
			if(i<this.getMatriz().length-1)
				retorno+=",\n";
		}
		
		return (retorno+"}");
	}
	
	//METODOS AUXILIARES
	private double getPosicion(int fila, int columna) {
		return this.getMatriz()[fila][columna];
	}
	
	
	//METODOS SLICITADOS EN EL PDF----------
	
	//
	//EN SUMAR Y RESTAR FALTA COLOCAR TRY Y CATCH PARA QUE SOLO SE PUEDA REALIZAR CON MATRIZES DEL MISMO TAMAÑO
	//
	public double[][] sumar(double[][] matriz) throws MiExcepcion{
		double[][] retorno= new double[matriz.length][matriz[0].length];
		
		if((this.matriz.length != matriz.length) || this.matriz[0].length != matriz[0].length)
			throw new MiExcepcion(1);

		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				retorno[i][j]=this.getPosicion(i,j)+matriz[i][j];
			}
		}
		return retorno;
	}
	
	public double[][] restar(double[][] matriz) throws MiExcepcion{
		double[][] retorno= new double[matriz.length][matriz[0].length];
		
		if((this.matriz.length != matriz.length) || this.matriz[0].length != matriz[0].length)
			throw new MiExcepcion(1);
	
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				retorno[i][j]=this.getPosicion(i,j)-matriz[i][j];
			}
		}
		return retorno;
	}

	
	public double[][] transpuesta(){
		double[][] retorno=new double[this.getMatriz()[0].length][this.getMatriz().length];
		
		for(int i=0;i<retorno.length;i++) {
			for(int j=0;j<retorno[0].length;j++) {
				retorno[i][j]=this.getPosicion(j, i);
			}
		}
		
		return retorno;
	}
	
	public double[][] multiplicar(int k){
		double[][] retorno=this.getMatriz();
		
		for(int i=0;i<retorno.length;i++) {
			for(int j=0;j<retorno[0].length;j++) {
				retorno[i][j]*=k;
			}
		}
		
		return retorno;
	}
	//matrizA[a][b]*matrizB[b][c]--->matrizZ[a][c]
	public double[][] multiplicar(double[][] matriz){
		double[][] ret=new double[this.getMatriz().length][matriz[0].length];
		double tn[][]=this.transpuesta();
		
		double aux=0;
		
		for(int i=0;i<ret.length;i++) {
			for(int j=0;j<ret[0].length;j++) {
				for(int k=0;k<tn.length;k++) {
					aux+=(tn[k][i]*matriz[k][j]);
				}
				ret[i][j]=aux;
				aux=0;
			}
		}
		
		return ret;
	}
}