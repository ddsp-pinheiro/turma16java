programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		real x1, x2, y1, y2 
		escreva("escreva o valor desejado para x1: ")
		leia (x1)
		escreva("escreva o valor desejado para x2: ")
		leia(x2)
		escreva("escreva o valor desejado para y1: ")
		leia(y1)
		escreva("escreva o valor desejado para y2: ")
		leia (y2)

		
		real xxElevado = Matematica.potencia(x2-x1, 2.0)
		real yyElevado = Matematica.potencia(y2-y1, 2.0)
		real xyElevadosSoma = xxElevado + yyElevado
		
		real D = Matematica.raiz(xyElevadosSoma, 2.0)
		escreva("O resultado do seu sistema é: ",D)

	}
		 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */