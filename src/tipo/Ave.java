package tipo;

import caracteristicas.Ivolar;
import vida.Animal;

public abstract class Ave extends Animal implements Ivolar{
	

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return "estoy respirando";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "estoy comiendo";
	}

	@Override
	public String interactuar() {
		// TODO Auto-generated method stub
		return " (graznido,,,)";
	}
	
	public String volar() {
		return("estoy volando");
	}

}
