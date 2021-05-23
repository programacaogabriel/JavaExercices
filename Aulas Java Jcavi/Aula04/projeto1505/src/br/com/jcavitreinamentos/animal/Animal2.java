  package br.com.jcavitreinamentos.animal;

import br.com.jcavitreinamentos.interfaces.IAnimal;

public class Animal2 implements IAnimal {

	@Override
	public String animalVelocidadeCorrida(Double velocity) {
		// TODO Auto-generated method stub
		return velocity.toString();
	}

	@Override
	public String animalComer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String animalAndar() {
		// TODO Auto-generated method stub
		return "quadrupede";
	}

}
