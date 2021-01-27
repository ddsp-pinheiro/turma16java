programa
{
	funcao linha()
	{
		escreva("\n--------------------------------------------------------\n")
	}
	funcao inicio()
	{
		inteiro  numero=0
		inteiro soma=0 , media=0, qnt=0
		escreva("Por favor, digite um numero: ")

		enquanto (numero>=0)
		{
			leia(numero)
			soma= soma + numero
			qnt++
			media= soma / qnt
			escreva("Sua soma é: " , soma,"\n")
			escreva("Sua média é: ",media,"\n")
			escreva("A quantidade de números somados até o momento é: ",qnt,"\n")
			linha()
			se (numero>=0)
			{
				escreva("Por favor, digite um novo numero: ")
			}
			
		}
		escreva("Não foi possivel continuar, programa encerrado.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 638; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */