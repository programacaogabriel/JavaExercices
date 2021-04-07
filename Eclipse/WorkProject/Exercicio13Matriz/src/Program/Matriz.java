package Program;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("Enter with value of Matrix");
		System.out.print("Horizontal: ");
		int h = sc.nextInt();
		System.out.print("Vertical: ");
		int v = sc.nextInt();
		int mat[][] = new int[h][v];

		char resp = 'Y';

		System.out.println("want to create a table automatically? Y/N ");
		resp = sc.next().charAt(0);
		while (resp != 'Y' && resp != 'N') {
			System.out.print("Erro! try again: ");
			resp = sc.next().charAt(0);
		}

		if (resp == 'Y') {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					mat[i][j] = aleatorio.nextInt(100);
				}
			}
		} else {
			System.out.print("Enter the value ");
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
		}

		System.out.println();
		System.out.println("Your Matrix");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.print("Type a number: ");
		int number = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == number && mat[i][j] != 0) {
					System.out.println("Position Line: " + i + " , Colun:" + j);

					if (j > 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("RIGTH: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
				}
			}
		}
	sc.close();
	}
	
}
