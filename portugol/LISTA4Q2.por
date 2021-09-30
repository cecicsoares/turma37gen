programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos[10] //0-9
		inteiro total=0
		real media=0.00
		inteiro maiorValor=0
		inteiro quantasVezesMaiorValor=0


		para (inteiro x=0; x<10; x++){
			lancamentos[x]=Util.sorteia(1,6)
			escreva("Lancamento ",(x+1)," = ",lancamentos[x],"\n")
			total += lancamentos[x]  
			se (lancamentos[x]>= maiorValor){
				se (lancamentos[x]==maiorValor){
					quantasVezesMaiorValor++ 
				}
				senao se (lancamentos[x]>maiorValor){
					quantasVezesMaiorValor = 1 
				}
				maiorValor = lancamentos[x]
			}

		}
		media = total / 10.00
		escreva("\nMedia ",media)
		escreva("\nMaior valor ",maiorValor)
		escreva("\nO maior valor aparece ",quantasVezesMaiorValor," nos lancamentos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */