import java.util.Locale;

public class exemplo1 {

	public static void main(String[] args) {
		double b,B,h, area;
		
		b= 6.0;
		h= 5.0;
		B= 8.0;
		area=0;
		
		area= (((b+B)/2.0)*h);
		System.out.println("O valor da area é igual a "+area);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da area é igual a %.1f%n%n", area);

		
		//Casting
		int a,c;
		double resultado;
		
		a= 5;
		c= 2;
		resultado = (double) a/c;
		System.out.println(resultado);
	
	
		int n1;
		double n;
		
		n = 5.5;
		n1= (int) n;
		System.out.println(n1);
		
		
		
	
	}

}
