package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer44 {

	public static void main(String[] args) {
		/*44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
	incremento, mostrando em seguida todos os valores no intervalo:
	Ex: Digite o primeiro Valor: 3
	Digite o último Valor: 10
	Digite o incremento: 2
	Contagem: 3 5 7 9 Acabou!*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int valor,valorFinal, incremento;
		
		System.out.print("Digite o Primeiro valor: ");
		valor = sc.nextInt();
		System.out.print("Digite o valor do Incremento: ");
		incremento=sc.nextInt();
		System.out.print("Digite o valor Final: ");
		valorFinal=sc.nextInt();
		
		while(valor<=valorFinal) {
			System.out.print(valor+" ");
			valor=valor+incremento;
		}
		System.out.print("Acabou! ");
		sc.close();
	}

}
