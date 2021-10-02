import java.util.Scanner;

public class LISTA1QUESTAO3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int horas, minutos, segundos, tempoTotal;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoTotal = scan.nextInt();
		
		horas = tempoTotal/3600;
		minutos = (tempoTotal - (horas*3600))/60;
		segundos = (tempoTotal%60);
		
		System.out.println("O tempo do evento é de "+horas+" horas "+minutos+" minutos e "+segundos+" segundos.");
		
		// TODO Auto-generated method stub

	}

}
