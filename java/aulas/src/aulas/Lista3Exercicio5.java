package aulas;

import java.util.Scanner;

public class Lista3Exercicio5
{
	
	public static void main(String[] args) 
	{
		/*
		 * Crie um programa que leia um número do teclado até que
		 * encontre um número igual a zero. No final,
		 * mostre a soma dos números digitados
		 */
		
		Scanner ler= new Scanner (System.in);
		int x, result=0;
		
		System.out.println("\t\t\t\t\t\t SOMA ENQUANTO NUMERO É DIFERENTE DE 0");
		
		do 
		{
			System.out.println("Digite um numero: ");
			x = ler.nextInt();
			
			result=result+x;	
			
		}
		while(x!=0);
		System.out.print("A soma dos numeros apresentados é "+result+"\n\n");
	}

}
