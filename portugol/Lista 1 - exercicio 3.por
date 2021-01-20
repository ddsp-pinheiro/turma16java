programa
{
	
	funcao inicio()
	{
		inteiro segundos

		escreva("escreva em segundos o tempo de duração do evento na fabrica: ")
		leia (segundos)

		inteiro minutos = segundos/60
		inteiro horas= (minutos%60)/60
		escreva ("seu tempo em segundos é: "+segundos+ "\n seu tempo em minutos é: "+minutos+"\n seu tempo em horas é: "+ horas)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */