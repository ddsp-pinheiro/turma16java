programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		real a, b, c
		escreva("Escreva seu primeiro numero inteiro: ")
		leia(a)
		escreva("Escreva seu segundo valor inteiro: ") 
		leia(b)
		escreva ("Escreva seu segundo valor: ")
		leia(c)
		
		real r = Matematica.potencia(a+b, 2.0)
		real s = Matematica.potencia(b+c, 2.0)
		real d = (r+s)/2.0
		escreva("Seu resultado é ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */