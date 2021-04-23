package javasabado;

import java.util.Scanner;

public class ExemploOperadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cpf ="064.265.986.-25";
		System.out.println("os valores são iguais? "+(7==7));
		System.out.println("os valores diferentes ? "+(7!=7));

		System.out.println("Primeira frase "+" Segunda frase");
		
		String frase ="Escrevendo e concatenando";
		
		frase+=" Acrescentando texto";
		System.out.println(frase);
	
		System.out.println("Apresentand o Resto da divisão de dois valores "+(10%2));
	
		//Incremento
		int valor =10;
		//System.out.println("Operador Unario "+(-valor));
		
		System.out.println("Incrementar o valor "+(valor++));
		System.out.println(valor);
		System.out.println("Incrementar o valor "+(++valor));
		System.out.println(valor);

		//Decremento
			
		System.out.println("Incrementar o valor "+(valor--));
		System.out.println(valor);
		System.out.println("Incrementar o valor "+(--valor));
		System.out.println(valor);
		
		
		System.out.println("O valor é mair que o outro ? "+ (6>=7));
		System.out.println("O valor é mair que o outro ? "+ (6<=7));
		
		
		 
		sc.close();
	}

}
