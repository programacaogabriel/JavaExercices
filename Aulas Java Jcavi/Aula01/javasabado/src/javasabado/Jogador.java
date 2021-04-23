package javasabado;

public class Jogador {

	//atributos ou propriedade da classe
	private String nome;
	private double altura;
	private double peso;
	private String posicao;
	private String time;
	
	//método construtor padrão
	public Jogador() {
		 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	public String toString() {
		return "Jogador [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", posicao=" + posicao + ", time="
				+ time + "]";
	}

	
}
