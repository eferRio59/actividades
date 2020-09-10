package catalogo;

import java.util.ArrayList;
import java.util.List;

import excepciones.Excepciones;
import modelo.Genero;
import modelo.Pelicula;

public class Incaa {

	private List<Pelicula> pelis;

	
	public Incaa() {
		pelis=new ArrayList<Pelicula>();
	}
	
	public boolean addPeli(String nombre) throws Excepciones{
		 boolean ret=this.busqueda(nombre);
		 
		 if(ret)
			 throw new Excepciones(1);
			 
			 else {
				 pelis.add(new Pelicula(nombre,new Genero("sin clasificar")));
				 ret=true;
			 	 
			 }
			 
		 return ret;
	}
	
	public Pelicula getPeli(long index) {
		Pelicula p=null;
		
		for(int i=0;i<pelis.size();i++) {
			if(index==pelis.get(i).getId())
				p=pelis.get(i);
		}
		
		return p;
	}
	
	public boolean updPeli(long index, String nombre) throws Excepciones {
		boolean ret=false;
		
		if(this.getPeli(index)==null)
			throw new Excepciones(2);
		else {
			pelis.get((int) index).setNombre(nombre);
			ret=true;
		}
		return ret;
	}
	
	public boolean dltPeli(long index) throws Excepciones {
		boolean ret=false;
		
		if(this.getPeli(index)==null)
			throw new Excepciones(2);
		else {
			pelis.remove((int)index);
			ret=true;
		}
		
		return ret;
	}
	
	public List<Pelicula> getPeli(String parte_del_nombre) {
		List<Pelicula> listilla=new ArrayList<Pelicula>();
		
		for(Pelicula p : this.pelis) {
			if(comparacion(p.getNombre(), parte_del_nombre))
				listilla.add(p);
		}
		
		return listilla;
	}
	
	public Pelicula getPeli(Genero genero) {
		Pelicula p=null;
		
		for(int i=0;i<this.pelis.size();i++) {
			if(this.pelis.get(i).getGenero().equals(genero))
				p=pelis.get(i);
		}
		
		return p;
	}
	
	
	//////////METODOS AUXILIARES//////////
	private boolean busqueda(String nombre) {
		boolean ret=false;
		
		for(int i=0;i<pelis.size();i++) {
			if(this.pelis.get(i).getNombre().toUpperCase()==nombre.toUpperCase())
				ret=true;
		}
		
		return ret;
	}
	
	private boolean comparacion(String completo, String parte) {
		//va a contar las coincidencias entre ambas cadenas y servira de indice para la cadena "parte"
		//va a sumar uno cada vez que haya una coincidencia
		//por lo tanto en la proxima iteracion va a preguntar sobre un caracter diferente
		
		int contador=0;
		//convierto ambos String a una cadena de caracteres
		char[] nombreCompleto=completo.toUpperCase().toCharArray();
		char[] parteDelNombre=parte.toUpperCase().toCharArray();

		//recorro el nombre completo caracter por caracter
		for(int i=0;i<nombreCompleto.length;i++) {
			//si el contador es igual al largo de la "parte" quiere decir que
			//
			if(contador!=parteDelNombre.length) {
				//verifico que la coincidencia entre caracteres
				//de ser asi incremento el contador en uno
				if(nombreCompleto[i]==parteDelNombre[contador]) {
					contador+=1;
				}
				else
					//sino verifico el mismo caracter en "i" con el primero de la "parte"
					//si ese es el caso entonces pongo el contador en uno
					//sino lo regreso a cero(0)
					if(nombreCompleto[i]==parteDelNombre[0])
						contador=1;
					else
						contador=0;
			}
		}
		//devolvera true si todos los caracteres de la "parte" estan en el "completo" en orden
		return (contador==parteDelNombre.length);
	}
	

}
