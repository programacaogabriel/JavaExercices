package br.com.jcavitreinamento.exercicio2;



public class Carro {

	public static void main(String[] args) {
		
		//dados inseridos
		Pneus  golPneu = new Pneus(150.0,"Aro 14RW","Goodyear");
		Pneus eclipsePneu = new Pneus(255.55,"Aro 18LDA","Pirreli");
		Pneus fordrangerPneu = new Pneus(180.75,"Aro16LXA","Dooloop");
		
		Motor golMotor = new Motor(150,15000,"MaxThoor");
		Motor eclipseMotor= new Motor(300,25000,"Olierte");
		Motor fordrangerMotor = new Motor(120,5000,"Forza");
		
		Bancos golBancos = new Bancos(350.80,"Couro","MultiTech");
		Bancos eclipseBancos = new Bancos(150.95,"Sintético","SpaceX");
		Bancos fordrangerBancos = new Bancos(200.88,"SemiFlux","Valorant");
			
		
		//apresentacao
		System.out.println("Preços do Pneu, motor e bancos");
		System.out.println();
		
		
		//Impressão dos dados finais
		System.out.println("O preço do Gol é de R$ "+(golPneu.getPreco()+golMotor.getPreço()+golBancos.getPreço()+" segue abaixo a relação. "));
		System.out.println(golPneu+" \n"+golMotor+" \n"+golBancos);
		System.out.println();
		System.out.println("O preço do Eclipse é de R$ "+(eclipsePneu.getPreco()+eclipseMotor.getPreço()+eclipseBancos.getPreço()+" segue abaixo a relação. "));
		System.out.println(eclipsePneu+" \n"+eclipseMotor+" \n"+eclipseBancos);
		System.out.println();
		System.out.println("O preço do FordRanger é de R$ "+(fordrangerPneu.getPreco()+fordrangerMotor.getPreço()+fordrangerBancos.getPreço()+" segue abaixo a relação. "));
		System.out.println(fordrangerPneu+" \n"+fordrangerMotor+" \n"+fordrangerBancos);
		
		
	}

	
	
}
