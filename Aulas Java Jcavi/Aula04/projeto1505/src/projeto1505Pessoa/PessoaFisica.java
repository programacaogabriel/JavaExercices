package projeto1505Pessoa;

import br.com.jcavitreinamentos.interfaces.IContatos;
import br.com.jcavitreinamentos.interfaces.IPessoa;

public class PessoaFisica extends Pessoa implements IPessoa,IContatos{
	
	private Integer  cpf;

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getCpf()=" + getCpf() + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getTelefone()=" + getTelefone() + ", toString()=" + super.toString() + "]";
	}

	
public Double calcularSalario() {
	return 5.000;
}

@Override
public Double calcularSalarios() {
	// TODO Auto-generated method stub
	return 5.000*3;
}

@Override
public String retornarContatos() {
	// TODO Auto-generated method stub
	return "gabriel@bol.com.br";
}

}
