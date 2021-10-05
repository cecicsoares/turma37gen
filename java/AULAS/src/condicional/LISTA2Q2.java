package condicional;

import java.util.Scanner;

public class LISTA2Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2; 
		int numero3;  
		int auxiliar;  
		System.out.printf("Entre com o primeiro número: "); 
		
		numero1 = scan.nextInt();       
		System.out.printf("Entre com o segundo número: ");     
		numero2 = scan.nextInt();       
		System.out.printf("Entre com o terceiro número: ");      
		numero3 = scan.nextInt();       
		System.out.printf("Você digitou: %d, %d e %d.",numero1,numero2,numero3);      
		
		if (numero1 < numero2) {             
			auxiliar = numero1;       
			numero1 = numero2;      
			numero2 = auxiliar; 
		}    
		if (numero2 < numero3){       
			auxiliar = numero2;         
			numero2 = numero3;            
			numero3 = auxiliar;       
			}       
		if (numero3 < numero1) {  
			auxiliar = numero3;      
			numero3 = numero1;        
			numero1 = auxiliar;      
			}                
		System.out.printf("\nA ordem crescente dos números digitados é: %d, %d e %d.",numero1,numero2,numero3);     }
		// TODO Auto-generated method stub
	}
