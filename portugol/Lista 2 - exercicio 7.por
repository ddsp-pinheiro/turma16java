programa
{
	
	funcao inicio()
	{
		real baseT, alturaT
		escreva ("Digite o valor da base de seu triângulo: ")
		leia(baseT)
		escreva ("Digite o valor da altura de seu triângulo: ")
		leia(alturaT)
		se (alturaT > 0 e baseT > 0)
		{
			escreva("Valores válidos, a área do seu triangulo é ", ((baseT*alturaT)/2))
		}
		senao
		{
			escreva("Valores invalivaidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */