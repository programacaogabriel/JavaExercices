package br.com.jcavitreinamentos.automovel;

public class UsaCarro {

	public static void main(String[] args) {
		
		
		Carros car = new Carros();
		
		car.setId(1);
		car.setAno(2018);
		car.setNomes("Gol Special");
		System.out.println(car);
		System.out.println("R$ "+car.valorCarro());
		
		Carros car2 = new Carros();
	
		car2.setId(2);
		car2.setAno(2020);
		car2.setNomes("Renault Clio");
		System.out.println(car2);
		System.out.println("R$ "+car.valorCarro());

		
		Carros3 car3 = new Carros3();
		car3.setId(3);
		car3.setAno(2021);
		car3.setNomes("Azzera");
		System.out.println(car3);
		System.out.println("R$ "+car3.valorCarro());
	}

}
