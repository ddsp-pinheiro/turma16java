package aulas;

import java.util.Scanner;

public class Lista3Exercicio3 
{
	/*Solicitar a idade de várias pessoas e imprimir: Total 
	 * de pessoas com menos de 21 anos. Total de pessoas 
	 * com mais de 50 anos. O programa termina 
	 * quando idade for =-99. (WHILE)
	 */
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade, qntMais50=0, qntMenos21=0;
		
		System.out.println("\t\t\t\t\tCONTABILIZA IDADES MENORES QUE 21 E MAIORES QUE 51\n");
		System.out.println("\n###Lembrete: para encerrar sua entrada### \n### e ver seus resultados digite: -99 ###\n");
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				qntMenos21++;
			}
			else if (idade>50)
			{
				qntMais50++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = ler.nextInt();
			
			
		}
		System.out.println("Total de pessoas com menos de 21: "+qntMenos21);
		System.out.println("Total de pessoas com mais de 50: "+qntMais50);
	}
}
