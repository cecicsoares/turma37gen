package lacosDeRepeticao;

import java.util.Scanner;

public class LISTA3Q6 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
			int numero=0;
			double media=0.00, soma=0.00, totalMultiplos=0.00;
			
			do {
				System.out.printf("Digite um n�mero: ");
				numero = scan.nextInt();
				if (numero%3==0) {
					soma+=numero;
					totalMultiplos++;
				}
				
			} while(numero!=0);
			
			media=soma/totalMultiplos;
			System.out.printf("A soma dos m�ltiplos de 3 � %.2f.",soma);
			System.out.printf("\nVoc� digitou %.2f n�meros m�ltiplos de 3.",totalMultiplos);
			System.out.printf("\nA m�dia entre ele � %.2f.",media);
	}

}
