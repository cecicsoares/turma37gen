programa
{
	
	funcao inicio()
	{

	 	const inteiro valorHT = 10
	 	const inteiro valorHE = 20
	 	const inteiro tempoHN = 50
	 	
		cadeia nome, codigo
		inteiro horas, valorHora, salario, salarioExtra
	
		
		escreva("Digite o nome do funcionário: ")
		leia(nome)

		escreva("Digite o código do funcionário: ")
		leia(codigo)

		escreva("Digite o número de horas trabalhadas: ")
		leia(horas)

		valorHora = valorHT
		salarioExtra = 0
	

		se (horas>tempoHN){
			salario = tempoHN * valorHora
			salarioExtra = (horas-tempoHN) * (valorHora*2)
		}
		senao {
			salario = horas * valorHora
		}
			escreva("Folha de pagamento\n")
			escreva("O funcionario " ,nome, " de código ",codigo, " trabalhou ", horas, " horas mensais\n")
			escreva ("Salário: R$ ", salario, "\n")
			escreva ("Extra: R$ ", salarioExtra)

			escreva ("\nFim do programa")
		}
		
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */