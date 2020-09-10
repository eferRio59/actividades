package modelo;

public class Uarray {

	private int[] array;
	
	public Uarray(int[] array) {
		this.array=array;
	}
	
	public int[] getArray(){
		return this.array;
	}
	
	public void setArray(int[] array) {
		this.array=array;
	}
	
	public boolean equals(int[] array) {
		boolean retorno = false;
		
		if(this.getArray().length==array.length) {
			retorno=true;
			for(int i=0;i<array.length;i++) {
				if(!(this.getPoscicion(i)==array[i]))
					retorno=false;
			}
		}

		return retorno;
	}
	
	public boolean equals(Uarray array) {
		boolean retorno=false;
		
		if(this.getArray().length==array.getArray().length) {
			retorno=true;
			for(int i=0;i<array.getArray().length;i++) {
				if((this.getPoscicion(i)) != array.getPoscicion(i))
					retorno=false;
			}
		}
		
		return retorno;
	}
	
	public String toString() {
		String retorno="[";
		
		for(int i=0;i<this.getArray().length;i++) {
			if(i!=this.getArray().length-1)
				retorno=retorno+this.getPoscicion(i)+",";
			else retorno=retorno+this.getPoscicion(i);
		}
		return retorno+"]";
	}
	
	
	//METODOS DEL PDF
	public double promedio() {
		double aux=0;
		
		for(int i=0;i<this.array.length;i++) {
			aux+=this.array[i];
		}
		
		return (aux/this.getArray().length);
	}
	
	
	public int[] ascOrden() {
		int[] retorno= this.getArray();
		int aux;
		boolean cambio=true;
		int limite=0;
		
		while(cambio) {
			cambio=false;
			
			for(int i=0+limite;i<retorno.length-limite-1;i++ ) {
				if(retorno[i]>retorno[i+1]) {			// 4  3  2  1 .5
					aux=retorno[i+1];				// 3  2  1 .4 .5 
					retorno[i+1]=retorno[i];
					int auxdb=retorno[i+1];	// 2  1 .3 .4 .5
					retorno[i]=aux;
					int auxdb2=retorno[i];
					cambio=true;
				}	
			}
			for(int i=retorno.length-1-limite;i>0+limite+1;i-- ) {
				if(retorno[i]<retorno[i-1]) {			// 4  3  2  1 .5
					aux=retorno[i-1];				// 3  2  1 .4 .5 
					retorno[i-1]=retorno[i];	
					int auxdb=retorno[i-1];	// 2  1 .3 .4 .5
					retorno[i]=aux;	
					int auxdb2=retorno[i];
					cambio=true;
				}	
			}
			limite+=1;			
		}
		
		return retorno;
	}

	
	//FALLA
	public int[] descOrden() {
		int[] retorno= this.getArray();
		int aux=0;

			for(int i=0;i<retorno.length;i++) {
				for(int j=0;j<retorno.length-i-1;j++) {
					if(retorno[j]>retorno[j+1]) {
						aux=retorno[j];
						retorno[j]=retorno[j+1];
						retorno[j+1]=aux;
					}
				}
				for(int s=0;s<retorno.length-i-1;s++) {
					if(retorno[s]<retorno[s+1]) {
						aux=retorno[s];
						retorno[s]=retorno[s+1];
						retorno[s+1]=aux;
					}
				
				}
			}

		return retorno;
	}
	
	public double frecuencia(int n) {
		float contador=0;
		
		for(int i=0;i<this.getArray().length;i++) {
			if(this.getArray()[i]==n)
				contador++;
		}
		//double retorno=;
		
		return (contador/this.getArray().length);
	}
	
	public int moda() {
		int moda=0;
		int contador_moda=0;
		int contador=0;
		
		for(int j=0;j<this.getArray().length;j++) {
			for(int i=0;i<this.getArray().length;i++) {
				if(this.getPoscicion(i)==this.getPoscicion(j))
					contador+=1;
			}
			if(contador>contador_moda) {
				moda=this.getPoscicion(j);
				contador_moda=contador;
			}
			contador=0;
		}
		return moda;
	}

	///////////////////////////////////////////////////////
	//METODOS AUXILIARES
	private int getPoscicion(int poscicion) {
		return this.array[poscicion];
	}
	
	public static boolean comparar(int[] arrayA, int[] arrayB) {
		boolean ret=true;
		
		for(int i=0;i<arrayA.length;i++) {
			if(arrayA[i] != arrayB[i])
				ret=false;
		}
		return ret;
	}
}
