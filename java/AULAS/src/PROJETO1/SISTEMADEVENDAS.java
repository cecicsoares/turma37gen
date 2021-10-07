package PROJETO1;

import java.util.Scanner;

public class SISTEMADEVENDAS {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String [] produtos = {"MOUSE          ","TECLADO        ","MONITOR        ","CABO USB","FONE DE OUVIDO","CARREGADOR","ADAPTADOR","PELICULA","CASE P/ CELULAR","CABO HDMI"};
		String [] produtosc = {"","","","","","","","","",""};	
		String [] codigo = {"G6-0   ","G6-1   ","G6-2   ","G6-3   ","G6-4   ","G6-5   ","G6-6   ","G6-7   ","G6-8   ","G6-9   "};
		String [] codigoc = {"","","","","","","","","",""};
		double [] valor = {50.0,150.0,900.0,20.00,50.00,30.00,50.00,20.00,40.00,55.00};
		double [] valorc = {0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00};
		int [] estoque = {10,20,30,40,50,60,70,80,90,100};
		int [] carrinho = {0,0,0,0,0,0,0,0,0,0};
		char opcao;
		int i=0,quantidade=0;
		int formaPagamento = 0;
		double valorTotalCompra = 0.0;
		double valorParcelado = 0.0;
		double valorComImposto = 0.0;
		double valorComDesconto = 0.0;
		char respostaBoleto ;
		char respostaParcelas ;
		char proximoPasso;
		char respostaIndecisa;
		double valorComImpostoParcela =0.0;
		
		System.out.print(" ______________________________________________\n");
		System.out.print("| $   $                                  $   $ |\n");
		System.out.print("|   $        SISTEMA DE VENDAS ONLINE      $   |\n");
		System.out.print("|               37GEN COMÉRCIOS LTDA           |\n");
		System.out.print("|_$___$__________________________________$___$_|\n");
		System.out.print("\n  >>      TUDO QUE VOCÊ PRECISA AQUI       << \n");
		System.out.print("\n\n");
		System.out.print(" ______________________________________________\n");
		System.out.print("|                                              |\n");
		System.out.print("|       > > >   TABELA DE PRODUTOS    < < <    |\n");
		System.out.print("|______________________________________________|\n");
		System.out.print("|__PRODUTOS_____|___CÓD___|__VALOR_UNT.|ESTOQUE|\n");
		System.out.print("|MOUSE          |  G6-0   |    R$ 50,00|  10   |\n");
		System.out.print("|TECLADO        |  G6-1   |   R$ 150,00|  20   |\n");
		System.out.print("|MONITOR        |  G6-2   |  R$ 1500,00|  30   |\n");
		System.out.print("|CABO USB       |  G6-3   |    R$ 20,00|  40   |\n");
		System.out.print("|FONE DE OUVIDO |  G6-4   |    R$ 50,00|  50   |\n");
		System.out.print("|CARREGADOR     |  G6-5   |    R$ 30,00|  60   |\n");
		System.out.print("|ADAPTADOR      |  G6-6   |    R$ 50,00|  70   |\n");
		System.out.print("|PELÍCULA       |  G6-7   |    R$ 20,00|  80   |\n");
		System.out.print("|CASE P/ CELULAR|  G6-8   |    R$ 40,00|  90   |\n");
		System.out.print("|CABO HDMI      |  G6-9   |    R$ 55,00|  100  |\n");
		System.out.print("|_______________|_________|____________|_______|\n");
		System.out.print("\n\nDESEJA CONTINUAR COMPRANDO? DIGITE S OU N:");
		opcao = leia.next().charAt(0);
		
		if(opcao == 'S' || opcao == 's'){
			
			System.out.print("\n               $ $ $ VAMOS GASTAR? $ $ $\n");
			while(opcao=='s' || opcao=='S'){

				System.out.print(" _______________________________________________________\n");
				System.out.print("|________________>> ITENS DISPONÍVEIS <<________________|\n");
				System.out.print(" _______________________________________________________\n");
				System.out.print("|____COD.____|___PRODUTO____|__VALOR UNIT.__|__ESTOQUE__|\n");
				for(i=0;i<10;i++){
					System.out.print("\n"+codigo[i]+"\t\t"+produtos[i]+"\t"+valor[i]+"\t\t"+estoque[i]);
				
				}
				System.out.print("\n\nDIGITE O ÚLTIMO NÚMERO DO CÓDIGO: ");
				i = leia.nextInt();
				//se(i != 0 ou i != 1 ou i != 2 ou i != 3 ou i != 4 ou i != 5 ou i != 6 ou i != 7 ou i != 8 ou i != 9){
					//escreva("\nDESCULPE, OPÇÃO INVÁLIDA!")
					
				//}
				
				System.out.print(" _________________________________________________________\n");
				System.out.print("|____COD.____|___PRODUTO____|__VALOR UNIT.__|___ESTOQUE___|\n");
				System.out.print("\n "+codigo[i]+"\t"+produtos[i]+"\tR$"+valor[i]+ "\t      " +estoque[i]);
				codigoc[i] = codigo[i];
				produtosc[i] = produtos[i];
				valorc[i]=valor[i];
				System.out.print("\n\nDIGITE A QUANTIDADE QUE GOSTARIA COMPRAR: ");
				quantidade = leia.nextInt();
		 	
		 		if(quantidade>=estoque[i] || quantidade <0){
		 			System.out.print("QUANTIDADE INDISPONÍVEL NO ESTOQUE. ENTRAREMOS EM CONTATO EM CASO DE REPOSIÇÃO");		 		
		 		}
		 		else  {
		 			estoque[i] = estoque[i]-quantidade;
		 			carrinho[i] = carrinho[i]+quantidade;
		 			valorTotalCompra = valorTotalCompra+(quantidade*valor[i]);
		 			valorComImposto = valorTotalCompra + (valorTotalCompra * 9)/100;
					valorTotalCompra = valorComImposto;
		 		}
		 	
		 		System.out.print("\nITEM ADCIONADO AO CARRINHO!");			 	
		 		System.out.print("\nCONTINUAR COMPRANDO ? s/n ");
				opcao = leia.next().charAt(0);
				
			}	
			
			
			System.out.print(" __________________________________________________________\n");
			System.out.print("|_____________________CARRINHO DE COMPRAS__________________|\n");
			
			for(i=0;i<10;i++){
				if(carrinho[i]!=0 && codigoc[i]!="" && valorc[i]!=0.00 && produtosc[i]!="" ){
					System.out.print(" __________________________________________________________\n");
					System.out.print("|____COD.____|___PRODUTO____|__VALOR UNIT.__|__QUANTIDADE__|\n");
					System.out.print("\n "+codigoc[i]+"\t"+produtosc[i]+"\t"+valorc[i]+"\t\t"+carrinho[i]+ "\n");
				}
			}
			
			System.out.print("\n ___>>> + 9 % DE IMPOSTO ESTADUAL SOBRE O PRODUTO <<<____");
			System.out.print("\n                                                         ");
			System.out.print("\n  VALOR ACUMULADO NO CARRINHO:               R$ "+(valorTotalCompra)+"\n");
			System.out.print(" ________________________________________________________");
			
			
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("  __________________________________________________________\n");
			System.out.print(" |_________________PRODUTOS AINDA DISPONÍVEIS_______________|\n");
			System.out.print(" |____COD.____|____PRODUTO____|__VALOR UNIT.__|___ESTOQUE___|\n");
			
			for (i=0;i<10;i++){	
				System.out.print("    "+codigo[i]+"\t"+produtos[i]+"\t  "+valor[i]+"\t         "+estoque[i]+" \n");
			}


			System.out.print("\n__________________________________________________________\n");
			System.out.print("\nDIGITE 1 PARA PAGAMENTO À VISTA\n");
			System.out.print("__________________________________________________________\n");
			System.out.print("\nDIGITE 2 PARA PAGAMENTO EM CARTÃO\n");
			formaPagamento=leia.nextInt();
			
			if(formaPagamento == 1){
				valorComDesconto = valorTotalCompra - (valorTotalCompra * 10)/100;
				valorTotalCompra = valorComDesconto;
				System.out.print("\n >>> PARA PAGAMENTOS À VISTA VOCÊ GANHA 10% DE DESCONTO!! <<<\n");
				System.out.print("____________________________________________________________\n");
				System.out.print("\nVALOR TOTAL DA COMPRA: R$"+(valorTotalCompra)+"\n");
				System.out.print("____________________________________________________________\n");
				System.out.print("\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? (S/N) ");
				respostaBoleto=leia.next().charAt(0);
				if(respostaBoleto =='S' || respostaBoleto == 's'){
					
					System.out.print("\n\n____________________________________________________________\n");
					System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
					System.out.print("____________________________________________________________\n");
					System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
					proximoPasso = leia.next().charAt(0);
					
						if(proximoPasso == 's' || proximoPasso == 'S'){

							System.out.print("\n >> COMPRA REALIZADA COM SUCESSO! << ");
							System.out.print("\n\n_____________________________\n");
							System.out.print("\nNOTA FISCAL: 216546454654");
							System.out.print("\n_____________________________\n");
						}
						else if(proximoPasso == 'n' || proximoPasso == 'N'){
							System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
						}
						else if(proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n' || proximoPasso != 'N'){
							System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
							System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
							respostaIndecisa = leia.next().charAt(0);
							if(respostaIndecisa == 's' || respostaIndecisa == 'S'){
								System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
								//como faz pra voltar pro início do programa?
							}
						}

				
				}
				else if(respostaBoleto =='n' || respostaBoleto == 'N'){
					System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");

				}
				else if(respostaBoleto !='N' || respostaBoleto != 'n' || respostaBoleto !='S' || respostaBoleto != 's'){
					System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
				}
				
			}
			else if(formaPagamento == 2){
				System.out.print("\nGOSTARIA DE PARCELAR? ");
				respostaParcelas = leia.next().charAt(0);
				if(respostaParcelas == 's' || respostaParcelas == 'S'){
					System.out.print("\nSUA COMPRA SERÁ PARCELADA EM 2X\n");
					valorComImpostoParcela = valorTotalCompra + (valorTotalCompra * 15)/100;
					valorParcelado = valorComImpostoParcela / 2;
					System.out.print("\n >> PARA COMPRAS EFETUADAS E PARCELADAS NO CARTÃO DE CRÉDITO HAVERÁ ACRESCIMO DE 15% SOBRE O VALOR TOTAL DA COMPRA <<\n");
					System.out.print("\n____________________________________________________________\n");
					System.out.print("\nVALOR DA PARCELA: R$" +(valorParcelado));
					System.out.print("\n____________________________________________________________\n");
					System.out.print("\nVALOR TOTAL DA SUA COMPRA: "+(valorTotalCompra));
					System.out.print("\n____________________________________________________________\n");
					System.out.print("\n\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? ");
					 respostaBoleto = leia.next().charAt(0);
					if(respostaBoleto =='n' || respostaBoleto == 'N'){
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					}
					else if(respostaBoleto == 's' || respostaBoleto == 'S'){
						System.out.print("\n\n____________________________________________________________\n");
						System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
						System.out.print("____________________________________________________________\n");
						System.out.print("\n\n  >> COMPRA REALIZADA COM SUCESSO! << \n");
						System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
						(proximoPasso) = leia.next().charAt(0);
						if(proximoPasso == 's' || proximoPasso == 'S'){
							System.out.print("\n\n_____________________________\n");
							System.out.print("\nNOTA FISCAL: 216546454654");
							System.out.print("\n_____________________________\n");
						}
						else if(proximoPasso == 'n' || proximoPasso == 'N'){
							System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
						}
						else if(proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n' || proximoPasso != 'N'){
							System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
							System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");	
							(respostaIndecisa)= leia.next().charAt(0);
							if(respostaIndecisa == 's' || respostaIndecisa == 'S'){
								System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
							}
						}
					}
					else if(respostaBoleto != 's' || respostaBoleto != 'S' || respostaBoleto != 'n' || respostaBoleto != 'N'){
						System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");
					}
					
				}
				else if (respostaParcelas == 'n' || respostaParcelas == 'N'){

					System.out.print("\nVALOR TOTAL DA COMPRA: R$"+(valorTotalCompra));
					System.out.print("\n\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? ");
					(respostaBoleto) = leia.next().charAt(0);
					if(respostaBoleto =='n' || respostaBoleto == 'N'){
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					}
					else if(respostaBoleto == 's' || respostaBoleto == 'S'){
						System.out.print("\n\n____________________________________________________________\n");
						System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
						System.out.print("____________________________________________________________\n");
						System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
						(proximoPasso) = leia.next().charAt(0);
						if(proximoPasso == 's' || proximoPasso == 'S'){
							
							System.out.print("\n\n  >> COMPRA REALIZADA COM SUCESSO! << ");
							System.out.print("\n\n_____________________________\n");
							System.out.print("\nNOTA FISCAL: 216546454654");
							System.out.print("\n_____________________________\n");
						}
						
						else if(proximoPasso == 'n' || proximoPasso == 'N'){
							System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
						}
						else if(proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n' || proximoPasso != 'N'){
							System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
							System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
							(respostaIndecisa) =  leia.next().charAt(0);
							if(respostaIndecisa == 's' || respostaIndecisa == 'S'){
								System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
							}
						}
					
					
					}
					else if(respostaBoleto != 's' || respostaBoleto != 'S' || respostaBoleto != 'n' || respostaBoleto != 'N'){
						System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");
				
				
			
					}
					
				}
				else if(respostaParcelas != 's' || respostaParcelas != 'S' || respostaParcelas != 'n' || respostaParcelas != 'N'){
					System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");
				
				}

				
				}
					else if(formaPagamento != 1 || formaPagamento != 2 ){
						System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
				
				}
				
			}						
		else if(opcao == 'n' || opcao == 'N') {
			System.out.print("\n >>>:  OBRIGADA PELA VISITA. VOLTE SEMPRE! :<<< ");

			}
		else if(opcao != 'n' || opcao != 'N' || opcao != 's' || opcao != 'S'){
			System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
			}
					
		}
	}

