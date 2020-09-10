package tipo;

import vida.Animal;

public abstract class Pez extends Animal{

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return "estoy repirando";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "estpy comiendo";
	}

	@Override
	public String interactuar() {
		// TODO Auto-generated method stub
		return "glub, glub, glub....";
	}

}
