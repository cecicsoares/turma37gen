package condicional;

import java.util.Scanner;

public class LISTA2Q3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.printf("Digite seu nome: ");
		nome = leia.next();
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=18 && idade <=25) {
			System.out.printf("Ol� %s, sua categoria �: Adulto.", nome);
		}
		else if (idade >=15 && idade <=17) {
			System.out.printf("Ol� %s, sua categoria �: Juvenil.", nome);
		}
		else if (idade >=10 && idade <=14) {
			System.out.printf("Ol� %s, sua categoria �: Infantil.", nome);
		}
		else {
			System.out.printf("Infelizmente n�o trabalhamos com essa idade, digite uma idade entre 10 e 25 anos.");
			
		}

	}

}
