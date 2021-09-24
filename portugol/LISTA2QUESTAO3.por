programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4,q1,q2,q3,q4
		escreva("Escreva o primeiro valor: ")
		leia(num1)
		escreva("Escreva o segundo valor: ")
		leia(num2)
		escreva("Escreva o terceiro valor: ")
		leia(num3)
		escreva("Escreva o quarto valor: ")
		leia(num4)

		q1=mat.potencia(num1,2)
		q2=mat.potencia(num2,2)
		q3=mat.potencia(num3,2)
		q4=mat.potencia(num4,2)

		se (mat.potencia(num3,2) >=1000){
			escreva("O quadrado da ",num3," e ",q3)
		}
		senao se (mat.potencia(num3,2)<1000){
			escreva("\n O quadrado de ", num1, " e ",q1)
			escreva("\n O quadrado de ", num2, " e ",q2)
			escreva("\n O quadrado de ", num3, " e ",q3)
			escreva("\n O quadrado de ", num4, " e ",q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */