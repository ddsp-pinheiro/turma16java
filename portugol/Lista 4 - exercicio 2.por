programa
{
	inclua biblioteca Util
	
	funcao linha()
	{
		escreva("\n----------------------------------------------------------------------\n")
	}

	funcao inicio()
	{
		inteiro lancamentos[10], maiorValor=0, contador=0
		real media=0.0, somatorio=0.0
	
		para(inteiro x=0; x<10; x++)
		{
			lancamentos[x] = Util.sorteia(1, 6)
			somatorio+=lancamentos[x]
			se( lancamentos[x]>= maiorValor)
			{
				se (lancamentos[x]==maiorValor)
				{
					contador++
				}
				senao
				{
					contador=1
				}
				maiorValor= lancamentos[x]
			}
		}
		para(inteiro x=0; x<10;x++)
		{
			escreva("Lançamento do dado numero ",x+1," o valor  é  igual ",lancamentos[x],"\n\n")
		}
		linha()
		media=somatorio/10
		escreva("A soma dos valores é: ",somatorio)
		escreva("\nA média é dos valores é;   ",media)
		escreva("\nO maior valor foi: ",maiorValor)
		escreva("\nO maior valor se repetiu ",contador," vezes")
		linha()
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */