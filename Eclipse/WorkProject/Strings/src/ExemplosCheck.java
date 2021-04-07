import java.util.Scanner;

public class ExemplosCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String original = "abcd  FGHIJ ABC abc DEFG";
		String g1 = original.toLowerCase();//Minusculo
		String g2 = original.toUpperCase();//Maiúsculo
		String g3 = original.trim();//Sem espacamento cantos
		String g4 = original.substring(2);//Recorta
		String g5 = original.substring(2,9);//Recorta até posição
		String g6 = original.replace('a', 'x');//Troca char ou string
		String g7 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc"); //Primeira Ocorrencia
		int j = original.lastIndexOf("bc");//Ultima Ocorrencia
		
		///Split --- Pega as strings e gera vetores forever
		
		System.out.println("Original:  "+ original);
		System.out.println("toLowerCase: "+g1);
		System.out.println("toUpperCase:  "+g2);
		System.out.println("trim:  "+g3);
		System.out.println("substring(2):  "+g4);
		System.out.println("substring(2,9):  "+g5);
		System.out.println("replace:  "+g6);
		System.out.println("replace:  "+g7);
		System.out.println("indexOf:  "+i);
		System.out.println("lastIndexOf:  "+j);
		
		String g8 = "Tomate amor Luana";
		String[]vect = g8.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}
