programa
{
	
	funcao inicio()
	{
		const inteiro t = 3
		
		inteiro matriz[t][t], somaT = 0, somaD = 0

		para(inteiro linha=0; linha<t; linha++)
		{
			para(inteiro coluna=0; coluna<t; coluna++)
			{
				escreva("Entre com o valor da posição [",linha+1,"][",coluna+1,"]: ")
				leia(matriz[linha][coluna])

				somaT+= matriz[linha][coluna]
				
				
		 			se (linha == coluna)
		 			{
		 				somaD += matriz[linha][coluna]
		 			}
		 			
		 	}
		 	escreva("\n")
		}
		escreva("A soma da diagonal principal é ",somaD,"\n")
		escreva("A soma total é ",somaT)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */