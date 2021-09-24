programa
{
	
	funcao inicio()
	{
		inteiro numeroDigitado

		escreva("Digite um numero inteiro maior que zero:\n")
		leia(numeroDigitado)

		se (numeroDigitado <=0){
			escreva ("Numero inválido, digite um valor maior que Zero\n")
		}
		senao se (numeroDigitado % 2 ==0){
			escreva ("O número informado é par!\n")
				
		}
		senao {
			escreva("O número informado é ímpar!\n")
		}
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */