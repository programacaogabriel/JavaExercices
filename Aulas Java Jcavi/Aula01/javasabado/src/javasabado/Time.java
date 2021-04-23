package javasabado;

public class Time {
	
	// atribuindo as propriedades das classes
	private String jogadores;
	private String nome;
	private String cidade;
	private int posicao;
	private int golsMarcados;
	private int golsofridos;
	
	//método construtor padrão
	public String getJogadores() {
		return jogadores;
	}
	public void setJogadores(String jogadores) {
		this.jogadores = jogadores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}
	public int getGolsofridos() {
		return golsofridos;
	}
	public void setGolsofridos(int golsofridos) {
		this.golsofridos = golsofridos;
	}
	@Override
	public String toString() {
		return "Time [jogadores=" + jogadores + ", nome=" + nome + ", cidade=" + cidade + ", posicao=" + posicao
				+ ", golsMarcados=" + golsMarcados + ", golsofridos=" + golsofridos + "]";
	}
	
		
}
