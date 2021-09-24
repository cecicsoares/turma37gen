programa
{
	
	funcao inicio()
	{
		real indicePoluicao = 0.0

		escreva("PROGRAMA DE ÍNDICE DE POLUIÇÃO\n")
		escreva("\nInforme o índice poluente: ")
		leia(indicePoluicao)
		
		se(indicePoluicao < 0.05){
			escreva("\nEsta indústria não possui índices poluentes consideráveis")
		}
		senao se (indicePoluicao >= 0.05 e indicePoluicao <= 0.25){
			escreva("\nEsta indústria está respeitando os limites de poluição!")
		}
		senao se (indicePoluicao >= 0.3 e indicePoluicao < 0.4){
			escreva("\nTodas as indústrias do grupo 1 e 2 devem suspender suas atividades!")
		}
		senao se (indicePoluicao >= 0.4 e indicePoluicao <0.5){
			escreva("\nTodas as indústrias do grupo 1 e 2 devem suspender suas atividades!")
		}
		senao se (indicePoluicao >= 0.){
			escreva("\nTodas as indústrias de todos os grupos serão notificados e devem suspender suas atividades imediatamente!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */