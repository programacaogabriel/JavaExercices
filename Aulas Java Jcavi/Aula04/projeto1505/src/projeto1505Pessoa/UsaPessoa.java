package projeto1505Pessoa;

import br.com.jcavitreinamentos.interfaces.IPessoa;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(1010);
		pessoa.setNome("Jose");
		pessoa.setTelefone("333-5555");
		System.out.println(pessoa);
		
		Pessoa pessoa1 = new PessoaFisica();
		pessoa1.setId(1011);
		pessoa1.setNome("Antonio");
		pessoa1.setTelefone("3322-8899");
		System.out.println(pessoa1);
		
		IPessoa pessoa2 = new PessoaJuridica();
		System.out.println(pessoa2.calcularSalarios());
	
	}

}
