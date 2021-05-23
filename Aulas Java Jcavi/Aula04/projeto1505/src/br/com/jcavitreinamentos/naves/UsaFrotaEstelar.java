package br.com.jcavitreinamentos.naves;

import br.com.jcavitreinamentos.interfaces.IComandantes;
import br.com.jcavitreinamentos.interfaces.IFrotas;

public class UsaFrotaEstelar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dados de todas as naves
		FrotaEstelar naves = new FrotaEstelar();
		naves.setClasse("Apollo");
		naves.setFrota("Dobra1");
		System.out.println(naves);
		System.out.println();
		
		
		//Naves
		//Primeira nave
		USSAgamemnon agamemnon = new USSAgamemnon();
		agamemnon.setNome(" USSAgamemnon");
		agamemnon.setNumeroRegistro(" NCC-11638");
		agamemnon.setRegistro(" Em 2367-2368, a Agamemnon serviu para compor a malha de detecção de tachyon para detecção de naves romulanas camufladas,\n"
				+ "parte na armada de bloqueio do capitão Picard contra a interferência romulana durante a guerra civil klingon em 2367-2368.");
		System.out.println(agamemnon);

		IFrotas poderArmas = new USSAgamemnon();
		System.out.println("POWER WEAPOWS: " + poderArmas.poderDasArmas());
		
		IComandantes comando = new USSAgamemnon();
		System.out.println("Comandante : "+comando.retornarComandantes());
		System.out.println();
		
		//Segunda nave
		USSAjax ajax = new USSAjax();
		ajax.setNome("USSAjax");
		ajax.setNumeroRegistro("NCC-11574");
		ajax.setRegistro(" Em 2327, a Ajax foi a primeira nave em que o alferes Cortin Zweler serviu, depois de sua saída da Academia da Frota Estelar. \n"
				+"Em 2364, o especialista em propulsão da Frota Kosinski testou uma melhoria no sistema de dobra, embora depois soubesse-se que suas \n "
				+ "teorias não tinham base e sim a interferência de um alienígena viajante no tempo. Em 2368, a Ajax serviu como parte na armada de \n"
				+ "bloqueio do capitão Picard contra a interferência romulana durante a guerra civil klingon em 2367-2368.");
		System.out.println(ajax);
		
		IFrotas poderArmas1 =new USSAjax();
		System.out.println("POWER WEAPOWS: "+poderArmas1.poderDasArmas());
		IComandantes comando1 = new USSAjax();
		System.out.println("Comandante: "+comando1.retornarComandantes());
		System.out.println();
		
		//Terceira nave
		TPau tpau = new TPau();
		tpau.setNome("TPau");
		tpau.setNumeroRegistro("NSP-17938");
		tpau.setRegistro(" A T'Pau, uma nave vulcana, foi descomissionada em 2364 e enviada ao depósito em órbita de Qualor II. \n"
				+"Em 2368, partes do sistema do defletor de navegação foram descobertos nos destroços de uma nave de carga ferengi. \n"
				+ "Investigação da transferência de partes não autorizada levou a mostrar que a T'Pau havia sido adquirida pelos romulanos.\n"
				+ "A nave foi utilizada junto com outras duas naves vulcanas para carregar 2000 tropas romulanas durante a tentativa de invasão do planeta Vulcano em 2368.\n"
				+ "Quando a invasão foi exposta pelo Embaixador Spock, os romulanos destruíram a nave para evitar captu");
		System.out.println(tpau);
		
		IFrotas poderArmas2 =new TPau();
		System.out.println("POWER WEAPOWS: "+poderArmas2.poderDasArmas());
		IComandantes comando2 = new TPau();
		System.out.println("Comandante: "+comando2.retornarComandantes());
	}

}
