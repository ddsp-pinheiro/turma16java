programa
{
	
	funcao inicio()
	{
		inteiro  total=0 , x
		para (x=1; x<=500; x++)
		{
			se ((x%2)==1 e (x%3)==0)
			{
				total+= x
			}
		}

		escreva("Somando todos os números impares e multiplos de 3 dentro" 
		+ " de um intervalo de 1 à 500 obtem-se o valor de  ",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */