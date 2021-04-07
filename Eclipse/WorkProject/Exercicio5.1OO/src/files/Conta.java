package files;

public class Conta {

	private String name;
	private int conta;
	private double dinheiro;

		
	public Conta(String name, int conta) {
		this.name = name;
		this.conta = conta;
		
	}
	public Conta(String name, int conta, double dinheiro) {
		this.name = name;
		this.conta = conta;
		this.dinheiro= dinheiro;
		
	}

	public String getName() {
		return name;
	}

	public double getConta() {
		return conta;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro=dinheiro;
	}
	
	public void addDinheiro(double dinheiro) {
		this.dinheiro+=dinheiro;
	}
	public void removeDinheiro(double dinheiro) {
		if(dinheiro!=0) {
			this.dinheiro-=dinheiro+5;
		}else {
			this.dinheiro-=dinheiro;
		}
		
	}
	public void transferenciaDinheiro( double dinheiro) {
		this.dinheiro-=dinheiro+7;
	}
	
	public String toString() {
		return "Olá cliente "+name+
				" você tem um Saldo de R$ "+
				getDinheiro();
	}
}
