package br.com.jcavitreinamentos.automovel;

import br.com.jcavitreinamentos.interfaces.ICarro;

public class Carros3 extends Carros implements ICarro {
	


	@Override
	public Double valorCarro() {
		// TODO Auto-generated method stub
		return 50000.00;
	}

	@Override
	public Boolean carroDisponivel() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Integer qtdCarros() {
		// TODO Auto-generated method stub
		return 5;
	}

}
