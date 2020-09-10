package ecosistema;

import especie.*;
import tipo.*;
import vida.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal crobat = new Murcielago("crobat");
		Animal Pelipper = new Pelicano("Pelipper");
		Animal magikarp = new Pez_volador("magikarp");
		
		System.out.println(((Murcielago)crobat).volar());
		System.out.println(((Pez_volador) magikarp).volar());
		System.out.println(((Ave)Pelipper).volar());
		System.out.println("\n");
		System.out.println(crobat.interactuar());
		System.out.println(magikarp.interactuar());
		System.out.println(Pelipper.interactuar());
		
	}

}
