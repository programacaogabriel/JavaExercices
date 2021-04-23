package javasabado;

public class EstruturasDecisao {

	public static void main(String[] args) {
		int valor =10;
		
		boolean acerto = false;
		
		if(valor>=10) {
			System.out.println("Valor maior ou que 10");
		}else {
			System.out.println("Valor menor que 10");
		}

		
		if((valor>10) || (valor ==10)) {
			System.out.println("Valor maior ou igual a 10");
		}
		
		if(!acerto) {
			System.out.println("Apresentando o operador de negação "+acerto);
		}
	
	System.out.println(valor >=10 ? "O valor é maior ou igual a 10":" O valor é menor do que 10");
	}
	

}
