import java.util.Scanner;

public class LISTA3Q2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero=0, totalPar=0, totalImpar=0;
		
		for (int x=1; x<=10; x++) {
			System.out.printf("Digite o %d n�mero: ",x);
			numero = scan.nextInt();
			
			if(numero>0 && numero%2==0) {
				totalPar++;
			}
			else if(numero>0 && numero%2==1) {
				totalImpar++;
			}
		}
		System.out.printf("\nVoc� digitou %d n�meros pares e %d n�meros �mpares.",totalPar,totalImpar);
		
		
			}
	}


	