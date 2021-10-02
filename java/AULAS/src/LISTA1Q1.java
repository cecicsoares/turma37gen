import java.util.Scanner;

public class LISTA1Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anos, meses, dias, totalDias;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digitge sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("Digite quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = leia.nextInt();
		
		totalDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("Oi "+nome+", a sua idade expressa em dias aproximadamente é: "+totalDias+" dias.");
		
		
		
		
	}

}
