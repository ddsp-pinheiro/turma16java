package aulas;

import java.util.Scanner;

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 *  psicológicas dos indivíduos de uma região. Para tanto, a cada uma
		 *   das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros)
		 *   , e as opções (1, se a pessoa era calma; 2, se a pessoa era 
		 *   nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema
		 *    que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.

		 */
		
		Scanner ler=  new Scanner (System.in);
		final int pessoas=3;
		int individuo=0;
		int idade, qntMais40=0, qntMenos18=0;
		int sexo,qntF=0, qntM=0,qntO=0;
		int humor, qntCalm=0,qntNerv=0,qntAgre=0;
		
		
		System.out.println("\t\t\t\t\t\t\t PESQUISA PSICOLÓGICA");
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
				
		}System.out.println(qntMais40+" são impar e "+qntMenos18+" são par\n");
	}
}
