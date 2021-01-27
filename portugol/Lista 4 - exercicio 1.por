programa
{
	inclua biblioteca Util
	
	funcao linha()
	{
		escreva("\n--------------------------------------------------------------\n")
	}

	funcao linha2()
	{
		escreva("\n______________________________________________________________\n")
	}
	
	funcao inicio()
	{
	inteiro valores=0 , maiorValor=0
	inteiro pontuacao[5], contador=0,pontuacaoDada=0

	para (inteiro x=0; x<5; x++)
	{
		escreva("Escreva um valor: ")
		leia(pontuacaoDada)
		pontuacao[x]=pontuacaoDada
		se( pontuacao[x]>= maiorValor)
			{
				se (pontuacao[x]==maiorValor)
				{
					contador++
				}
				senao
				{
					contador=1
				}
				maiorValor= pontuacao[x]
			}
		
	}
	linha()
	para (inteiro x=0; x<5; x++)
	{
		escreva(x+1, "° valor recebeu a pontuação: ", pontuacao[x],"\n")	
	}
	linha()
	escreva("A maior pontuação foi: ",maiorValor)
	linha2()
	escreva("FIM DE PROGRAMA")
	linha2()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */