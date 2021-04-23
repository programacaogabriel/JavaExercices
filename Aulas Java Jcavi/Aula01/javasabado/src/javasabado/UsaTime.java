package javasabado;

public class UsaTime {

	public static void main(String[] args) {
	
	Time timeJogos = new Time();
	timeJogos.setNome("Flamengo");
	timeJogos.setCidade("Rio de Janeiro");
	timeJogos.setPosicao(1);
	timeJogos.setGolsMarcados(5);
	timeJogos.setGolsofridos(10);
	timeJogos.setJogadores("Atacantes");
	
	Time timeJogos1 = new Time();
	
	timeJogos1.setNome("Palmeiras");
timeJogos1.setCidade("São Paulo");
timeJogos1.setPosicao(2);
timeJogos1.setGolsMarcados(2);
timeJogos1.setGolsofridos(3);
timeJogos1.setJogadores("Esquerda");
	
	
	System.out.println(timeJogos);
	System.out.println(timeJogos1);
	
	
	}

}
