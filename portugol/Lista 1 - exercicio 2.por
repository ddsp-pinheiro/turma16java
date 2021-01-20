programa
{
	
	funcao inicio()
	{
		inteiro idadePessoa
		//idade em dias
		escreva("escreva a sua idade em dias: ")
		leia(idadePessoa)
		
		inteiro anos =(idadePessoa/ 365)
		inteiro meses =(idadePessoa%365)/30
		inteiro dias = (idadePessoa%365)%30
		
		escreva("sua idade corresponde à: "+"\n"+anos+ " anos \n"+meses+" meses \n" +dias+" dias \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */