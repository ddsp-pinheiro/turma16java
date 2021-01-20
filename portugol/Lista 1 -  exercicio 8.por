programa
{
	
	funcao inicio()
	{
		real precoDeFabrica
		escreva("insira o preço de fabrica: ")
		leia(precoDeFabrica)
		real distribuidor = precoDeFabrica*0.28
		// 0.28 = 28/100
		real impostos	= precoDeFabrica*0.45
		// 0.45 = 45/100
		escreva("o preço para consumidor é de ", precoDeFabrica+distribuidor+impostos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */