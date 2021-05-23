 package br.com.jcavitreinamentos.animal;

import br.com.jcavitreinamentos.interfaces.IAnimal;

public class Animal implements IAnimal{

	@Override
	public String animalVelocidadeCorrida(Double velocity) {
		// TODO Auto-generated method stub
		return velocity.toString();
	}

	@Override
	public String animalComer() {
		// TODO Auto-generated method stub
		return "Feijao";
	}

	@Override
	public String animalAndar() {
		// TODO Auto-generated method stub
		return "bipede";
	}
	
	

}
