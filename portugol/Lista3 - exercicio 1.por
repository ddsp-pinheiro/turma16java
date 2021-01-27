programa
{
	inclua biblioteca Matematica --> mat
	
	funcao linha1()
	{
		escreva("\n________________________________________________________________________\n")
	}
	funcao linha2() 
	{
		escreva("\n------------------------------------------------------------------------\n")
	}
	
	funcao inicio()
	{
		real salario=0.0, totalSalario=0.0, maiorSalario=0.0, totalFilhos=0.0
		real mediaSalario=0.0, mediaFilhos=0.0, percentualSalario100=0.0
		real contadorDe100=0.0
		inteiro filhos=0
		const inteiro habitantes=3

		linha1()
		
		para(inteiro x = 1; x<=habitantes ; x++)
		{
			escreva("informe seu salario habitante ",x,":")
			leia(salario)
			escreva("informe quantos filhos você possui: ")
			leia(filhos)
			
			totalSalario = totalSalario + salario
			totalFilhos += filhos

			se (salario> maiorSalario)
			{
				maiorSalario = salario
			}
			se (salario<=100)
			{
				contadorDe100++
			}
			
			linha2()

		}
		mediaSalario= totalSalario/habitantes
		mediaFilhos= totalFilhos/ habitantes
		percentualSalario100=(contadorDe100/habitantes)*100
		
		escreva("\nMedia salarial: ", mat.arredondar(mediaSalario, 2)) 
		escreva("\nO maior salarioa é: ", maiorSalario)
		escreva("\nPrcentual de pessoas que ganham até 100: ", mat.arredondar(percentualSalario100, 2))
		escreva("\nMedia de filhos: ", mat.arredondar(mediaFilhos, 2))
		
		linha2()
		
		escreva("\nobrigado pela ajuda,ACABOU.")
		
		linha1()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1001; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */