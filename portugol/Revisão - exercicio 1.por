programa
{
	inclua biblioteca Matematica --> mt
	
	funcao linha()
	{
		escreva("\n---------------------------------------------------------------------------------------------------------------------------------------------------\n")
	}
	
	funcao inicio()
	{	//variavel
		real produto=0.00
		caracter pagamento ='0'
		
		
		
		//coleta de dados etapa1
		escreva("Digite o valor do seu produto: ")
		leia(produto)
		mt.arredondar(produto, 2)
		linha()
		//coleta de dados etapa2
		escreva("Como deseja paga-lo?\n1 - À vista ou cheque\n2 - À vista no cartão de débito\n3 - Em duas vezes no crédito\n4 - Em três vezes no crédito\nDigite: ")
		leia(pagamento)
		linha()

		//saída
		se (pagamento=='1')
		{
		escreva("Parabens, você recebeu 20% de desconto!!!\n" )
		escreva("\nO pagamento à ser feito é de ", produto-(produto*0.20))
		}
		senao se (pagamento=='2')
		{
		escreva("Parabens, você recebeu 15% de desconto!!!\n" )
		escreva("\nO pagamento à ser feito é de ", produto-(produto*0.15))
		}
		senao se (pagamento=='3')
		{
			escreva("Não há promoções e nem juros para esta forma de pagamaento. \n")
			escreva("O pagamento a ser feito é de ",produto)
			
		}
		senao se (pagamento=='4')
		{
			escreva("Esta forma de pagamentos inclue 10% de juros\n")
			escreva("O pagamento a ser feito é de ", produto+(produto*0.10))
		}
		senao
		{
			escreva("Forma de pagamento não identificada, tente novamente.")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */