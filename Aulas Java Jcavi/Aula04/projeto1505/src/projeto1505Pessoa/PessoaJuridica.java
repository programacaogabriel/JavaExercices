package projeto1505Pessoa;

import br.com.jcavitreinamentos.interfaces.IContatos;
import br.com.jcavitreinamentos.interfaces.IPessoa;

public class PessoaJuridica extends Pessoa implements IPessoa,IContatos{

	private Integer cnpf;

	public Integer getCnpf() {
		return cnpf;
	}

	public void setCnpf(Integer cnpf) {
		this.cnpf = cnpf;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpf=" + cnpf + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getTelefone()="
				+ getTelefone() + ", toString()=" + super.toString() + "]";
	}
	
	 public Double calcularSalario() {
	 return 3.000*4.0;
	 }

	@Override
	public Double calcularSalarios() {
		// TODO Auto-generated method stub
		return 3.000*8;
	}

	@Override
	public String retornarContatos() {
		// TODO Auto-generated method stub
		return "rafael@bol.com.br";
	}
	 
	 
}
