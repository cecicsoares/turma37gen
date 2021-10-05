package condicional;

import java.util.Locale;
import java.util.Scanner;

public class LISTA2Q4 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		
		System.out.println("Digite um valor inteiro positivo ");
		int valor = leia.nextInt();
		System.out.println(((valor%2)==0) ? "Valor Par": "Valor ímpar");
		
	}

}		   /*
 			* if ((valor%2)==0) {
	System.out.println("Valor par");
}
			else {
	System.out.println("Valor ímpar");
}

 		*/  
