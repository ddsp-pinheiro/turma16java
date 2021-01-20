programa
{
	inclua biblioteca Matematica --> M
	
	funcao inicio()
	{
		inteiro quilosCarregados
		real E,  M = 4.00
		escreva("Escreva a quantidade de quilos tranportados: ")
		leia (quilosCarregados)
			se ( quilosCarregados<50)
			{
				escreva("Execesso = ZERO \nMulta= ZERO")
			}
			senao se ( quilosCarregados-50 == 0.0)
			{
				escreva("Execesso = ZERO \nMulta= ZERO")
				
			}
			senao se (quilosCarregados-50>0.0)
			{
				E = quilosCarregados-50.0
				escreva("Excesso =", E, "\nMulta=", E*M)
			}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */