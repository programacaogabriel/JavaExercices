package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		System.out.println("Matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matriz negativa: ");
		int valor = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					valor ++;
				}
			}

		}
		System.out.println(valor);

		sc.close();
	}

}
