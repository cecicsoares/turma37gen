import java.util.Scanner;

public class LISTA3Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade=0, menor21=0, maior50=0;
		
		while (idade!=-99) {
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
			
			if (idade>0 && idade<21) {
				menor21++;
			}
			else if (idade>50) {
				maior50++;
			}
			
		}
		System.out.printf("TOTAL DE PESSOAS COM MENOS DE 21 ANOS: %s", menor21);
		System.out.printf("\nTOTAL DE PESSOAS COM MAIS DE 50 ANOS: %s", maior50);

	}

}
