import java.util.Locale;
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de Notas");
		double x = sc.nextDouble();
		
		/*NOTAS:
		5 nota (s) de R $ 100,00
		1 nota (s) de R $ 50,00
		1 nota (s) de R $ 20,00
		0 nota (s) de R $ 10,00
		1 nota (s) de R $ 5,00
		0 nota ( s) de R $ 2,00*/
		
		// double x1 = x (0 <= x <= 1000000,00);
		
		
		//System.out.println((int)x1+" de R$ 100,00");

		sc.close();
	}

	private static double x(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
