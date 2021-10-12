package app;

import java.util.Scanner;

import entities.ClientesLista4Q1;

public class ExClientesLista4 {

	public static void main(String[] args) {
		//OBJETO
				ClientesLista4Q1 exemplo1 = new ClientesLista4Q1();
				Scanner leia = new Scanner(System.in);

				//ENTRADAS
				exemplo1.nome = "Cecília";
				exemplo1.anoNascimento = 1991;
				exemplo1.cpf = 123456789;
				exemplo1.contato = 123456789;
				//SAIDA
				exemplo1.exibirNome();
				exemplo1.exibirIdade();
				exemplo1.exibirCpf();
				exemplo1.exibirContato();

				System.out.println("O cliente pagará como? digite 'D' para crédito 'C' ou 'E' para espécie: ");
				exemplo1.formaPagamento = leia.next().toUpperCase().charAt(0);
				exemplo1.exibirPagamento();
	}

}
