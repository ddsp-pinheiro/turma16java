package aulas;

import java.util.Scanner;

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		 *  psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma
		 *   das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros)
		 *   , e as op��es (1, se a pessoa era calma; 2, se a pessoa era 
		 *   nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema
		 *    que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o n�mero de pessoas calmas; 
			o n�mero de mulheres nervosas; 
			o n�mero de homens agressivos; 
			o n�mero de outros calmos;
			o n�mero de pessoas nervosas com mais de 40 anos; 
			o n�mero de pessoas calmas com menos de 18 anos.

		 */
		
		Scanner ler=  new Scanner (System.in);
		final int pessoas=3;
		int individuo=0;
		int idade, qntMais40=0, qntMenos18=0;
		int sexo,qntF=0, qntM=0,qntO=0;
		int humor, qntCalm=0,qntNerv=0,qntAgre=0;
		
		
		System.out.println("\t\t\t\t\t\t\t PESQUISA PSICOL�GICA");
		System.out.println("Digite sua idade: ");
		idade= ler.nextInt();
		
		while(individuo>=pessoas)
		{
			individuo++;
			if(idade>40) 
			{	
				qntMais40++;	
			}
			else if(idade<18) 
			{
				qntMenos18++;	
			}
				
		}System.out.println(qntMais40+" s�o impar e "+qntMenos18+" s�o par\n");
	}
}
