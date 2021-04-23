package javasabado;

public class UsaJogador {

	public static void main(String[] args) {

		// Criando um objeto do tipo jogador

		Jogador jogador = new Jogador();
		jogador.setNome("Romario");
		jogador.setAltura(1.75);
		jogador.setPeso(78.0);
		jogador.setPosicao("Atacante");
		jogador.setTime("Fluminense");

		Jogador jogador2 = new Jogador();
		jogador2.setNome("Bebeto");
		jogador2.setAltura(1.65);
		jogador2.setPeso(75.0);
		jogador2.setPosicao("Atacante");
		jogador2.setTime("Fluminense");

		Jogador jogador3 = new Jogador();
		jogador3.setNome("Oscar");
		jogador3.setAltura(1.89);
		jogador3.setPeso(90.0);
		jogador3.setPosicao("Defesa");
		jogador3.setTime("Fluminense");

		Jogador jogador4 = new Jogador();
		jogador4.setNome("Josias");
		jogador4.setAltura(1.68);
		jogador4.setPeso(78.5);
		jogador4.setPosicao("Meia");
		jogador4.setTime("Fluminense");

		System.out.println("O nome do Jogador é: " + jogador.getNome());
		System.out.println("A altura do Jogador é: " + jogador.getAltura());
		System.out.println("O peso do Jogador é: " + jogador.getPeso());
		System.out.println("A posicao do Jogador é:" + jogador.getPosicao());
		System.out.println("O time do jogador é: " + jogador.getTime());

		System.out.println();

		System.out.println("O nome do Jogador 2 é: " + jogador2.getNome());
		System.out.println("A altura do Jogador 2 é: " + jogador2.getAltura());
		System.out.println("O peso do Jogador 2 é: " + jogador2.getPeso());
		System.out.println("A posicao do Jogador 2 é:" + jogador2.getPosicao());
		System.out.println("O time do jogador 2 é: " + jogador2.getTime());
		System.out.println();

		System.out.println("O nome do Jogador 3 é: " + jogador3.getNome());
		System.out.println("A altura do Jogador 3 é: " + jogador3.getAltura());
		System.out.println("O peso do Jogador 3 é: " + jogador3.getPeso());
		System.out.println("A posicao do Jogador 3 é:" + jogador3.getPosicao());
		System.out.println("O time do jogador 3 é: " + jogador3.getTime());
		System.out.println();

		System.out.println("O nome do Jogador 4 é: " + jogador4.getNome());
		System.out.println("A altura do Jogador 4 é: " + jogador4.getAltura());
		System.out.println("O peso do Jogador 4 é: " + jogador4.getPeso());
		System.out.println("A posicao do Jogador 4 é:" + jogador4.getPosicao());
		System.out.println("O time do jogador 4 é: " + jogador4.getTime());

		System.out.println();
		System.out.println(jogador);
		System.out.println(jogador2);
		System.out.println(jogador3);
		System.out.println(jogador4);
	}

}
