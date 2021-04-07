import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo retangulo = new retangulo();

		System.out.println(" Digite os lados do Retangulo");
		System.out.print("Digite o valor da largura: ");
		retangulo.width = sc.nextDouble();
		System.out.print("Digite o valor da altura:  ");
		retangulo.height = sc.nextDouble();
		
	    System.out.println(retangulo);
	}

}
