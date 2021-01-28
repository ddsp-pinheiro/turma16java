package aulas;

import java.util.Scanner;

public class WhileTeste 
{
	public static void main(String[] args) {
		
		Scanner ler=  new Scanner (System.in);
		int x=0,media=0,soma=0,qnt=0;
		
		System.out.println("\t\t\tLEITURA DE NUMEROS COM SOMA E MEDIA\nInsira um valor: ");
		
		while (x>=0)
		{
			x = ler.nextInt();
			soma=soma+x;
			qnt++;
			media=soma/qnt;
			System.out.println("\nSua soma é "+soma);
			System.out.println("Sua média é "+ media );
			System.out.println("Totale de elementos somados: "+qnt);
			System.out.println("\nInsira um valor: ");
			
			if(x<0)
			{
				System.out.println("Valor invalido, tente novamente.");
			}
		}	
	}
}
