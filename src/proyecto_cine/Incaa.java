package proyecto_cine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import proyecto_cine.*;

public class Incaa {

	private List<Pelicula> catalogoP;
	private List<Genero> catalogoG;


	public Incaa() {
		this.catalogoP = new ArrayList<Pelicula>(); 
		this.catalogoG = new ArrayList<Genero>();
	}




	public void getCatalogoGeneros() {

		for(Genero g : catalogoG) {
			System.out.println(g);
		}
	}




	public void getCatalogoPeliculas() {

		for (Pelicula s : catalogoP) {
			System. out .println(s);
		}
	}


	public boolean nombreDuplicadoG(String nombre) {
		boolean out=false;
		
		for(Genero g : this.catalogoG) {
			if(g.getNombre()==nombre)
				out=true;
		}
		
		return out;
	}

	public void addGenero(String nombre) throws MisExcepciones {
		if(nombreDuplicadoG(nombre)) {
			throw new MisExcepciones(333);
		}
		Genero g = new Genero(nombre);
		catalogoG.add(g);
	}


	public void setGenero(int id, String nombreN) {
		
		for(Genero g : this.catalogoG) {
			if(id == g.getID()) {
				g.setNombre(nombreN);
			}
		}
		
	}
	public boolean nombreDuplicadoP(String nombre) {
		boolean out=false;
		
		for(Pelicula p : this.catalogoP) {
			if(p.getNombre()==nombre)
				out=true;
		}
		return out;
	}
	
	public void addPelicula(String nombre, Genero genero) throws MisExcepciones {
		if(nombreDuplicadoP(nombre)) {
			throw new MisExcepciones(333);
		}
		Pelicula p = new Pelicula(nombre, genero);
		catalogoP.add(p);
	}




	//	public void addPelicula(String nombre) {
	//		Pelicula s = new Pelicula(nombre);
	//		catalogo.add(s);
	//	}

	public Genero getGenero(int idGenero) {
		Genero genero = null;
		
		for(Genero g : this.catalogoG) {
			if(g.getID()==idGenero)
				genero=g;
		}
		
		return genero;
	}
	public Pelicula getPelicula(int IdPelicula) {
		Pelicula pelicula = null;
		
		for (Pelicula s : this.catalogoP) {
			if(s.getIdPelicula()==IdPelicula) {
				pelicula = s;
			}
		}
		return pelicula;
	}


	public Pelicula[] getPelicula(Genero genero) {
		int cont=pelisXGenero(genero);
		int aux=0;
		Pelicula[] seleccion = null;
			seleccion = new Pelicula[cont]; 
		for(Pelicula p : this.catalogoP) {
			if(p.getGenero()==genero) {
				seleccion[aux]=p;
				aux++;
			}
		}
		return seleccion;
	}
	public int pelisXGenero(Genero genero) {
		int cont=0;

		for(Pelicula s : this.catalogoP) {
			if(s.getGenero()==genero) {
				cont++;
			}
		}

		return cont;
	}


	public void setPelicula(int id, String nombre) {
		for(Pelicula s: catalogoP) {
			if(s.getIdPelicula()==id) {
				s.setNombre(nombre);
			}
		}
	}


	public String toSTring(Pelicula[] filtradas) {
//		if(filtradas.length==0)

		String listado=filtradas[0].getGenero().getNombre()+": \n";
		
		if(!(filtradas.length==0))
		for(int i=0;i<(filtradas.length);i++) {
			listado= ( listado+ filtradas[i] +"\n");
		}else
			listado=listado+"\n\n LISTA VACIA!!!";

		return listado;	
	}


	public void borrarGenero(int ipe) {
		for(Genero g : this.catalogoG) {
			if(g.getID()==ipe) {
				this.catalogoG.remove(ipe-1);
			}
		}
	}
	
	public void acomodarIdsgenero() {
//		Iterator it = this.catalogoG.iterator();
//		while (it.hasNext()) {
//			it.next()
//		}
		int aux=1;
		for(Genero g : this.catalogoG) {
			g.setId(aux);
			aux++;
		}
	}
	public void acomodarIdsPelis() {
		int aux=1;
		for(Pelicula p : this.catalogoP) {
			p.setIdPelicula(aux);
			aux++;
		}
	}
	
	public void borrarPelicula(int ipep) {
//	int flag=0;
		for(Pelicula s : this.catalogoP) {				//**Falgun problema con el parametro que se pasa al metodo REMOVE de la clase ARRAYLYST/**
			if(s.getIdPelicula()==ipep) {
				this.catalogoP.remove(ipep-1);
			}
		}
	}

}


	
