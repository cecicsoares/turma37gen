import java.util.Scanner;

public class LISTA3Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade=0, sexo=0, temperamento=0, x=0;
		int pessoaCalma=0, mulherNervosa=0, homemAgressivo=0, outrosCalmos=0, nervosaMaiorQuarenta=0, calmoMenorDezoito=0;
		
		System.out.printf("Digite sua idade: ");
		idade = scan.nextInt();
		System.out.printf("Digite seu sexo (1-Feminino | 2-Masculino | 3-Outros): ");
		sexo = scan.nextInt();
		System.out.printf("Digite seu temperamento (1-Calmo(a) | 2-Nervoso(a) | 3-Agressivo): ");
		temperamento = scan.nextInt();
		
		while (x<=150) {
		if (temperamento==1) {	
			pessoaCalma++;
		}
		if (sexo==1 && temperamento==2) {
			mulherNervosa++;
		}
		if (sexo==2 && temperamento==3) {
			homemAgressivo++;
		}
		if (sexo==3 && temperamento==1) {
			outrosCalmos++;
		}
		if (idade>40 && temperamento==2) {
			nervosaMaiorQuarenta++;
		}
		if (idade<18 && temperamento==1) {
			calmoMenorDezoito++;
		}
		
		System.out.printf("Digite sua idade: ");
		idade = scan.nextInt();
		System.out.printf("Digite seu sexo (1-Feminino | 2-Masculino | 3-Outros): ");
		sexo = scan.nextInt();
		System.out.printf("Digite seu temperamento (1-Calmo(a) | 2-Nervoso(a) | 3-Agressivo): ");
		temperamento = scan.nextInt();
		x++;
		
		System.out.printf("\nPESSOAS CALMAS: %d.",pessoaCalma);
		System.out.printf("\nMULHERES NERVOSAS: %d.",mulherNervosa);
		System.out.printf("\nHOMENS AGRESSIVOS: %d.",homemAgressivo);
		System.out.printf("\nOUTROS CALMOS: %d.",outrosCalmos);
		System.out.printf("\nNERVOSOS MAIOR DE 40 ANOS: %d.",nervosaMaiorQuarenta);
		System.out.printf("\nCALMOS MENOR DE 18 ANOS: %d.",calmoMenorDezoito);
		
		}
	}
}

	
	
	
	
