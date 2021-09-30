programa
{
	
	funcao inicio()
	{
		real num[5]
		real maiorNum=0.00

		para (inteiro x=0;x<5;x++){
			escreva("Digite um valor: ")
			leia(num[x])	
		se (maiorNum<num[x]){
			maiorNum=num[x]		
		}
		}
		para (inteiro x=0;x<5;x++){
			escreva(num[x]+"\n")
		}
			escreva("\nA maior pontuação é: ",maiorNum)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */