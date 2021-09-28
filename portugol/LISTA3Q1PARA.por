programa
{
	
	funcao inicio()
	{
		inteiro pessoas=0, x=0, filhos=0
		real media=0.00, salario=0.00, total=0.00, mFilhos=0.000, tFilhos=0.00, maior=0.00 , p=0.00
		real percentual=0.00
		escreva ("Digite a quantidade de habitantes: ")
		leia(pessoas)
		para(x=1;x<=pessoas;x++){
			escreva("Digite o salário. ")
			leia(salario)
			escreva("Quantos filhos você tem? ")
			leia(filhos)
			tFilhos=tFilhos+filhos
			total=total+salario
		se (salario > maior){
			maior = salario
		}
		se (salario > 100){
			percentual=percentual+1
		}
		}
		media = (total/pessoas)
		mFilhos=(tFilhos/pessoas)
		p=(percentual/pessoas)
		escreva("\nA média de salário é: R$ "+media+ "  ")
		escreva("\nA média de filhos da população é: "+mFilhos)
		escreva("\nA média de salário foi: R$ "+maior+ "  ")
		escreva("\nO percentual de pessoas que recebem mais de R$ 100 reias é igual a: "+(p*100)+ "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */