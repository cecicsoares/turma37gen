package app;

import entities.AviaoLista4Q2;

public class ExAviaoLista4 {

	public static void main(String[] args) {
		//OBJETO
				AviaoLista4Q2 ex2 = new AviaoLista4Q2();

				//ENTRADAS

				ex2.empresa = "AZUL";
				ex2.capacidade = 1000;
				ex2.anoFabricacao = 1970;
				ex2.valorMercado = 10000000.50;

				//SAIDAS

			//  ex2.exibirNome();					OUTRA FORMA DE EXIBIR
			//	ex2.exibirCapacidade();
			//	ex2.exibirAnoFabricacao();
			//	ex2.exibirvalorMercado();

				System.out.println();
				System.out.println(ex2.toString());

	}

}
